/******************************************
项目名称：tsmsproject
文件：UserAccessFilter.java
作者：fab
描述：TODO
创建日期：2017年9月25日 上午10:31:42
*******************************************/
package tsms.base.zl.service.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;






import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.service.RightService;

/**
 * @author fab
 *
 */
public class UserAccessFilter implements Filter {
	

	@Autowired
	private RightService  rightService;


	public RightService getRightService() {
		return rightService;
	}

	public void setRightService(RightService rightService) {
		this.rightService = rightService;
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		if (req instanceof HttpServletRequest) {
			HttpServletRequest request = ((HttpServletRequest) req);
			HttpServletResponse response = (HttpServletResponse)res;
			//String URL = ((HttpServletRequest) req).getRequestURI();
			String URL="/tsmsproject/login/index";
			System.out.println("{-------------URL="+URL+"----------------------}");
			String siteURL=((HttpServletRequest) req).getContextPath();
			System.out.println("{-------------siteURL="+siteURL+"----------------------}");
			String relativeURL = extractURL(URL,siteURL); 
			System.out.println("{-------------relativeURL="+relativeURL+"----------------------}");
			String priorURL ;      
			//add by fab 20171109 start  将服务注入进来
			ServletContext context = request.getSession().getServletContext();
			 ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
			 RightService rightService = (RightService) ctx.getBean("rightService");
			//add by fab 20171109 end
			if ( request.getSession().getAttribute("priorURL")==null){
				priorURL="";
			}
			else{
				priorURL = request.getSession().getAttribute("priorURL").toString();
			}
			List funList = rightService.getFunctionInfoUrlValidation(relativeURL);
			Userinfo user = (Userinfo) request.getSession().getAttribute("Userinfo");			
		//	判断URL请求是否需要权限验证
			if(funList.size()>0){// 如果此url请求需要验证
				//用户验证				
				if(user!=null){//session中在在此用户										
					//验证用户是否拥有此访问权限
					List funList1 = rightService.getUserHaveFunctionInfoUrl(user.getUserid().longValue(),relativeURL);
					if(funList1.size()>0){
						rightService.SetUserMenu(user, request,relativeURL);
						request.getSession().setAttribute("priorURL",extractParentURL(URL,siteURL));
						chain.doFilter(req, res);
					}
					else{
						//用户
						if (rightService.getUserHaveFunctionInfoOtherUrl(user.getUserid().longValue(),priorURL,relativeURL)==true){
							rightService.SetUserMenu(user, request,relativeURL);
							chain.doFilter(req, res);
						}
						else{
							response.sendRedirect(siteURL+"/global/error.do?ErrorMsg=global.error.noright");
						}
					}
				}else{// user为空	
					GotoLogin(response,siteURL);
					return;
				}
			}else{// 如果不需要验证
				if (user!=null){
					rightService.SetUserMenu(user, request,relativeURL);
					chain.doFilter(req, res);
				}
				else
				{
					if (relativeURL.equals("/login/index")== true)
					{
						chain.doFilter(req, res);
					}
					else
					{
						GotoLogin(response,siteURL);
					    
						return;
					}
				}
			}
			//判断URL是否需要记录日志 
//			FunctioninfoList funListLog = rightBO.getFunctionInfoUrlLog(relativeURL);
//			if(funListLog.getValues().length>0 && user!=null && user.getIsmakeruser().longValue()!=1){//如果url请求需要记录日志
//				Logrec logrec=new Logrec();
//				logrec.setFunctioninfo(funListLog.getValues()[0]);
//				logrec.setUserinfo(user);
//				logrec.setLogtime(new Date());
//				LogviewBO logviewBO = (LogviewBO) BeanManagerFactory.getBeanManager(BeanSystemName.BMM_System).getBean("bo.LogviewBO");
//				logrec=logviewBO.createLogrec(logrec);
//				}
		}
	}
	
	private String extractURL(String URL,String siteURL) {
		
		String splitURL[] = URL.split("/");
		for(String a:splitURL){
			System.out.println("{-------a=--"+a+"------------}");	
		}	
		String relativeURL = new String();
		if(siteURL!=null && !siteURL.equals("")){
			for(int i=2;i<splitURL.length;i++)
			relativeURL=relativeURL.concat("/"+splitURL[i]);
			
		}else{
			relativeURL=URL;
		}
		
		return relativeURL;
	}
	
	private String getSiteURL(String URL) {
		String splitURL[] = URL.split("/");
		return splitURL[0];
	}
	
	private String extractParentURL(String URL,String siteURL) {
		
		String splitURL[] = URL.split("/");
		String relativeURL = new String();
		if(siteURL!=null && !siteURL.equals("")){
			for(int i=2;i<splitURL.length-1;i++)
			relativeURL=relativeURL.concat("/"+splitURL[i]);
			
		}else{
			relativeURL=URL;
		}
		
		return relativeURL;
	}

	public void destroy() {

	}

	public void init(FilterConfig arg0) throws ServletException {
		
		ApplicationContext applicationContext = null;  

	}
	
	private void GotoLogin(HttpServletResponse response,String siteURL) throws IOException{
		java.io.PrintWriter out = response.getWriter();   
		String s = "window.open ('" + siteURL + "/login/index?ErrorMsg=global.error.timeout','_top')";
	    out.println("<html>");   
	    out.println("<script>");   
	    out.println(s);   
	    out.println("</script>");   
	    out.println("</html>");
	}
	



}

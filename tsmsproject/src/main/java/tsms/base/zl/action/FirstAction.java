/******************************************
项目名称：tsmsproject
文件：FirstAction.java
作者：fab
描述：TODO
创建日期：2017年9月18日 上午11:17:03
*******************************************/
package tsms.base.zl.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tsms.base.zl.pojo.po.Functioninfo;
import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.service.RightService;
import tsms.base.zl.service.UserService;

/**
 * @author fab
 *
 */
@Controller
@RequestMapping("/index")
public class FirstAction {
	@Autowired
	private RightService rightService;
	@Autowired
	private UserService userService;

	// 首页
	@RequestMapping("/first")
	public String first( HttpServletRequest request,Model model) throws Exception{		
		//return"/base/first";	
		String sUrl="/index/first";
		long userId=1L;
		Userinfo user=userService.findUserById(userId);
         /**************************设置菜单start****************************************/
		List<Functioninfo> funList = new ArrayList<Functioninfo>();
		List <Functioninfo>allFunList = new ArrayList<Functioninfo>();
		List<Functioninfo> leftFunList = new ArrayList<Functioninfo>();
		// 得到该用户能够访问的第一层功能 
		funList = rightService.getUserFirstFunctioninfoList(user.getUserid().longValue());
		Functioninfo[] fun1 = rightService.getLoginFatherFunctionInfo();
		//addFunctionInfo(funList, fun1);
		// 得到该用户能够访问的所有功能
		allFunList = rightService.getUserFunctionInfo(user.getUserid().longValue());
		fun1 = (Functioninfo[]) rightService.getLoginBrotherFunctionInfo();
		//addFunctionInfo(allFunList, fun1);
		// 得到页面左边的快捷方式
//		if (sUrl.equals("FirstLogin")) {
//			if (funList.size() > 0) {
//				Functioninfo[] fun = (Functioninfo[]) funList.toArray();
//				leftFunList = rightService.getBrotherFunctionInfo(user.getUserid().longValue(),fun[0].getFunctioninfourl());
//				fun1 = (Functioninfo[]) rightService.getLoginBrotherFunctionInfo();
//				addFunctionInfo(leftFunList, fun1);
//			}
//		} else {
//			leftFunList =rightService.getBrotherFunctionInfo(user.getUserid().longValue(), sUrl);
//		}
//	    model.addAttribute("UserfunList", funList);
//	    model.addAttribute("UserallFunList", allFunList);
	   // model.addAttribute("UserleftFunList", leftFunList);
	    System.out.println("{----a-----"+funList.get(0).getFunctioninfoid()+"------------------}");
	    for(int i=0;i<funList.size();i++){
	    	 System.out.println("{-----b----"+allFunList.get(i).getFunFunctioninfoid()+"------------------}");	
	    }
	    model.addAttribute("firsttree", funList);
	    model.addAttribute("menutrees", allFunList);
	    //model.addAttribute("lefttree", leftFunList);
	    /*****************************************设置菜单end***********************************************/
		//this.SetUserMenu(model,user, request, sUrl);		
		return"right.login.loginfirstpage";	
	}
	//欢迎页面
	@RequestMapping("/welocome")
	public String welocome(Model model){
		return "/base/welcome";
	}
	public void SetUserMenu(Model model,Userinfo user, HttpServletRequest request,String sUrl) {
		// TODO Auto-generated method stub
		List<Functioninfo> funList = new ArrayList<Functioninfo>();
		List <Functioninfo>allFunList = new ArrayList<Functioninfo>();
		List<Functioninfo> leftFunList = new ArrayList<Functioninfo>();
		// 得到该用户能够访问的第一层功能
		funList = rightService.getUserFirstFunctioninfoList(user.getUserid().longValue());
		Functioninfo[] fun1 = rightService.getLoginFatherFunctionInfo();
		addFunctionInfo(funList, fun1);
		// 得到该用户能够访问的所有功能
		allFunList = rightService.getUserFunctionInfo(user.getUserid().longValue());
		fun1 = (Functioninfo[]) rightService.getLoginBrotherFunctionInfo();
		addFunctionInfo(allFunList, fun1);
		// 得到页面左边的快捷方式
		if (sUrl.equals("FirstLogin")) {
			if (funList.size() > 0) {
				Functioninfo[] fun = (Functioninfo[]) funList.toArray();
				leftFunList = rightService.getBrotherFunctionInfo(user.getUserid().longValue(),fun[0].getFunctioninfourl());
				fun1 = (Functioninfo[]) rightService.getLoginBrotherFunctionInfo();
				addFunctionInfo(leftFunList, fun1);
			}
		} else {
			leftFunList =rightService.getBrotherFunctionInfo(user.getUserid().longValue(), sUrl);
		}
	for(int i=0;i<funList.size();i++){
		System.out.println("-----------------"+funList.get(i).getFunctioninfoid()+"--------------------------");
	}
	    model.addAttribute("UserfunList", funList);
	    model.addAttribute("UserallFunList", allFunList);
	    model.addAttribute("UserallFunList", allFunList);
	    model.addAttribute("UserleftFunList", leftFunList);
	    model.addAttribute("firsttree", funList);
	    model.addAttribute("menutrees", allFunList);
	    model.addAttribute("lefttree", leftFunList);

		//request.getSession().setAttribute("UserfunList", funList);
		//request.getSession().setAttribute("UserallFunList", allFunList);
		//request.getSession().setAttribute("UserleftFunList", leftFunList);
//		request.setAttribute("firsttree", funList);
//		request.setAttribute("menutrees", allFunList);
//		request.setAttribute("lefttree", leftFunList);
		//setUserName(user, request);
		//********** 读取运行单位、系统名称和版本号set到页面 add by tlb 临时 **************//*
		// OrganBO organBO = (OrganBO)
		// BeanManagerFactory.getBeanManager(BeanSystemName.BMM_System).getBean("bo.OrganBO");
		// ParameterBO parameterBO = (ParameterBO)
		// BeanManagerFactory.getBeanManager(BeanSystemName.BMM_System).getBean("bo.ParameterBO");
		// Organ[] organ = organBO.getOrgans(0,Integer.MAX_VALUE).getValues();
		// request.setAttribute("OrganName", organ[0].getOrganname());
		// request.setAttribute("SoftName", parameterBO.getSoftName());
		// request.setAttribute("SoftType", parameterBO.getSoftType());
		// request.setAttribute("CopyRight", parameterBO.getCopyRight());
		//********************************************************//*
	}
	private void addFunctionInfo(List funList, Functioninfo[] funAdd) {
		int i = 0, j = 0, k = 0, l = 0;
		int nCount;
		boolean bAdd;
		Functioninfo[] funNeedAdd = new Functioninfo[funAdd.length];
		Object[] fun =(Object[]) funList.toArray();
		j = fun.length;
		for (i = 0; i < funAdd.length; i++) {
			bAdd = true;
			for (k = 0; k < fun.length; k++) {
				if (fun[k].equals(funAdd[i]) == true) {
					bAdd = false;
					break;
				}
			}
			if (bAdd == true) {
				funNeedAdd[l] = funAdd[i];
				l++;
			}
		}
		if (l > 0) {

			nCount = fun.length + funNeedAdd.length;
			Functioninfo[] funAll = new Functioninfo[nCount];
			for (i = 0; i < fun.length; i++) {
				funAll[i] = (Functioninfo) fun[i];
			}
			j = fun.length;
			for (i = 0; i < funNeedAdd.length; i++) {
				funAll[j + i] = funNeedAdd[i];
			}
			// funList.setValues(funAll);
			funList.add(funAll);
		}
	}
	
}

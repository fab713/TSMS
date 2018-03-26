/******************************************
项目名称：tsmsproject
文件：LoginInterceptor.java
作者：fab
描述：TODO
创建日期：2017年9月25日 上午11:30:13
*******************************************/
package tsms.base.zl.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import tsms.base.zl.pojo.vo.ActiveUser;
import tsms.base.zl.process.context.Config;


/**
 * @author fab
 *
 */
public class LoginInterceptor implements HandlerInterceptor {
	// 执行时机：进入action方法之前执行
	// 使用场景：用于用户认证、用户授权拦截
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("444444444444444444");
		// 校验用户身份是否合法
		HttpSession session = request.getSession();
		ActiveUser activeUser = (ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
		if (activeUser != null) {
			// 用户已经登陆，放行
			return true;
		}
		// 拦截用户操作，跳转到登陆页面
		request.getRequestDispatcher("/WEB-INF/jsp/base/login.jsp").forward(request, response);
		return false;
	}
	// 执行时机：进入action方法，在返回modelAndView之前执行
	// 使用场景：在这里统一对返回数据进行处理，比如统一添加菜单 导航
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}
	// 执行时机:action方法执行完成，已经 返回modelAndView，执行。
	// 使用场景：统一处理系统异常，在这里统一记录系统日志
	// ，监控action方法执行时间，在preHandle记录开始时间，在afterCompletion记录结束时间
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}

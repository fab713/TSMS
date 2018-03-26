/******************************************
项目名称：tsmsproject
文件：LoginAction.java
作者：fab
描述：TODO
创建日期：2017年6月15日 下午7:58:50
 *******************************************/
package tsms.base.zl.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.vo.ActiveUser;
import tsms.base.zl.process.context.Config;
import tsms.base.zl.process.result.ResultUtil;
import tsms.base.zl.process.result.SubmitResultInfo;
import tsms.base.zl.service.RightService;
import tsms.base.zl.service.UserService;

/**
 * @author fab
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginAction {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RightService rightService;

	// 用户登录页面
	@RequestMapping("/index")
	public String index(Model model) throws Exception {
		// 数据获取传到页面
		return "/base/login";
	}

	// 用户登录提交
	@RequestMapping("/loginSubmit")
	public @ResponseBody SubmitResultInfo loginSubmit(HttpSession session, String userid,
			String pwd, String validateCode) throws Exception {
		// 校验验证码
		String validateCode_session = (String) session.getAttribute("validateCode");
		if (validateCode_session != null && validateCode_session.equals(validateCode)) {
			// 验证码输入错误
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 113,null));
		}
//		 userid="admin";
//		 pwd="admin";
		Userinfo userinfo=new Userinfo();
		userinfo=userService.validateUser(userid, pwd);
		session.setAttribute("userinfo", userinfo);
		ActiveUser activeUser=new ActiveUser();
		activeUser.setUserid(userinfo.getUserloginid());
		activeUser.setUsername(userinfo.getUsername());
		// service，用户认证
		// ActiveUser activeUser = userService.checkUserInfo(userid, pwd);
	  // 将用户身份信息写入session
		session.setAttribute("activeUser", activeUser);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 107, new Object[] { "" }));
	}

	// 退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		// session过期
		session.invalidate();
		System.out.println("4444444444444444444");
		return "redirect:/login/index";
	}

}

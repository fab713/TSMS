/******************************************
项目名称：tsmsproject
文件：RightService.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 下午1:55:21
 *******************************************/
package tsms.base.zl.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import tsms.base.zl.pojo.po.Functioninfo;
import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.vo.FunctioninfoCustom;
import tsms.base.zl.pojo.vo.UserinfoCustom;





/**
 * @author fab
 * 
 */
public interface RightService {
	// 得到某一用户的第一层功能
	public List<Functioninfo> getUserFirstFunctioninfoList(Long userId);

	// 得到某一用户的某一父亲功能的子层功能
	//public List getUserChildFunctionInfoByFather( Long userId,Long fatherId);
	public List getUserChildFunctionInfoByFather( UserinfoCustom userinfoCustom);

	// 得到某一用户的所有功能
	public List <Functioninfo>getUserFunctionInfo(Long userId);

	// 得到某一用户的是否有访问某一URL的权利

	public List <Functioninfo>getUserHaveFunctionInfoUrl(Long userId, String sUrl);

	// 得到某一用户的是否有通过某一个URL访问另一个URL的权利
	public boolean getUserHaveFunctionInfoOtherUrl(Long userId,
			String priorURL, String sUrl);
	// 得到功能是否需要记录日志
	public List <Functioninfo>getFunctionInfoUrlLog(String sUrl);

	// 得到功能是否需要权限验证
	public List <Functioninfo>getFunctionInfoUrlValidation(String sUrl);

	// 得到某一用户的shortcut项
	public List <Functioninfo>getUserShortCutFunctionInfo(Long userId);
	
	// 得到某一功能的兄弟项，并且是shortcut项
	public List<Functioninfo>getBrotherFunctionInfo(Long userId, String sUrl);

	// 设定用户菜单和系统名称、版本信息
	public void SetUserMenu(Userinfo user, HttpServletRequest request,String sUrl);

	// 得到login项父功能记录
	public Functioninfo[] getLoginFatherFunctionInfo();

	// 得到login兄弟功能记录
	public Functioninfo[] getLoginBrotherFunctionInfo();




	// public FunctioninfoList queryUserFunctioninfo(String queryName,Map
	// queryValue);
	// public FunctioninfoList queryUserFunctioninfo(String sqlString);
	// public FunctioninfoList getUserFirstFunctioninfoList(Long userId);
	// public FunctioninfoList getUserChildFunctionInfoByFather(Long
	// fatherId,Long userId);
	// public FunctioninfoList getUserFunctionInfo(Long userId);
	// public FunctioninfoList getUserHaveFunctionInfoUrl(Long userId,String
	// sUrl);
	// public boolean getUserHaveFunctionInfoOtherUrl(Long userId,String
	// priorURL,String sUrl);
	// public FunctioninfoList getFunctionInfoUrlValidation(String sUrl);
	// public FunctioninfoList getFunctionInfoUrlLog(String sUrl);
	// public void SetUserMenu(Userinfo user,HttpServletRequest request,String
	// sUrl);
	// public FunctioninfoList getUserShortCutFunctionInfo(Long userId);
	// public FunctioninfoList getBrotherFunctionInfo(Long userId,String sUrl);
	// public Functioninfo[] getLoginBrotherFunctionInfo();
	// public Functioninfo[] getLoginFatherFunctionInfo();
}

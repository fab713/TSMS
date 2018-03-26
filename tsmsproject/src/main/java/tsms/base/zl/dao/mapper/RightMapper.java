/******************************************
项目名称：tsmsproject
文件：RightMapper.java
作者：hspcadmin
描述：TODO
创建日期：2017年9月18日 下午4:47:52
*******************************************/
package tsms.base.zl.dao.mapper;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;

import tsms.base.zl.pojo.po.Functioninfo;
import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.vo.UserinfoCustom;



/**
 * @author hspcadmin
 *
 */
public interface RightMapper {
	
	public List queryUserFunctioninfo(String queryName,Map queryValue);
	public List queryUserFunctioninfo(String sqlString);
	
	public List <Functioninfo>getUserFirstFunctioninfoList(@Param("userId") Long userId);
	//public List getUserChildFunctionInfoByFather(Long userId,Long fatherId);
	public List  getUserChildFunctionInfoByFather(UserinfoCustom userinfoCustom);
	public List <Functioninfo>getUserFunctionInfo(@Param("userId") Long userId);
	public List <Functioninfo>getUserHaveFunctionInfoUrl(@Param("userId")Long userId,@Param("sUrl")String sUrl);
	public boolean getUserHaveFunctionInfoOtherUrl(Long userId,String priorURL,String sUrl);
	public List <Functioninfo>getFunctionInfoUrlLog(@Param("sUrl")String sUrl);
	public List <Functioninfo>getFunctionInfoUrlValidation(@Param("sUrl")String sUrl);
	public List <Functioninfo>getUserShortCutFunctionInfo(@Param("userId")Long userId);
	public List <Functioninfo>getBrotherFunctionInfo(@Param("userId")Long userId,@Param("sUrl")String sUrl);	
	public Functioninfo[] getLoginBrotherFunctionInfo();
	public Functioninfo[] getLoginFatherFunctionInfo();
	
	public void SetUserMenu(Userinfo user,HttpServletRequest request,String sUrl);	
	
	
	
	
	
	
//	public FunctioninfoList queryUserFunctioninfo(String queryName,Map queryValue);
//	public FunctioninfoList queryUserFunctioninfo(String sqlString);
//	public FunctioninfoList getUserFirstFunctioninfoList(Long userId);
//	public FunctioninfoList getUserChildFunctionInfoByFather(Long fatherId,Long userId);
//	public FunctioninfoList getUserFunctionInfo(Long userId);
//	public FunctioninfoList getUserHaveFunctionInfoUrl(Long userId,String sUrl);
//	public boolean getUserHaveFunctionInfoOtherUrl(Long userId,String priorURL,String sUrl);
//	public FunctioninfoList getFunctionInfoUrlValidation(String sUrl);
//	public FunctioninfoList getFunctionInfoUrlLog(String sUrl);
//	public void SetUserMenu(Userinfo user,HttpServletRequest request,String sUrl);	
//	public FunctioninfoList getUserShortCutFunctionInfo(Long userId);
//	public FunctioninfoList getBrotherFunctionInfo(Long userId,String sUrl);	
//	public Functioninfo[] getLoginBrotherFunctionInfo();
//	public Functioninfo[] getLoginFatherFunctionInfo();

}

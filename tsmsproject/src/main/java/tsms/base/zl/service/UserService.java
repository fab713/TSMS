/******************************************
项目名称：tsmsproject
文件：UserService.java
作者：fab
描述：TODO
创建日期：2017年6月16日 上午11:42:10
 *******************************************/
package tsms.base.zl.service;

import java.util.List;
import java.util.Map;

import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.vo.UserinfoCustom;
import tsms.base.zl.pojo.vo.UserinfoQueryVo;







/**
 * @author fab
 * 
 */
public interface UserService {

	// 根据用户id查询用户信息
	public Userinfo findUserById(long userId) throws Exception;

	public void createUser(UserinfoCustom userinfoCustom) throws Exception;

	public void updateUser(Userinfo userinfo) throws Exception;

	public void deleteUser(long userId) throws Exception;
	
	public boolean userValidate(String userLoginId, String userPass) throws Exception;
	public List<UserinfoCustom> findUserinfoList(UserinfoQueryVo userinfoQueryVo)throws Exception;
	public int  findUserinfoCount(UserinfoQueryVo userinfoQueryVo)throws Exception;
	
	public UserinfoCustom findSysUserById(long id) throws Exception;
	
	public void updateSysuser(long id, UserinfoCustom userinfoCustom)throws Exception;
	
	public Userinfo validateUser(String userLoginId, String userPass) throws Exception;

	// public Userinfo createUser(Userinfo Userinfo);
	//
	// public Userinfo updateUser(Userinfo Userinfo);
	//
	// public Userinfo getUser(long UserId)
	// throws ObjectNotFoundException;
	//
	// public void deleteUser(long UserId);
	//
	// public UserinfoList getUsers(int start, int max);
	//
	// public Userinfo[] listAllUser();
	// public Userinfo getUser(String tempParams, Map args);
	// public boolean userValidate(String userLoginId, String userPass);
	// public UserinfoList getUserName(String queryName,Map queryValue);
	// public UserinfoList getAllNonMakeUsers();
	// public UserinfoList getAllNonMakeUsers(int start, int max);

}

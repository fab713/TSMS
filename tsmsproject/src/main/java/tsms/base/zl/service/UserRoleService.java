/******************************************
项目名称：tsmsproject
文件：UserroleService.java
作者：fab
描述：TODO
创建日期：2017年6月16日 下午1:51:04
 *******************************************/
package tsms.base.zl.service;

import java.util.List;
import java.util.Map;

import tsms.base.zl.pojo.po.Userrole;





/**
 * @author fab
 * 
 */
public interface UserRoleService {
	
	public Userrole getUserrole(long userroleId) throws Exception;

	public void createUserrole(Userrole userrole) throws Exception;

	public void updateUserrole(Userrole userrole) throws Exception;

	public void deleteUserrole(long userroleId);
	
	public List<Userrole> getUserHaveRole(Long userId);
	
	public List<Userrole> getWhoHasThisRole(Long roleId);
	
	

//	public UserroleList getUserroles(int start, int max);
//
//	public UserroleList queryUserRole(String queryName, Map queryValue);
//
//	public UserroleList getUserHaveRole(Long userId);
//
//	public UserroleList getWhoHasThisRole(Long roleId);
//
//	public Userrole[] addUserroleAll(Userrole[] userRoleAll);
//
//	public void deleteUserroleAll(Userrole[] userRoleAll);

}

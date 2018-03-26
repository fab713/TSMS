/******************************************
项目名称：tsmsproject
文件：RoleService.java
作者：hspcadmin
描述：fab
创建日期：2017年6月16日 下午1:49:44
 *******************************************/
package tsms.base.zl.service;

import java.util.List;
import java.util.Map;

import tsms.base.zl.pojo.po.Role;



/**
 * @author fab
 * 
 */
public interface RoleService {
	
	public void deleteRole(long RoleId) throws Exception;

	public void createRole(Role role) throws Exception;

	public void updateRole(Role role) throws Exception;

	public Role getRole(long RoleId) throws Exception;
	
	public List<Role> getAllRoleList()throws Exception;
	
	public List<Role>finAllRole() throws Exception;
	

	// public RoleList getRoles(int start, int max) throws Exception;
	// public Role[] listAllRole() throws Exception;
	// public RoleList getRole(String queryName,Map queryValue) throws
	// Exception;
	//
	// public RoleList getAllNonMakeRoles() throws Exception;
	// public RoleList getAllNonMakeRoles(int start, int max) throws Exception;

}

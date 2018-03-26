/******************************************
项目名称：tsmsproject
文件：RolefunctionService.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 下午1:52:38
 *******************************************/
package tsms.base.zl.service;

import java.util.List;
import java.util.Map;

import tsms.base.zl.pojo.po.Rolefunction;





/**
 * @author fab
 * 
 */
public interface RolefunctionService {

	public Rolefunction getRolefunction(long rolefunctionId) throws Exception;

	public void createRolefunction(Rolefunction rolefunction)  throws Exception;

	public void updateRolefunction(Rolefunction rolefunction)  throws Exception;

	public void deleteRolefunction(long rolefunctionId) throws Exception;
	
	public List<Rolefunction> listAllRolefunction() throws Exception;

	// public RolefunctionList getRolefunctions(int start, int max);
	// public Rolefunction[] listAllRolefunction();
	//
	// public RolefunctionList queryRolefunctioninfo(String queryName,Map
	// queryValue);
	 public List<Rolefunction> getRoleHaveFunctionInfo(Long roleId);
	//
	// public Rolefunction[] addRolefunctionAll(Rolefunction[] roleFunctionAll);
	// public void deleteRolefunctionAll(Rolefunction[] roleFunctionAll);
	//
	// public Rolefunction modifyRolefunctionurl(Rolefunction rolefunction);
	// public Rolefunction[] modifyRolefunctionurlAll(Rolefunction[]
	// roleFunctionAll);
}

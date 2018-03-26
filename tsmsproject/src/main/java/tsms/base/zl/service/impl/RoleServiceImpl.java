/******************************************
项目名称：tsmsproject
文件：RoleServiceImpl.java
作者：fab
描述：角色基本服务实现类
创建日期：2017年6月16日 下午1:50:12
*******************************************/
package tsms.base.zl.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;












import tsms.base.zl.dao.mapper.RoleMapper;
import tsms.base.zl.pojo.po.Role;
import tsms.base.zl.pojo.po.RoleExample;
import tsms.base.zl.service.RoleService;


/**
 * @author fab
 *
 */
@Transactional
@Service("RoleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	
	@Override
	public Role getRole(long RoleId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("--------55555555555555555---------------");
		RoleExample  roleExample=new RoleExample();
		RoleExample.Criteria  criteria=roleExample.createCriteria();
		criteria.andRoleidEqualTo(BigDecimal.valueOf(RoleId));
		List<Role>list =roleMapper.selectByExample(roleExample);
		if(list!=null&&list.size()==1){
			return list.get(0);
		}
		return null;
	}


	@Override
	public void deleteRole(long RoleId) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void createRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Role> getAllRoleList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Role> finAllRole() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}





	
	

}

/******************************************
项目名称：tsmsproject
文件：UserRoleServiceImpl.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 下午1:51:46
 *******************************************/
package tsms.base.zl.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tsms.base.zl.dao.mapper.UserroleMapper;
import tsms.base.zl.pojo.po.Userrole;
import tsms.base.zl.pojo.po.UserroleExample;
import tsms.base.zl.service.UserRoleService;

/**
 * @author fab
 * 
 */
public class UserRoleServiceImpl implements UserRoleService {
	@Autowired
	private UserroleMapper userroleMapper;

	@Override
	public Userrole getUserrole(long userroleId) throws Exception {
		// TODO Auto-generated method stub
		return userroleMapper.selectByPrimaryKey(BigDecimal.valueOf(userroleId));
	}

	@Override
	public void createUserrole(Userrole userrole) throws Exception {
		// TODO Auto-generated method stub
		userroleMapper.insert(userrole);
	}

	@Override
	public void updateUserrole(Userrole userrole) throws Exception {
		// TODO Auto-generated method stub
		userroleMapper.updateByPrimaryKey(userrole);

	}

	@Override
	public void deleteUserrole(long userroleId) {
		// TODO Auto-generated method stub
		userroleMapper.deleteByPrimaryKey(BigDecimal.valueOf(userroleId));

	}

	@Override
	public List<Userrole> getUserHaveRole(Long userId) {
		// TODO Auto-generated method stub
		UserroleExample  userroleExample=new UserroleExample();
		UserroleExample.Criteria  criteria=userroleExample.createCriteria();		
		criteria.andRoleidEqualTo(BigDecimal.valueOf(userId));
		List<Userrole>UserRoleList=userroleMapper.selectByExample(userroleExample);
		return UserRoleList;
	}

	@Override
	public List<Userrole> getWhoHasThisRole(Long roleId) {
		// TODO Auto-generated method stub
		UserroleExample  userroleExample=new UserroleExample();
		UserroleExample.Criteria  criteria=userroleExample.createCriteria();		
		criteria.andRoleidEqualTo(BigDecimal.valueOf(roleId));
		List<Userrole>list=userroleMapper.selectByExample(userroleExample);
		return list;
	}

}

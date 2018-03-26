/******************************************
项目名称：tsmsproject
文件：RolefunctionServiceImpl.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 下午1:52:55
*******************************************/
package tsms.base.zl.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tsms.base.zl.dao.mapper.RolefunctionMapper;
import tsms.base.zl.pojo.po.Rolefunction;
import tsms.base.zl.pojo.po.RolefunctionExample;
import tsms.base.zl.service.RolefunctionService;

/**
 * @author fab
 *
 */
public class RolefunctionServiceImpl implements RolefunctionService {
	@Autowired
	private RolefunctionMapper  rolefunctionMapper;

	@Override
	public Rolefunction getRolefunction(long rolefunctionId) throws Exception {
		// TODO Auto-generated method stub
		
		return rolefunctionMapper.selectByPrimaryKey(BigDecimal.valueOf(rolefunctionId));
	}

	@Override
	public void createRolefunction(Rolefunction rolefunction) throws Exception {
		// TODO Auto-generated method stub
		
		rolefunctionMapper.insert(rolefunction);
		
	}

	@Override
	public void updateRolefunction(Rolefunction rolefunction) throws Exception {
		// TODO Auto-generated method stub
		rolefunctionMapper.updateByPrimaryKey(rolefunction);
		
	}

	@Override
	public void deleteRolefunction(long rolefunctionId) throws Exception {
		// TODO Auto-generated method stub
		
		rolefunctionMapper.deleteByPrimaryKey(BigDecimal.valueOf(rolefunctionId));
	}

	@Override
	public List<Rolefunction> listAllRolefunction() throws Exception {
		// TODO Auto-generated method stub
		RolefunctionExample  rolefunctionExample=new RolefunctionExample();
		return rolefunctionMapper.selectByExample(rolefunctionExample);
	}

	@Override
	public List<Rolefunction> getRoleHaveFunctionInfo(Long roleId) {
		// TODO Auto-generated method stub
		RolefunctionExample  rolefunctionExample=new RolefunctionExample();
		RolefunctionExample.Criteria  Criteria=rolefunctionExample.createCriteria();
		Criteria.andRoleidEqualTo(BigDecimal.valueOf(roleId));
		List<Rolefunction>list=rolefunctionMapper.selectByExample(rolefunctionExample);
		return list;
	}

}

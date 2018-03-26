/******************************************
项目名称：tsmsproject
文件：FunctioninfoServiceImpl.java
作者：fab
描述：TODO
创建日期：2017年6月16日 下午1:54:35
*******************************************/
package tsms.base.zl.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tsms.base.zl.dao.mapper.FunctioninfoMapper;
import tsms.base.zl.pojo.po.Functioninfo;
import tsms.base.zl.pojo.po.FunctioninfoExample;
import tsms.base.zl.service.FunctioninfoService;

/**
 * @author fab
 *
 */
public class FunctioninfoServiceImpl implements FunctioninfoService {
	@Autowired
	private FunctioninfoMapper  functioninfoMapper;

	@Override
	public Functioninfo getFunctioninfo(long functioninfoId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createFunctioninfo(Functioninfo functioninfo) throws Exception {
		// TODO Auto-generated method stub
		functioninfoMapper.insert(functioninfo);
	}

	@Override
	public void updateFunctioninfo(Functioninfo functioninfo) throws Exception {
		// TODO Auto-generated method stub
		functioninfoMapper.updateByPrimaryKeySelective(functioninfo);
		
	}

	@Override
	public void deleteFunctioninfo(long functioninfoId) throws Exception {
		// TODO Auto-generated method stub
		
		
		functioninfoMapper.deleteByPrimaryKey(BigDecimal.valueOf(functioninfoId));
		
	}

	@Override
	public List<Functioninfo> listAllFunctioninfo() throws Exception {
		// TODO Auto-generated method stub
		FunctioninfoExample functioninfoExample=new FunctioninfoExample();
		List<Functioninfo> list=functioninfoMapper.selectByExample(functioninfoExample);
		return list;
	}

}

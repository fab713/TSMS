/******************************************
项目名称：tsmsproject
文件：UserServiceImpl.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 上午11:48:00
 *******************************************/
package tsms.base.zl.service.impl;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import tsms.base.zl.dao.mapper.UserinfoMapper;
import tsms.base.zl.dao.mapper.UserinfoMapperCustom;
import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.po.UserinfoExample;
import tsms.base.zl.service.UserService;
import tsms.base.zl.pojo.vo.UserinfoCustom;
import tsms.base.zl.pojo.vo.UserinfoQueryVo;
import tsms.base.zl.process.context.Config;
import tsms.base.zl.process.result.ResultUtil;





/**
 * @author fab
 * 
 */
public class UserServiceImpl implements UserService {
	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Autowired
	private UserinfoMapperCustom  userinfoMapperCustom;

	/**
	 * 根据用户id查询用户信息
	 */
	@Override
	public Userinfo findUserById(long userId) throws Exception {
		// TODO Auto-generated method stub
		UserinfoExample userinfoExample=new UserinfoExample();
		UserinfoExample.Criteria  criteria=userinfoExample.createCriteria();
		criteria.andUseridEqualTo(BigDecimal.valueOf(userId));
		List <Userinfo>list=userinfoMapper.selectByExample(userinfoExample);
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;
	}
/**
 * 新增用户 
 */
	@Override
	public void  createUser(UserinfoCustom userinfoCustom) throws Exception{
		// TODO Auto-generated method stub
		Userinfo userinfo=new Userinfo();
		userinfo=this.findUserById(userinfoCustom.getUserid().longValue());
		if(userinfo!=null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 213,
					null));
		}
		//System.out.println("{------------"+UUIDBuild.getUUID()+"----------------------------}");
		//userinfoCustom.setUserid(BigDecimal.valueOf(Long.parseLong(UUIDBuild.getUUID())));
		//userinfoCustom.setUserpass(new MD5().getMD5ofStr(userinfoCustom.getUserpass()));	//加密
		userinfoCustom.setUserloginid(userinfoCustom.getUserpass()); //登录名
		userinfoCustom.setUserpass(userinfoCustom.getUserpass());
		userinfoMapper.insert(userinfoCustom);
	}

	@Override
	public void updateUser(Userinfo userinfo) throws Exception{
		// TODO Auto-generated method stub
		
		userinfoMapper.updateByPrimaryKey(userinfo);
		
	}
/**
 * 删除用户
 */
	@Override
	public void deleteUser(long userId) throws Exception{
		// TODO Auto-generated method stub		
		//校验是否存在
		Userinfo userinfo=new Userinfo();
		userinfo=userinfoMapper.selectByPrimaryKey(BigDecimal.valueOf(userId));
		if(userinfo==null){
			// 用户不存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 212,null));
		}
		userinfoMapper.deleteByPrimaryKey(BigDecimal.valueOf(userId));
	}

	@Override
	public boolean userValidate(String userLoginId, String userPass) throws Exception {
		// TODO Auto-generated method stub
		UserinfoExample userinfoExample=new UserinfoExample();
		UserinfoExample.Criteria criteria=userinfoExample.createCriteria();
		criteria.andUserpassEqualTo(userPass);
		criteria.andUserloginidEqualTo(userLoginId);
		List<Userinfo>list=userinfoMapper.selectByExample(userinfoExample);
		if(list.size()==1){
			return true;
		}
		return false;
	}
	/**
	 * 查询列表
	 */
	@Override
	public List<UserinfoCustom> findUserinfoList(UserinfoQueryVo userinfoQueryVo ) throws Exception {
		// TODO Auto-generated method stub
		return userinfoMapperCustom.findUserinfoList(userinfoQueryVo);
	}
	/**
	 * 查询列表总记录条数
	 */
	@Override
	public int findUserinfoCount(UserinfoQueryVo userinfoQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return userinfoMapperCustom.findUserinfoCount(userinfoQueryVo);
	}
	/**
	 * 根据用户id获得用户信息
	 */
	@Override
	public UserinfoCustom findSysUserById(long id) throws Exception {
		// TODO Auto-generated method stub
		Userinfo userinfo=userinfoMapper.selectByPrimaryKey(BigDecimal.valueOf(id));
		UserinfoCustom userinfoCustom=new UserinfoCustom();
		BeanUtils.copyProperties(userinfo, userinfoCustom);
		return userinfoCustom;
	}
	/**
	 * 更新用户信息
	 */
	@Override
	public void updateSysuser(long id, UserinfoCustom userinfoCustom)
			throws Exception {
		// TODO Auto-generated method stub
		// 页面提交的账号可能是用户修改的账号
		long userid_page =userinfoCustom.getUserid().longValue();
		System.out.println("{--------------"+userinfoCustom.getIsmakeruser()+"-------------}");		
		// 数据库中的账号是用户原始账号
		// 通过id查询数据库
		Userinfo userinfo=userinfoMapper.selectByPrimaryKey(BigDecimal.valueOf(id));
		if(null==userinfo){
			throw new Exception("找不到要修改用户信息");
		}
		// 用户原始账号
		long userid =userinfo.getUserid().longValue();
		if(!(userid_page==userid)){
			// 通过页面提交的账号查询数据库，如果查到说明暂用别人的账号
			Userinfo userinfo2=this.findUserById(userid_page);
			if (userinfo2 != null) {
				// 说明暂用别人的账号
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,213, null));
			}
		}
		// 设置更新用户信息
		// 调用mapper更新用户
		// 使用updateByPrimaryKey更新，要先查询用户
		Userinfo userinfo_update=userinfoMapper.selectByPrimaryKey(BigDecimal.valueOf(id));
		userinfo_update.setUserid(userinfoCustom.getUserid());
		userinfo_update.setUserloginid(userinfo.getUserloginid());
		userinfo_update.setUsername(userinfoCustom.getUsername());
		if(null==userinfoCustom.getIsmakeruser() ||" ".equals(userinfoCustom.getIsmakeruser())){
			userinfo_update.setIsmakeruser(userinfo.getIsmakeruser());
		}
		else{
			userinfo_update.setIsmakeruser(userinfoCustom.getIsmakeruser());
		}
		userinfo_update.setUserpass(userinfoCustom.getUserpass());
		userinfo_update.setUseremail(userinfoCustom.getUseremail());
		//userinfo_update.setUserloginid(userinfoCustom.getUsername());
		userinfo_update.setUsersex(userinfoCustom.getUsersex());		
		userinfo_update.setCellphone(userinfoCustom.getCellphone());
		//BeanUtils.copyProperties(userinfoCustom, userinfo_update);
		userinfoMapper.updateByPrimaryKey(userinfo_update);		
	}
	/**
	 * 获得登录用户信息
	 */
	@Override
	public Userinfo validateUser(String userLoginId, String userPass) throws Exception {
		// TODO Auto-generated method stub
		UserinfoExample userinfoExample=new UserinfoExample();
		UserinfoExample.Criteria criteria=userinfoExample.createCriteria();
		criteria.andUserpassEqualTo(userPass);
		criteria.andUserloginidEqualTo(userLoginId);
		List<Userinfo>list=userinfoMapper.selectByExample(userinfoExample);
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		
		return null;
	}

}

/******************************************
项目名称：tsmsproject
文件：RightServiceImpl.java
作者：fab
描述：系统权限服务实现
创建日期：2017年6月16日 下午1:55:47
 *******************************************/
package tsms.base.zl.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;








import tsms.base.zl.dao.mapper.RightMapper;
import tsms.base.zl.pojo.po.Functioninfo;
import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.vo.FunctioninfoCustom;
import tsms.base.zl.pojo.vo.UserinfoCustom;
import tsms.base.zl.service.RightService;
/**
 * @author fab
 * 
 */
public class RightServiceImpl implements RightService {

	@Autowired
	private RightMapper rightMapper;
	
//	@Autowired
//	private OrganMapper organMapper;

  /**
	 * 得到某一用户的第一层功能
	 * 测试通过
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List <Functioninfo>getUserFirstFunctioninfoList(Long userId) {
		return rightMapper.getUserFirstFunctioninfoList(userId);
	}

	/**
	 * 得到某一用户的某一父亲功能的子层功能
	 *  测试通过
	 */
	@Override
	public List getUserChildFunctionInfoByFather(UserinfoCustom userinfoCustom) {
		// TODO Auto-generated method stub
		return rightMapper.getUserChildFunctionInfoByFather(userinfoCustom);

	}

/**
	 * 得到某一用户的所有功能
	 *  测试通过
	 */
	@Override
	public List<Functioninfo> getUserFunctionInfo(Long userId) {
		// TODO Auto-generated method stub
		return rightMapper.getUserFunctionInfo(userId);
	}

/**
	 * 得到某一用户的是否有访问某一URL的权利
	 * 测试通过
	 */
	@Override
	public List <Functioninfo>getUserHaveFunctionInfoUrl(Long userId, String sUrl) {
		// TODO Auto-generated method stub
		return rightMapper.getUserHaveFunctionInfoUrl(userId, sUrl);
	}

	/**
	 * 得到某一用户的是否有通过某一个URL访问另一个URL的权利
	 */
	@Override
	public boolean getUserHaveFunctionInfoOtherUrl(Long userId,
			String priorURL, String sUrl) {
		// TODO Auto-generated method stub
		List funlist = getUserHaveFunctionInfoUrl(userId, priorURL);
		Functioninfo[] fun = (Functioninfo[]) funlist.toArray();
		int i;
		boolean bFind = false;
		for (i = 0; i < fun.length - 1; i++) {
			if (fun[i].getOtherurl().contains(sUrl) == true) {
				bFind = true;
				break;
			}
		}
		return bFind;
	}
	/**
	 * 得到功能是否需要记录日志
	 * 测试通过
	 */
	@Override
	public List <Functioninfo>getFunctionInfoUrlLog(String sUrl) {
		// TODO Auto-generated method stub
		return rightMapper.getFunctionInfoUrlLog(sUrl);
	}
	
	/**
	 * 得到功能是否需要权限验证
	 * 测试通过
	 */
	 
	@Override
	public List <Functioninfo>getFunctionInfoUrlValidation(String sUrl) {
		// TODO Auto-generated method stub
		return rightMapper.getFunctionInfoUrlValidation(sUrl);
	}
	/**
	 * 得到某一用户的shortcut项
	 * 测试通过
	 */
	@Override
	public List <Functioninfo>getUserShortCutFunctionInfo(Long userId) {
		// TODO Auto-generated method stub
		return rightMapper.getUserShortCutFunctionInfo(userId);
	}
	/**
	 * 得到某一功能的兄弟项，并且是shortcut项
	 * 测试通过
	 */
	@Override
	public List <Functioninfo> getBrotherFunctionInfo(Long userId, String sUrl) {
		// TODO Auto-generated method stub
		return rightMapper.getBrotherFunctionInfo(userId, sUrl);
	}
	/**
	 * 得到login兄弟功能记录
	 * 测试通过
	 */
	@Override
	public Functioninfo[] getLoginBrotherFunctionInfo() {
		// TODO Auto-generated method stub
		return rightMapper.getLoginBrotherFunctionInfo();
	}
	/**
	 * 得到login项父功能记录
	 * 测试通过
	 */
	@Override
	public Functioninfo[] getLoginFatherFunctionInfo() {
		// TODO Auto-generated method stub
		return rightMapper.getLoginFatherFunctionInfo();
	}
	/**
	 * 设定用户菜单和系统名称、版本信息
	 */
	@Override
	public void SetUserMenu(Userinfo user, HttpServletRequest request,String sUrl) {
		// TODO Auto-generated method stub
		List funList = new ArrayList();
		List allFunList = new ArrayList();
		List leftFunList = new ArrayList();
		// 得到该用户能够访问的第一层功能
		funList = getUserFirstFunctioninfoList(user.getUserid().longValue());
		Functioninfo[] fun1 = getLoginFatherFunctionInfo();
		addFunctionInfo(funList, fun1);
		// 得到该用户能够访问的所有功能
		allFunList = getUserFunctionInfo(user.getUserid().longValue());
		fun1 = (Functioninfo[]) getLoginBrotherFunctionInfo();
		addFunctionInfo(allFunList, fun1);
		// 得到页面左边的快捷方式
		if (sUrl.equals("FirstLogin")) {
			if (funList.size() > 0) {
				Functioninfo[] fun = (Functioninfo[]) funList.toArray();
				leftFunList = getBrotherFunctionInfo(user.getUserid().longValue(),fun[0].getFunctioninfourl());
				fun1 = (Functioninfo[]) getLoginBrotherFunctionInfo();
				addFunctionInfo(leftFunList, fun1);
			}
		} else {
			leftFunList = getBrotherFunctionInfo(user.getUserid().longValue(), sUrl);
		}
		request.getSession().setAttribute("UserfunList", funList);
		request.getSession().setAttribute("UserallFunList", allFunList);
		request.getSession().setAttribute("UserleftFunList", leftFunList);
		request.setAttribute("firsttree", funList);
		request.setAttribute("menutrees", allFunList);
		request.setAttribute("lefttree", leftFunList);
		setUserName(user, request);
		//********** 读取运行单位、系统名称和版本号set到页面 add by tlb 临时 **************//*
		// OrganBO organBO = (OrganBO)
		// BeanManagerFactory.getBeanManager(BeanSystemName.BMM_System).getBean("bo.OrganBO");
		// ParameterBO parameterBO = (ParameterBO)
		// BeanManagerFactory.getBeanManager(BeanSystemName.BMM_System).getBean("bo.ParameterBO");
		// Organ[] organ = organBO.getOrgans(0,Integer.MAX_VALUE).getValues();
		// request.setAttribute("OrganName", organ[0].getOrganname());
		// request.setAttribute("SoftName", parameterBO.getSoftName());
		// request.setAttribute("SoftType", parameterBO.getSoftType());
		// request.setAttribute("CopyRight", parameterBO.getCopyRight());
		//********************************************************//*
	}
/**
	 * 设定用户名字
	 * 
	 * @param user
	 * @param request
	 */
	private void setUserName(Userinfo user, HttpServletRequest request) {
		request.getSession().setAttribute("username", user.getUsername());
	}
	/**
	 * 
	 * @param funList
	 * @param funAdd
	 */
	private void addFunctionInfo(List funList, Functioninfo[] funAdd) {
		int i = 0, j = 0, k = 0, l = 0;
		int nCount;
		boolean bAdd;
		Functioninfo[] funNeedAdd = new Functioninfo[funAdd.length];
		Object[] fun =(Object[]) funList.toArray();
		j = fun.length;
		for (i = 0; i < funAdd.length; i++) {
			bAdd = true;
			for (k = 0; k < fun.length; k++) {
				if (fun[k].equals(funAdd[i]) == true) {
					bAdd = false;
					break;
				}
			}
			if (bAdd == true) {
				funNeedAdd[l] = funAdd[i];
				l++;
			}
		}
		if (l > 0) {

			nCount = fun.length + funNeedAdd.length;
			Functioninfo[] funAll = new Functioninfo[nCount];
			for (i = 0; i < fun.length; i++) {
				funAll[i] = (Functioninfo) fun[i];
			}
			j = fun.length;
			for (i = 0; i < funNeedAdd.length; i++) {
				funAll[j + i] = funNeedAdd[i];
			}
			// funList.setValues(funAll);
			funList.add(funAll);
		}
	}
}

/******************************************
项目名称：tsmsproject
文件：FunctioninfoService.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 下午1:53:44
 *******************************************/
package tsms.base.zl.service;

import java.util.List;
import java.util.Map;

import tsms.base.zl.pojo.po.Functioninfo;




/**
 * @author fab
 * 
 */
public interface FunctioninfoService {

	public Functioninfo getFunctioninfo(long functioninfoId) throws Exception;

	public void createFunctioninfo(Functioninfo functioninfo) throws Exception;

	public void updateFunctioninfo(Functioninfo functioninfo) throws Exception;

	public void deleteFunctioninfo(long functioninfoId) throws Exception;
	
	 public List<Functioninfo> listAllFunctioninfo()throws Exception;

	// public FunctioninfoList getFunctioninfos(int start, int max);
	//
	// public Functioninfo[] listAllFunctioninfo();
	// public Functioninfo getFunctioninfo(String tempParams, Map args);
	// public FunctioninfoList getFirstFunctioninfoList();
	// public FunctioninfoList getChildFunctionInfoByFather(Long fatherId);
	// public FunctioninfoList queryFunctioninfo(String queryName,Map
	// queryValue);
	// public FunctioninfoList GetAllSecondaryFunParams();
	// public FunctioninfoList GetAllNonMakeSecondaryFunParams();

}

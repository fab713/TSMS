/******************************************
项目名称：yycgproject
文件：StudentService.java
作者：fab
描述：TODO
创建日期：2016年7月9日 上午11:34:03
 *******************************************/
package tsms.base.zl.service;

import tsms.base.zl.pojo.po.Student;



/**
 * @author fab
 * 
 */
public interface StudentService {
	
	public Student getStudent(String serialno) throws Exception;


}

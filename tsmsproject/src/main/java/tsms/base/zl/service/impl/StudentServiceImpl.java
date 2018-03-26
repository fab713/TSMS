/******************************************
项目名称：yycgproject
文件：StudentServiceImpl.java
作者：fab
描述：TODO
创建日期：2016年7月9日 上午11:36:32
 *******************************************/
package tsms.base.zl.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import tsms.base.zl.dao.mapper.StudentMapper;
import tsms.base.zl.pojo.po.Student;
import tsms.base.zl.pojo.po.StudentExample;
import tsms.base.zl.service.StudentService;




/**
 * @author fab
 * 
 */
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Student getStudent(String  serialno) throws Exception {
		// TODO Auto-generated method stub
		StudentExample studentExample = new StudentExample ();
		StudentExample.Criteria criteria = studentExample.createCriteria();
		criteria.andSerialnoEqualTo(serialno);
		List<Student> list =studentMapper.selectByExample(studentExample);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}


}

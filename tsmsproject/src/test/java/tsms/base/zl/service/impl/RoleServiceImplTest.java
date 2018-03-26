/******************************************
项目名称：tsmsproject
文件：RoleServiceImplTest.java
作者：fab
描述：TODO
创建日期：2017年6月16日 下午3:20:09
 *******************************************//*
package tsms.base.zl.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tsms.base.zl.pojo.po.Role;
import tsms.base.zl.service.RoleService;
import junit.framework.TestCase;

*//**
 * @author fab
 * 
 *//*
public class RoleServiceImplTest extends TestCase {
	
	private ApplicationContext applicationContext;

	protected void setUp() throws Exception {
		// 获得Spring容器
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml",
				"spring/applicationContext-base-dao.xml",
				"applicationContext-base-service.xml" });
	}

	public void getRole() {
		RoleService roleService = (RoleService) applicationContext
				.getBean("RoleService");
		Role role=null;
		try {
			role = roleService.getRole(1);
			System.out.println(role.getRolename());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
*/
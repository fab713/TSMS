/******************************************
项目名称：tsmsproject
文件：TestAction.java
作者：fab
描述：TODO
创建日期：2017年6月20日 下午2:03:07
 *******************************************/
package tsms.base.zl.action;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;














import tsms.base.zl.pojo.po.Functioninfo;
import tsms.base.zl.pojo.po.Student;
import tsms.base.zl.pojo.po.Role;
import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.vo.FunctioninfoCustom;
import tsms.base.zl.pojo.vo.PageQuery;
import tsms.base.zl.pojo.vo.UserinfoCustom;
import tsms.base.zl.pojo.vo.UserinfoQueryVo;
import tsms.base.zl.process.result.DataGridResultInfo;
import tsms.base.zl.service.FunctioninfoService;
import tsms.base.zl.service.RightService;
//import tsms.base.zl.service.RightService;
import tsms.base.zl.service.RoleService;
import tsms.base.zl.service.RolefunctionService;
import tsms.base.zl.service.StudentService;
import tsms.base.zl.service.UserRoleService;
import tsms.base.zl.service.UserService;

/**
 * @author fab
 * 
 */
@Controller
@RequestMapping("/Test")
public class TestAction {
	@Autowired
	private RoleService roleService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private UserService userService;

	@Autowired
	private RolefunctionService rolefunctionService;
	@Autowired
	private FunctioninfoService functioninfoService;

	@Autowired
	private UserRoleService userRoleService;
	
    @Autowired
	private RightService rightService;

	@RequestMapping("/testRole")
	public void TestRole() throws Exception {
		System.out.println("444444444444444");
//		List<UserinfoCustom>userList=new ArrayList<UserinfoCustom>();
//		UserinfoQueryVo userinfoQueryVo=new UserinfoQueryVo();
//		userList=userService.findUserinfoList(userinfoQueryVo);
//		int a=userService.findUserinfoCount(userinfoQueryVo);
//		System.out.println("{----"+a+"--------------------}");
//		for(int i=0;i<userList.size();i++){
//			System.out.println("{----"+userList.get(i).getUsername()+"--------------------}");
//		}
		// 非空校验
//		UserinfoQueryVo userinfoQueryVo= new UserinfoQueryVo();
//		// 查询列表的总数
//		int totalNum=userService.findUserinfoCount(userinfoQueryVo);
//		PageQuery pageQuery=new PageQuery();
//		pageQuery.setPageParams(totalNum, 10, 0);
//		// 分页查询，向UserinfoQueryVo中传入pageQuery
//		userinfoQueryVo.setPageQuery(pageQuery);
//		List<UserinfoCustom> list=userService.findUserinfoList(userinfoQueryVo);
//		DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
//		// 填充 total
//		dataGridResultInfo.setTotal(totalNum);
//		// 填充 rows
//		dataGridResultInfo.setRows(list);
//		String userLoginId="admin";
//		String userPass="admin";
//		boolean a=userService.userValidate(userLoginId, userPass);
//		System.out.println("{----------"+a+"-------------------}");
		
		Long userId = (long) 1;
		Long fatherId=(long)90;
		String sUrl="/monitor/monitor/display.do";
//		List <Functioninfo>list =rightService.getUserFirstFunctioninfoList(userId);
//		System.out.println("[------" +list.size() + "--------------]");
//		for(int i=0;i<list.size();i++){
//			System.out.println("[------"+list.get(i).getFunctioninfoid()+ "--------------]");
//			
//		}
//		UserinfoCustom userinfoCustom=new UserinfoCustom();
//		userinfoCustom.setUserid(BigDecimal.valueOf(userId));
//		userinfoCustom.setFunFunctioninfoid(fatherId);
//		List list =rightService.getUserChildFunctionInfoByFather(userinfoCustom);
//		System.out.println("[------" +list.size() + "--------------]");		
		List <Functioninfo>list =rightService.getUserFunctionInfo(userId);
		System.out.println("[------" +list.size() + "--------------]");
		for(int i=0;i<list.size();i++){
		System.out.println("[------"+list.get(i).getFunFunctioninfoid()+ "--------------]");		
	}
//		List <Functioninfo>list =rightService.getUserHaveFunctionInfoUrl(userId, sUrl);
//		System.out.println("[------" +list.size() + "--------------]");
//	    List <Functioninfo>list =rightService.getFunctionInfoUrlLog(sUrl);
//		System.out.println("[------" +list.size() + "--------------]");
//	    List <Functioninfo>list =rightService.getFunctionInfoUrlValidation(sUrl);
//		System.out.println("[------" +list.size() + "---------]");
//	    List <Functioninfo>list =rightService.getUserShortCutFunctionInfo(userId);
//		System.out.println("[------" +list.size() + "---------]");
//	    List <Functioninfo>list =rightService.getBrotherFunctionInfo(userId, sUrl);
//		System.out.println("[------" +list.size() + "---------]");
//		Functioninfo[] a =rightService.getLoginBrotherFunctionInfo();
//		 System.out.println("[------" +a.length + "---------]");
		Functioninfo[] a =rightService.getLoginFatherFunctionInfo();
		System.out.println("[------" +a.length + "---------]");
		
		
	}

	@RequestMapping("/Role")
	public String Role(Model model) throws Exception {
		System.out.println("444444444444444");
		long RoleId = 1;
		Role role=new Role();
		role=roleService.getRole(RoleId);
		System.out.println("角色名称[------" + role.getRolename() + "--------------]");
		return "/base/user/role";
	}
	
	@RequestMapping("/customer_input")
    public String inputCustomer(Model model){
		System.out.println("444444444444444");
        return "CustomerForm";
    }


}

/******************************************
项目名称：tsmsproject
文件：UserAction.java
作者：fab
描述：TODO
创建日期：2017年9月18日 下午10:28:18
 *******************************************/
package tsms.base.zl.action;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tsms.base.zl.pojo.vo.PageQuery;
import tsms.base.zl.pojo.vo.UserinfoCustom;
import tsms.base.zl.pojo.vo.UserinfoQueryVo;
import tsms.base.zl.process.context.Config;
import tsms.base.zl.process.result.DataGridResultInfo;
import tsms.base.zl.process.result.ResultInfo;
import tsms.base.zl.process.result.ResultUtil;
import tsms.base.zl.process.result.SubmitResultInfo;
import tsms.base.zl.service.UserService;


/**
 * @author fab
 * 
 */
@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserService userService;

	/**
	 * 查询页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/queryuser")
	public String qureyUser(Model model) throws Exception {

		return "/base/user/queryuser";

	}

	/**
	 * 查询结果集
	 * 
	 * @param userinfoQueryVo
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryUserResult")
	public @ResponseBody
	DataGridResultInfo queryUserResult(UserinfoQueryVo userinfoQueryVo,
			int page, int rows) throws Exception {
		// 非空校验
		userinfoQueryVo = userinfoQueryVo != null ? userinfoQueryVo
				: new UserinfoQueryVo();
		// 查询列表的总数
		int totalNum = userService.findUserinfoCount(userinfoQueryVo);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(totalNum, rows, page);
		// 分页查询，向UserinfoQueryVo中传入pageQuery
		userinfoQueryVo.setPageQuery(pageQuery);
		List<UserinfoCustom> list = userService
				.findUserinfoList(userinfoQueryVo);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充 total
		dataGridResultInfo.setTotal(totalNum);
		// 填充 rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

	/**
	 * 新增用户页面
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userAdd")
	public String userAdd(Model model) throws Exception {

		return "/base/user/adduser";

	}

	/**
	 * 添加用户提交 提交表单数据统一使用包装类 提交 结果转json输出到页面
	 * 
	 * @return
	 */
	@RequestMapping("/addUserSumit")
	public @ResponseBody
	SubmitResultInfo addUserSumit(UserinfoQueryVo userinfoQueryVo)
			throws Exception {
		ResultInfo resultInfo=new ResultInfo();
		resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
		resultInfo.setMessage("操作成功");
		userService.createUser(userinfoQueryVo.getUserinfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	/**
	 * 删除用户
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userDelete")
	public @ResponseBody SubmitResultInfo userDelete(String id) throws Exception {	
		System.out.println(id);
		userService.deleteUser(Long.parseLong(id));
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	

	/**
	 * 修改用户页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userEdit")
	public String userEdit(Model model,String id) throws Exception {
		UserinfoCustom userinfoCustom=userService.findSysUserById(Long.parseLong(id));
		model.addAttribute("userinfoCustom", userinfoCustom);
		return "/base/user/edituser";
	}
	/**
	 * 修改用户提交
	 * @param userinfoQueryVo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userEditSumit")
	public @ResponseBody SubmitResultInfo userEditSumit(UserinfoQueryVo userinfoQueryVo,String id) throws Exception {
		userService.updateSysuser(Long.parseLong(id), userinfoQueryVo.getUserinfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 906, null));
		
	}

}

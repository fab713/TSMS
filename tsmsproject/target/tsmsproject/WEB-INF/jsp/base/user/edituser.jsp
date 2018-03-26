<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css" href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>修改用户</title>
<script type="text/javascript">
  function sysusersave(){	  
	  jquerySubByFId('userform',sysusersave_callback,null,"json");  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
  function sysusersave_callback(data){	
	  message_alert(data);	  
	  var type=data.resultInfo.type;
		if(type==1){
			  alert("88888888888888888");	
			  //window.location.href="/tsmsproject/user/queryuser.jsp";
		}	
  }
</script>
</head>
<body>
<form id="userform" action="${baseurl}user/userEditSumit.action" method="post">
<!-- 更新用户的id -->
<input type="hidden" name="id" value="${userinfoCustom.userid}"/>
<table border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>
   <tbody>
   <tr>
				<td background=images/r_0.gif width="100%">
					<table cellSpacing=0 cellPadding=0 width="100%">
						<tbody>
							<tr>
								<td>&nbsp;系统用户信息</TD>
								<td align=right>&nbsp;</TD>
							</TR>
						</tbody>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					<table class="toptable grid" border=1 cellSpacing=1 cellPadding=4 align=center>
						<tbody>
							<tr>
								<td height=30 width="15%" align=right >用户账号：</td>
								<td class=category width="35%">
								<div>
								<input type="text" id="sysuser_userid" name="userinfoCustom.userid" value="${userinfoCustom.userid}" />
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</td>
								<td height=30 width="15%" align=right >用户名称：</TD>
								<td class=category width="35%">
								<div>
								<input type="text" id="sysuser_username" name="userinfoCustom.username" value="${userinfoCustom.username}"  />
								</div>
								<div id="sysuser_usernameTip"></div>
								</td>
							</tr>
							<tr>
								<td height=30 width="15%" align=right >用户密码：</td>
								<td class=category width="35%">
								<div>
								    如果要修改密码请在此输入<br/>
									<input type="password" id="sysuser_password" name="userinfoCustom.userpass" value="${userinfoCustom.userpass}" />
								</div>
								<div id="sysuser_passwordTip"></div>
								</td>
					           <td height=30 width="15%" align=right>性别：</td>
									<td class=category width="35%">
										<div>
											<input type="text" id="sysuser_sex" name="userinfoCustom.usersex" value="${userinfoCustom.usersex}" />
										</div>
										<div id="sysuser_groupidTip"></div>
									</td>
							</tr>
							<tr>
							    <td height=30 width="15%" align=right >用户电话：</td>
								<td class=category width="35%">
								<input type="text"  id="sysuser_cellphone" name="userinfoCustom.cellphone"  value="${userinfoCustom.cellphone}"/>
								</td>
								<td height=30 width="15%" align=right>用户邮箱：</td>
								<td class=category width="35%">
								<input type="text"  id="sysuser_useremail"  name="userinfoCustom.useremail"  value="${userinfoCustom.useremail}" />
								</td>
							</tr>
						     <tr>
									<td height=30 width="15%" align=right>是否厂家用户：</td>
									<td class=category width="35%">
									     <input type="text" name="sysuser_ismakeruser" value="${userinfoCustom.ismakeruser}" />
									</td>
								</tr>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="sysusersave()">提交</a>
								<a id="closebtn"  class="easyui-linkbutton" iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
							  </td>
							</tr>
							</tbody>
						</table>
					</td>
				</tr>
   </tbody>
</table>
</form>
</body>
</html>
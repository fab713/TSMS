<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>TSMS平台</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<link rel="stylesheet" type="text/css" href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<SCRIPT type="text/javascript">

</SCRIPT>

<META name="GENERATOR" content="MSHTML 9.00.8112.16540">
</HEAD>

<BODY style="overflow-y: hidden;" class="easyui-layout" scroll="no" >
<form action="${baseurl}login/loginSubmit.action" method="post">
<table width="690px" height="400px" align="center" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td >
      <table width="600px" height="400px" align="center" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="50px" valign="bottom" ><span style="font-size:18px; color:#444;">您好,</span><span style="font-size:18px; color:#1cb98e;">&nbsp;${username} </span>
          </td>
        </tr>
        <tr>
          <td >
          <a href="<c:url value='/eventrec/eventrec/list.do' />"> 
          <img src="<c:url value='/images/csgl.gif'/>"/></a>&nbsp;&nbsp; 
          <a href="<c:url value='/monitor/depot/map.do'/>"> 
          <img src="<c:url value='/images/hxfx.gif'/>"/></a>&nbsp;&nbsp; 
          <a href="<c:url value='/depot/learn/listinframe.do' />">
          <img src="<c:url value='/images/csck.gif'/>"/></a>&nbsp;&nbsp; 
          <a href="<c:url value='/analysis/history/listinframe.do'/>"> 
          <img src="<c:url value='/images/tjfx.gif'/>"/></a> 
          </td>
        </tr>
      </table>    
    </td>
  </tr>
</table>
</form>
</BODY>
</HTML>

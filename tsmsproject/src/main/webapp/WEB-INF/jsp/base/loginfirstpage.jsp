<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<link href="<c:url value="/styles/setstyle.css"/>" type="text/css"rel="stylesheet" />
<html:form action="${action}" method="POST">
	<table width="690px" height="400px" align="center" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>
				<table width="600px" height="400px" align="center" border="0"
					cellspacing="0" cellpadding="0">
					<tr>
						<td height="50px" valign="bottom"><span style="font-size: 18px; color: #444;">您好,</span>
						<span style="font-size: 18px; color: #1cb98e;">&nbsp;${username}</span>
						</td>
					</tr>
					<tr>
						<td><a href="<c:url value='/eventrec/eventrec/list.do' />">
								<img src="<c:url value='/imagesfab/csgl.gif'/>" />
						</a>&nbsp;&nbsp; <a href="<c:url value='/monitor/depot/map.do'/>">
								<img src="<c:url value='/imagesfab/hxfx.gif'/>" />
						</a>&nbsp;&nbsp; <a
							href="<c:url value='/depot/learn/listinframe.do' />"> <img
								src="<c:url value='/imagesfab/csck.gif'/>" /></a>&nbsp;&nbsp; <a
							href="<c:url value='/analysis/history/listinframe.do'/>"> <img
								src="<c:url value='/imagesfab/tjfx.gif'/>" /></a></td>
					</tr>

				</table>
			</td>
		</tr>
	</table>
</html:form>
<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<link href="<c:url value="/styles/main.css"/>" type="text/css" rel="stylesheet" />
<%response.setCharacterEncoding ("GBK");%>
	<table class="formbox" border="0" cellpadding="0" cellspacing="0" width="400" align="center">
		<tbody>
			<tr>
				<th class="formtitle" colspan="2">
					<bean:message key="global.error.title" />
				</th>
			</tr>			
			<tr>
				<td class="formfield" nowrap="true">
					<bean:message key="global.error.errormsg" />
					:
				</td>
				<td class="formvalue" nowrap="true">
					<html:errors />
				</td>
			</tr>			
			<tr>
				<td class="formfield" nowrap="true">
					<bean:message key="global.error.errordetail" />
					:
				</td>
				<td class="formvalue" WORD-BREAK="break-all" WORD-WRAP="break-word">
					<FONT color="red"><c:out value="${ErrorDetail}"></c:out></FONT>
				</td>
			</tr>
			<tr>
				<td class="formfield" colspan="2" align="center">
					<a href="javascript:history.go(-1)"><bean:message key="global.error.back" /></a>
				</td>
			</tr>			
		</tbody>
	</table>

<%@ page language="java" pageEncoding="GBK"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>


<c:if test="${records.pageCount>0}">

<table cellpadding="2" cellspacing="0">
	<tr>		
		<c:if test="${records.pageNumber>1}">
		<td class="gridfooter"><html:button property="first" onclick="gotoPage(this,'1')">第一个</html:button></td>
		<td class="gridfooter"><html:button property="previous" onclick="gotoPage(this,'${(records.pageNumber-1)}')">上一个</html:button></td>
		</c:if>
		<c:if test="${records.pageNumber<=1}">
		<td class="gridfooter"><html:button property="first" onclick="gotoPage(this,'1')">第一个</html:button></td>
		</c:if>
		<c:if test="${records.pageNumber<records.pageCount}">
		<td class="gridfooter"><html:button property="previous" onclick="gotoPage(this,'${(records.pageNumber+1)}')">下一个</html:button></td>
		<td class="gridfooter"><html:button property="previous" onclick="gotoPage(this,'${(records.pageCount)}')">最后个</html:button></td>
		</c:if>
		<c:if test="${records.pageNumber>=records.pageCount}">
		<td class="gridfooter"><html:button property="previous" onclick="gotoPage(this,'${(records.pageCount)}')">最后个</html:button></td>
		</c:if>
	</tr>
</table>
</c:if>
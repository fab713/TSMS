<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page contentType="text/html; charset=UTF-8"%>
<tiles:insertAttribute  name="navpath" ignore="true"/>
<tiles:insertAttribute name="navlinks" ignore="true"/>

<table class="location" border="0" cellpadding="0" cellspacing="0" width="99%" height="20px">
<tr>
   <td nowrap="true" style="padding-left:5px">
		<table id="navbar" class="navbar" cellpadding="0" cellspacing="0" border="0">
			<tr>
			    <td  class="navbar" valign="bottom">
                    <em> </em>	
                </td>
			<c:forEach var="nav" varStatus="i" items="${navpath}">
				<c:choose>
					<c:when test="${i.last}"><td class="navbar" valign="bottom"><bean:message key="${nav.value}"/></td></c:when>
					<c:otherwise><td><a class="navbar" valign="bottom" href="<c:url value="${nav.link}"/>"><bean:message key="${nav.value}"/></a></td>
					<td>&nbsp;|&nbsp;</td></c:otherwise>
				</c:choose>
			</c:forEach>
			</tr>
		</table>
	</td>
	<td nowrap="true" align="right" >
		<table id="navlinks" class="navbar" cellpadding="0" cellspacing="0" border="0">
			<tr>
				<c:forEach var="nav" varStatus="i" items="${navlinks}">
					<td valign="bottom">
					<a class="navbar" href="<c:url value="${nav.link}"/>"><bean:message key="${nav.value}"/></a>
					</td>
					<c:if test="${!i.last}"><td valign="bottom" style="padding-left:5px;padding-right:5px">|</td></c:if>
				</c:forEach>
			</tr>
		</table>
	</td>
</tr>
</table>




<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<table>
<tr><td>
&nbsp;
</td>
</tr>
<tr><td>
<div id="button">
                                              
<ul id="submenu15" style="width:135px;" >
	<c:forEach items="${lefttree}" var="ltree">
		<li><a href="<c:url value="${ltree.functioninfourl}"/>">${ltree.functioninfoname}</a></li>
	</c:forEach>
</ul>
</div>
</td>
</tr>
</table>

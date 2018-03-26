<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<SCRIPT type="text/javascript">
	function openHelp(url) {
		window
				.open(url, '系统帮助',
						'height=200,width=800,toolbar=no,scrollbar=no,top=100,left=100');
	}
</SCRIPT>
<ul id="navmenu" class='nav' name="navmenu">
	<c:forEach items="${firsttree}" var="first" varStatus="i">
		<li class='top'><a class='top_link' href="<c:url value="#"/>"><span
				class='down'>${first.functioninfoname}</span> </a>
			<ul class='sub' id="submenu${i.count-1}">
				<c:forEach items="${menutrees}" var="tree">
				<c:if test="${tree.funFunctioninfoid==first.functioninfoid}">
						<c:choose>
							<c:when test="${tree.functioninfoname=='系统帮助'}">
								<li><a
									href="Javascript:openHelp('<c:url value="${tree.functioninfourl}"/>');">${tree.functioninfoname}</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="<c:url value="${tree.functioninfourl}"/>" target="_top">${tree.functioninfoname}</a></li>
							</c:otherwise>
						</c:choose>
					</c:if>
				</c:forEach>
			</ul></li>
	</c:forEach>
</ul>


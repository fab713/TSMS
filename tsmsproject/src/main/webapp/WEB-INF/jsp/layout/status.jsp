<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@page contentType="text/html; charset=UTF-8"%>
<link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet"/>
<ul>
	<li>
		<span id="Label3">欢迎您：</span>
		<em><span id="xhxm">${username} </span></em>							
    </li>
	<li>
		<a href="http://<%=request.getServerName()%>:<%=request.getServerPort()%><%=request.getContextPath()%>/right/login/logoff.do" target="_top">[退出]</a>
	</li>
</ul>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="trimwhitespaces">
<tiles:insertAttribute name="title"/>
<tiles:insertAttribute name="onload" ignore="true"/>
<tiles:insertAttribute name="onclick" ignore="true"/>
<tiles:insertAttribute name="onbeforeunload" ignore="true"/>
<tiles:insertAttribute name="scripts" ignore="true"/>
<tiles:insertAttribute name="styles" ignore="true"/>
<tiles:insertAttribute name="calendar" ignore="true"/>
<tiles:insertAttribute name="action" ignore="true" scope="request"/>
<tiles:insertAttribute name="export" ignore="true" scope="request"/>
<tiles:insertAttribute name="pagelinks" ignore="true" scope="request"/>
<tiles:insertAttribute name="notShowError" ignore="true"/>
</c:set>
<html>
<head>
	<title><bean:message key="${title}"/></title>
	<link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet"/>	
    <script src="<c:url value="/scripts/calendar1.js"/>"></script>	
    <script src="<c:url value="/scripts/calendar.js"/>"></script>	
	<script src="<c:url value="/scripts/common.js"/>"></script>
	<script src="<c:url value="/scripts/iframeautoheight.js"/>"></script>
</head>
<body onload="${onload}" onclick="${onclick}" onbeforeunload="${onbeforeunload}">
<c:if test="${calendar=='true'}"><div id="calendarDiv" class="gui-calendar"></div></c:if>
           <jsp:include page="menu.jsp"></jsp:include> 
            <tiles:insertAttribute name="content" />
</body>
</html>
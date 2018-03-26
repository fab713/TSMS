<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="trimwhitespaces">
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<tiles:importAttribute name="title"/>
<tiles:importAttribute name="onload" ignore="true"/>
<tiles:importAttribute name="onclick" ignore="true"/>
<tiles:importAttribute name="onbeforeunload" ignore="true"/>
<tiles:importAttribute name="scripts" ignore="true"/>
<tiles:importAttribute name="styles" ignore="true"/>
<tiles:importAttribute name="calendar" ignore="true"/>
<tiles:importAttribute name="action" ignore="true" scope="request"/>
<tiles:importAttribute name="export" ignore="true" scope="request"/>
<tiles:importAttribute name="pagelinks" ignore="true" scope="request"/>
<tiles:importAttribute name="notShowError" ignore="true"/>
</c:set>


<html>
<head>
	<title><bean:message key="${title}"/></title>
	<link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet"/>	
    <script src="<c:url value="/scripts/calendar1.js"/>"></script>	
    <script src="<c:url value="/scripts/calendar.js"/>"></script>	
	<script src="<c:url value="/scripts/common.js"/>"></script>
	<script src="<c:url value="/scripts/iframeautoheight.js"/>"></script>
	<!--  
	<script src="<c:url value="/scripts/main.js"/>"></script>
	<c:forEach var="script" items="${scripts}"><script src="<c:url value="${script.link}"/>"></script></c:forEach>	
	-->
</head>
<body onload="${onload}" onclick="${onclick}" onbeforeunload="${onbeforeunload}">
<c:if test="${calendar=='true'}"><div id="calendarDiv" class="gui-calendar"></div></c:if>

   




                
           <jsp:directive.include file="menu.jsp"/>
      
               
            <tiles:insert attribute="content"/>

 
</body>
</html>
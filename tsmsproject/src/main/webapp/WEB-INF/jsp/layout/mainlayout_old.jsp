<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%><c:set var="trimwhitespaces">
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@page contentType="text/html; charset=GBK"%>
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
</c:set><html>
<head>
	<title><bean:message key="${title}"/></title>
	<link href="<c:url value="/styles/${empty styleDirectory ? '.' : styleDirectory}/main.css"/>" type="text/css" rel="stylesheet"/>
	<link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet"/>
	<c:forEach var="style" items="${styles}"><link href="<c:url value="${style.link}"/>" type="text/css" rel="stylesheet"/></c:forEach>

    <script src="<c:url value="/scripts/calendar1.js"/>"></script>	
	<script src="<c:url value="/scripts/main.js"/>"></script>
	<script src="<c:url value="/scripts/common.js"/>"></script>

	<c:forEach var="script" items="${scripts}"><script src="<c:url value="${script.link}"/>"></script></c:forEach>	
	</head>
<body onload="${onload}" onclick="${onclick}" onbeforeunload="${onbeforeunload}">
<c:if test="${calendar=='true'}"><div id="calendarDiv" class="gui-calendar"></div></c:if>
<div id="container" align="center">
    <!--banner-->
    <div id="bannercontainer">
        <jsp:directive.include file="banner.jsp"/> 
        
    </div>
    <!--menubar and statusbar-->
    
      <!--statusbar-->
       <div id="statusbar">      
        <jsp:directive.include file="status.jsp"/>
        
        
        
       </div>
       
      <!--menu-->
      <div id="menucontainer">
        <jsp:directive.include file="mainmenu.jsp"/> 
        <IFRAME src="about:blank"></IFRAME>
      </div>
      
      
       
 
    <!--main-->
    
    <div id="main">
      <!--main.contentcontainer-->
      <div id="contentwhole">

      <div id="contenttop">         
         <jsp:directive.include file="menu.jsp"/>
      </div>
      <div id="contentcontainer">         
         <tiles:insert attribute="content"/>
      </div> 
      
      <!--others-->
       <div id="others">      
        
       </div>
      
      
      </div>        
    </div>

    <!--copyrightcontainer-->
    <div id="copyrightcontainer">      
        <jsp:directive.include file="copyright.jsp"/>
    </div>
    
</div><!--container-->
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

</c:set><html>
<head>
	<title><bean:message key="${title}"/></title>
	<link href="<c:url value="/styles/${empty styleDirectory ? '.' : styleDirectory}/main.css"/>" type="text/css" rel="stylesheet"/>
	<link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet"/>
	<c:forEach var="style" items="${styles}"><link href="<c:url value="${style.link}"/>" type="text/css" rel="stylesheet"/></c:forEach>

		<script src="<c:url value="/scripts/calendar1.js"/>"></script>

	<!-- 
	<script src="<c:url value="/scripts/main.js"/>"></script>	
	 -->

	<script src="<c:url value="/scripts/common.js"/>"></script>
	
	<!--[if lte IE 6]>
      <script src="<c:url value="/scripts/pngbug.js"/>"></script>
    <![endif]-->
	
	<c:forEach var="script" items="${scripts}"><script src="<c:url value="${script.link}"/>"></script></c:forEach>	
	</head>
<body onload="${onload}" onclick="${onclick}" onbeforeunload="${onbeforeunload}" class="login_bg">
<c:if test="${calendar=='true'}"><div id="calendarDiv" class="gui-calendar"></div></c:if>
<div id="lgcontainer" >
    <!--banner-->
    <div id="lgbannercontainer">
         
    </div>
    
    <div id="position">
    
    
     <div id="lgmid"> 
                <!-- left -->
           <div id="lgleft">
           </div> 

      <!--main-->
       <div id="lgmain">

    	   <tiles:insert attribute="content"/>
         
       </div>
    
     </div><!--end of lgmid-->
    </div><!--end of position-->
    
    
    
    <!--copyrightcontainer-->
    <div id="lgcopyrightcontainer">      
        <jsp:directive.include file="copyright.jsp"/>
    </div>
    
</div><!--container-->
</body>
</html>
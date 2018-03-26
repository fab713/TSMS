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
	
	
	<link href="<c:url value="/styles/examstyle.css"/>" type="text/css" rel="stylesheet"/>
	
	<c:if test="${calendar=='true'}">
		<c:set var="dateFormat" value="yyyy-M-d" scope="request"/>
		<link href="<c:url value='/styles/calendar.css'/>" type="text/css" rel="stylesheet"/>
		
		<script src="<c:url value="/scripts/calendar.js"/>"></script>
		<script language="javascript">
			var cal = new CalendarPopup("calendarDiv");
			cal.setCssPrefix("gui-calendar_");
		</script>
	</c:if>
   <script src="<c:url value="/scripts/common.js"/>"></script>
	</head>
<body>
<c:if test="${calendar=='true'}"><div id="calendarDiv" class="gui-calendar"></div></c:if>









<div id="examcontainer" align="center">
    <!--banner-->
    <div id="examHeader">
        <table width="1001" height="111" border="0" cellpadding="0" cellspacing="0" align="center">
        <tr>
		  <td colspan="9">
			<img src="<c:url value="/images/exam_01.gif"/>" width="1000" height="111" alt=""></td>
		  <td>
			<img src="<c:url value="/images/spacer.gif"/>" width="1" height="111" alt=""></td>
	    </tr>
       </table>
    </div>
    <!--end of banner-->
      
    
    <!--main-->
    <div id="examPageBody">
      <!--main.left-->
      <div id="examSidebar">
         <tiles:insert attribute="testleft"/>
      </div>
      <!--end of left-->
      
      <!--main.right-->
      <div id="submitMainBody">
         <div id="submittop">         
           <tiles:insert attribute="submittop"/>
         </div>
         <div id="submitmid">         
           <tiles:insert attribute="submitmid"/>
         </div>     
         <div id="submitbottom">         
            <tiles:insert attribute="submitbottom"/>
         </div> 
      </div> 
      <!--end of main.right-->      
    </div>
    <!--end of main--> 
    
    
    <!--copyrightcontainer-->
    <div id="examFooter">      
        <jsp:directive.include file="copyright.jsp"/>
    </div>
    
</div>
<!--container-->
</body>
</html>
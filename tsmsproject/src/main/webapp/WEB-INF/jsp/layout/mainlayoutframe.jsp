<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="trimwhitespaces">
<tiles:insertAttribute name="title"/>
<tiles:insertAttribute name="leftFrame"/>
<tiles:insertAttribute name="contentFrame" ignore="true" scope="request"/>
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
</c:set><html class="main_html">
<head>
	<title>${SoftName}</title>
    <script src="<c:url value="/scripts/calendar1.js"/>"></script>
    <script src="<c:url value="/scripts/calendar.js"/>"></script>	
	<script src="<c:url value="/scripts/main.js"/>"></script>
	<script src="<c:url value="/scripts/common.js"/>"></script>
	<script src="<c:url value="/scripts/iframeautoheight.js"/>"></script>
    <script src="<c:url value="/scripts/xtwh.js"/>"></script>
    <link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet"/> 
</head>
<BODY class="mainbody" onload="${onload}" onclick="${onclick}" onbeforeunload="${onbeforeunload}">
        <c:if test="${calendar=='true'}"><div id="calendarDiv" class="gui-calendar"></div></c:if>
		<div id="bodyDiv">
			<div id="headDiv">
				<!--顶部-->
				<div class="head">
					<!--公司图标-->
					<div class="logo">
                         <jsp:directive.include file="banner.jsp"/>
					</div>
					<!--公司图标-->
					<!--登录信息-->
					<div class="info">
						<jsp:directive.include file="status.jsp"/>
					</div>
					<!--登录信息-->					
				</div>
				<!--顶部-->
				
				<!--导航-->
				<!-- 主菜单Start-->
				<div id="dropdownmenu">
				     <jsp:directive.include file="mainmenu.jsp"/>
				</div>
				<!--导航-->
			</div>
			<div id="mainDiv">
				<div id="rightDiv">
				    
					
					<div id="div1">
						<iframe id="iframeautoheight" class="rightcontiframe" name="leftFrame" allowtransparency src="<c:url value="/"/>${leftFrame}"
							scrolling="no" frameborder="0" marginwidth="0" marginheight="0" onload="this.height=420;"></iframe>	

				
					</div>
					
					<div id="div2">
						<iframe id="iframe2autoheight" class="rightcontiframe" name="contentFrame" allowtransparency src="<c:url value="/"/>${contentFrame}"
							scrolling="auto" frameborder="0" marginwidth="0" marginheight="0" onload="reinitIframe2()"></iframe>	
					</div>
				</div>
			</div>
			<div id="footerDiv">
				<!--底部-->
				<div class="footer">
					<jsp:directive.include file="copyright.jsp"/>
				</div>
				<!--底部-->
			</div>
		</div>
	</BODY>
</html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="trimwhitespaces">
	<tiles:insertAttribute name="title" />
	<tiles:insertAttribute name="contentFrame" ignore="true" scope="request" />
	<tiles:insertAttribute name="onload" ignore="true" />
	<tiles:insertAttribute name="onclick" ignore="true" />
	<tiles:insertAttribute name="onbeforeunload" ignore="true" />
	<tiles:insertAttribute name="scripts" ignore="true" />
	<tiles:insertAttribute name="styles" ignore="true" />
	<tiles:insertAttribute name="calendar" ignore="true" />
	<tiles:insertAttribute name="action" ignore="true" scope="request" />
	<tiles:insertAttribute name="export" ignore="true" scope="request" />
	<tiles:insertAttribute name="pagelinks" ignore="true" scope="request" />
	<tiles:insertAttribute name="notShowError" ignore="true" />
</c:set>
<html class="main_html">
<head>
<title>${SoftName}</title>
<script src="<c:url value="/scripts/calendar1.js"/>"></script>
<script src="<c:url value="/scripts/calendar.js"/>"></script>
<script src="<c:url value="/scripts/main.js"/>"></script>
<script src="<c:url value="/scripts/common.js"/>"></script>
<script src="<c:url value="/scripts/iframeautoheight.js"/>"></script>
<script src="<c:url value="/scripts/xtwh.js"/>"></script>
<link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet" />
<style type="text/css">
<!--
#mainlayoutmainDiv {
	width: 100%;
	height: 100%;
	_padding-left: 0px;
}

#mainlayoutrightDiv {
	width: 100%;
	height: 100%;
	_padding: 100px 0px;
}

#mainlayoutmainDiv>#mainlayoutrightDiv {
	width: auto;
	position: absolute;
	left: 0px;
	right: 0px;
}

#mainlayoutleftDiv {
	width: 156px;
	*width: 0px;
	height: 100%;
	position: absolute;
	top: 0px;
	left: 0px;
	display: hidden;
}

#mainlayoutcenterDiv {
	width: 100%;
	height: 100%;
	background-color: #fff;
}

#mainlayoutrightDiv>#mainlayoutcenterDiv {
	height: auto;
	position: absolute;
	top: 80px;
	bottom: 22px;
	text-align: center;
}

#headDiv {
	height: 80px;
	width: 100%;
	position: absolute;
	top: 0px;
	z-index: 999;
}

#footerDiv {
	height: 22px;
	width: 100%;
	position: absolute;
	bottom: 0px;
	_bottom: -1px; 
	overflow: hidden;
	z-index: 991;
}
-->
</style>
</head>
<BODY class="mainbody" onload="${onload}" onclick="${onclick}"
	onbeforeunload="${onbeforeunload}">
	<c:if test="${calendar=='true'}">
		<div id="calendarDiv" class="gui-calendar"></div>
	</c:if>
	<div id="mainlayoutmainDiv">
		<div id="headDiv">
			<!--顶部-->
			<div class="head">
				<!--公司图标-->
				<div class="logo">
					<%-- <jsp:directive.include file="banner.jsp" /> --%>
					<jsp:include page="banner.jsp"></jsp:include>
				</div>
				<!--公司图标-->
				<!--登录信息-->
				<div class="info">
					<%-- <jsp:directive.include file="status.jsp" /> --%>
					<jsp:include page="status.jsp"></jsp:include>
				</div>
				<!--登录信息-->
			</div>
			<!--顶部-->

			<!--导航-->
			<!-- 主菜单Start-->
			<div id="dropdownmenu" style="z-index: 1">
				<%-- <jsp:directive.include file="mainmenu.jsp" /> --%>
				<jsp:include page="mainmenu.jsp"></jsp:include>
			</div>

		</div>
		<!--headDiv-->
		<!--主体内容-->
		<div id="mainlayoutrightDiv">

			<!--main.contentcontainer-->
			<div id="mainlayoutcenterDiv" style="overflow: auto;">


				<%-- <jsp:directive.include file="menu.jsp" /> --%>
				<jsp:include page="menu.jsp"></jsp:include>

				<%-- <tiles:insert attribute="content" /> --%>
				<tiles:insertAttribute name="content" />


				<!--others-->

			</div>
			<!--main.contentcontainer-->

		</div>
		<!--主体内容-->
		<div id="footerDiv">
			<!--底部-->
			<div class="footer">
				<%-- <jsp:directive.include file="copyright.jsp" /> --%>
				<jsp:include page="copyright.jsp"></jsp:include>
			</div>
			<!--底部-->
		</div>
	</div>
</BODY>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
	<link href="<c:url value="/styles/${empty styleDirectory ? '.' : styleDirectory}/main.css"/>" type="text/css" rel="stylesheet"/>
	<link href="<c:url value="/styles/setstyle.css"/>" type="text/css" rel="stylesheet"/>
    <script src="<c:url value="/scripts/calendar1.js"/>"></script>	

	<script src="<c:url value="/scripts/common.js"/>"></script>
</head>
<body>

    <!--banner-->
    <div id="bannercontainer">
         <jsp:directive.include file="banner.jsp"/> 
    </div>
    

</body>
</html>

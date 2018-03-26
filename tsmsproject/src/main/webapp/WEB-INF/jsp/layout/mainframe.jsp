<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%><c:set var="trimwhitespaces">
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@page contentType="text/html; charset=gbk"%>
<tiles:importAttribute name="title"/>
<tiles:importAttribute name="leftFrame"/>
<tiles:importAttribute name="contentFrame" ignore="true" scope="request"/>
</c:set><html>
<head>
	<title>${SoftName}</title>
</head>
<frameset rows="50,*,50" cols="*" framespacing="0" frameborder="no" border="0">
  <frame src="<c:url value="/top.do"/>" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset  name="midleFrameSet" id="midleFrameSet" rows="*" cols="20%,*" framespacing="0" frameborder="no" border="0">
		<frame src="<c:url value="/"/>${leftFrame}" name="leftFrame"   noresize="noresize" id="leftFrame" title="leftFrame" />
		<frame src="<c:url value="/"/>${contentFrame}" name="contentFrame" id="contentFrame" title="contentFrame" scrolling="No"/>
	</frameset>
  <frame src="<c:url value="/bottom.do"/>" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" title="bottomFrame" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
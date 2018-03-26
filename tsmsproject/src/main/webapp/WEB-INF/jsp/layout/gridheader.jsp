<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<script>
	function turnToPage(obj, event)
	{
		if (event.keyCode == 13)
		{
			changePageNumberP(event);
			obj.form.submit();
			util_cancelBrowserEvt(event);
		}
	}
	
	
function changePageNumberP(event)
{  
	var src =util_getEventObject(event); 
	//src.value = src.value.trim();
	var total="";
	if(isie)
	{
	 total= src.parentNode.nextSibling.innerHTML.substring('of '.length);
	}
	else
	{
		total = src.parentNode.nextSibling.nextSibling.innerHTML;
		total = total.substring('of'.length);
	}
	var totalNum = parseInt(total);

	if (isNaN(src.value))
	{
		src.value = 1;
	}
	else
	{
		if (src.value > totalNum)
			src.value = totalNum;
	}
}
</script>
<table cellpadding="0" cellspacing="0" width="99%" align="center">
	<tr>
		<td class="gridheader" align="left">
			<bean:message key="search.found"/> ${records.totalCount} <bean:message key="search.desc"/> <%--bean:message key="search.record${records.totalCount==1 ? '' : 's'}"/--%>
		</td>
		<td align="right">
			<table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td class="gridheader" nowrap="true"><bean:message key="search.page"/></td>
				<td class="gridheader"><input id="pageNumberText" type="text" name="pageNumber" onChange="changePageNumberP(event);" onkeydown="turnToPage(this, event);" style="font-size:10px" value="${records.pageNumber}" size="1"/></td>
				<td class="gridheader" nowrap="true"><bean:message key="search.of"/> ${records.pageCount}</td>
			</tr>
			</table>
		</td>
	</tr>
</table>

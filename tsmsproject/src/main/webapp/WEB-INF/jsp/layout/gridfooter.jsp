<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<c:if test="${records.pageCount>1}">
<script>
function gotoPage(a,page)
{
	var i = a.parentNode.parentNode.cells.item(0).firstChild.nextSibling;
	i.form.pageNumber.value = page;
	i.form.submit();
}
</script>
<table cellpadding="2" cellspacing="0" align="center">
	<tr>
		<td class="gridfooter" >
			<bean:message key="search.pages"/>
			<input type="submit" style="display:none"/>
		</td>
		<c:set var="pageStart" value="${(records.pageNumber<=5 or records.pageCount<9) ? 1 : ((records.pageCount-records.pageNumber)<5 ? records.pageCount-9+1 : records.pageNumber-5)}"/>
		<c:if test="${records.pageNumber>1}">
		<td class="gridfooter"><a href="#" style="font-size: 10pt" onclick="gotoPage(this,'1')">|&lt;</a></td>
		<td class="gridfooter"><a href="#" style="font-size: 10pt" onclick="gotoPage(this,'${(records.pageNumber-10 <1 ) ? 1 : records.pageNumber-10}')">&lt;&lt;</a></td>
		</c:if>
		<c:forEach var="i" begin="${pageStart}" end="${records.pageNumber-1}">
			<td class="gridfooter"><a href="#" style="font-size: 10pt" onclick="gotoPage(this,'${i}')">${i}</a></td>
		</c:forEach>
		<td class="gridfooter" style="font-size: 10pt" >${records.pageNumber}</td>
		<c:forEach var="i" begin="${records.pageNumber+1}" end="${records.pageCount<9 ? records.pageCount : pageStart+9-1}">
			<td class="gridfooter"><a href="#" style="font-size: 10pt" onclick="gotoPage(this,'${i}')">${i}</a></td>
		</c:forEach>
		<c:if test="${records.pageNumber<records.pageCount}">
		<td class="gridfooter"><a href="#" style="font-size: 10pt" onclick="gotoPage(this,'${(records.pageNumber+10 > records.pageCount) ? records.pageCount : records.pageNumber+10}')">&gt;&gt;</a></td>
		<td class="gridfooter"><a href="#" style="font-size: 10pt" onclick="gotoPage(this,'${records.pageCount}')">&gt;|</a></td>
		</c:if>
	</tr>
</table>
</c:if>
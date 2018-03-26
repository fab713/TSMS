<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
 <%@page contentType="text/html; charset=UTF-8"%>
<table style="height:45;border:0">
<tr>
<td >
<a class="companylogo"><img src="<c:url value="/imagesfab/main_dw_logo.gif"/>" width=45 height=45 alt="公司图标"></a>
</td>
<td >
   <table style="height:45;border:0">
   <tr>
      <td height=30%></td>
   </tr>
   <tr>
      <td height=60%><span class="txtsoftname">${SoftName}</span></td>
   </tr>
   </table>
</td>
<td >
&nbsp;&nbsp;&nbsp;
</td>
<td>
   <table style="height:45;border:0">
   <tr>
      <td height=60%><span class="txtxh">${SoftType}</span></td>
   </tr>
   <tr>
      <td height=40%><span class="txtxh">${OrganName}</td>
   </tr>
   
   </table>
</td>
</tr>
</table>

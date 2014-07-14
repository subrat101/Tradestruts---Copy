<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
String servletContext = request.getContextPath();
out.println("servletContext="+servletContext);
%>

<html>
<head>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Repository</title>
</head>
<body>
<p class="menu_header">Menu List</p>


<ul id="menu">	
<li><a href="#" id='asd' onclick='slides("c")'>Registration</a>
	<ul style="display:none;" id="c">
    	<li><a href="LCReg.jsp" target="right" >LC</a></li>
        <li><a href="GuarReg.jsp" target="right" >Guarantee</a></li>
        <li><a href="BillReg.jsp" target="right" >Bill</a></li>
        <li><a href="FFMReg.jsp" target="right" >Free Form Message</a></li>
        <li><a href="FinanceReg.jsp" target="right" >Finance</a></li>
        <li><a href="ReimbReg.jsp" target="right" >Reimbursement</a></li>
    </ul>
</li>
<li><a href="#" onclick='slides("d")'>Search</a>
	<ul style="display:none;" id="d">>
		<li><a href="">LC Inquiry</a></li>
		<li><a href="">Bill Inquiry</a></li>
		<li><a href="">Guarantee Inquiry</a></li>
		<li><a href="">Finance Inquiry</a></li>
		<li><a href="">Income Inquiry</a></li>
	</ul>
</li>
</ul>

<img class="menu_bottom_shape" src="<%=servletContext%>/images/bottom_shape.gif">
<script type="text/javascript">
function slides(x)
{
$('#'+x).toggle();

}
</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	
	<s:form action="RegistAction">
	<table border="0" width="860">
			<tr><td>
				<s:textfield name="userName" label="User Name"></s:textfield>
			</td></tr>
			
			<tr><td>
				<s:textfield name="bankName" label="Bank Name" ></s:textfield>
			</td></tr>
			
			<tr><td>
				<s:textfield name="accountNo" label="Account No" ></s:textfield>
			</td></tr>
			
			<tr><td>
				<s:textfield name="loanAmount" label="Loan Amount" ></s:textfield>
			</td></tr>
			
			<tr><td>
				<s:textfield name="cashMrgn" label="Cash Margin" ></s:textfield>
			</td></tr>
			
			<tr>
				<td><s:reset/><s:submit/></td>
			</tr>
			
		</table>
	
	</s:form>
</body>
</html>
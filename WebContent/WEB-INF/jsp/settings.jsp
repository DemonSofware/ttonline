<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=windows-1251" pageEncoding="windows-1251"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<span style="float: right">
<a href="?lang=en">en</a> 
<a href="?lang=ru">ru</a>
</span>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
<title>settings</title>
</head>
<body>
	<form action="newmatt">
			<p><spring:message code="nameTimeTable"/><input type="text" name="namecalendar" /></p>
	        <p><spring:message code="timeSlot"/> <select id="timeSlot" name="timeSlot">
               <option value="15">15 <spring:message code="timem"/></option>
               <option value="30" selected>30 <spring:message code="timem"/></option>
               <option value="60">1 <spring:message code="timeh"/></option>
               </select> </p>
			 <input id="2" type="submit" value="NEXT" />			
	</form>

</body>
</html>
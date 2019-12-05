<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<html>
<head>
<style>
input[type="submit"]:hover{background-color:black;color:white;
}
</style>
</head>

<body>
<h2>CALCULATOR</h2>
<div style="border: 3px solid grey;max-width:8rem;">
<table align="center">
<input type="text"   value= " ${Result} " readonly="readonly" style="max-width:8rem;border:3px solid;height:2rem;"><br><br>


<form action="numbercontroller">

<input type="submit" value="1" name="submit" style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;margin-left:3px; background-color:blue ">
<input type="submit" value="2" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;">
<input type="submit" value="3" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;"> <br>
<input type="submit" value="4" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;margin-left:3px;">
<input type="submit" value="5" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;">
<input type="submit" value="6" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;"><br>
<input type="submit" value="7" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;margin-left:3px;">
<input type="submit" value="8" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;">
<input type="submit" value="9" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;"><br>
<input type="submit" value="0" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;margin-left:3px;">
</form>

<form action="operatorcontroller">
<input type="submit" value="+" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;">
<input type="submit" value="-" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;"><br>
<input type="submit" value="/" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;margin-left:3px;">
<input type="submit" value="*" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;">
<input type="submit" value="%" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;"><br>

</form>

<form action="equalcontroller">
<input type="submit" value="=" name="submit"style="height: 38px; width: 40px;border: 2px solid gray;font-size: 15px;margin-left:3px;"> <br>
</form>
</table>

</body>
</html>

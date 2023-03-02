<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Регистрация</title>
</head>
    <h1>Създаване на профил</h1>
    <form action="getCredentialsServlet" method="GET" id="form1">
        <label for="fname">Име:</label> 
        <input type="text" id="fname" name="fname" placeholder="Въведете име за контакт"></input> 
        <label for="login">Потребителско име:</label> 
        <input type="text" id="login" name="login" placeholder="Въведете потребителско име"></input>
        <label for="pass">Парола:</label> 
        <input type="password" id="pass" name="pass" placeholder="Въведете парола поне с 8 символа"></input>
        <label for="cpass">Повторете паролата:</label> 
        <input type="password" id="cpass" name="cpass" placeholder="Въведете парола поне с 8 символа"></input>
        <button class="submit-btn"  type="submit" form="form1" value="Submit" role="button">Вход</button>
    </form>
</body>
</html>

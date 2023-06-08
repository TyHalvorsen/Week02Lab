<%-- 
    Document   : helloWorld
    Created on : 8-Jun-2023, 1:04:45 PM
    Author     : octov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="hello">
            <div>
                <label for="">First Name</label>
                <input type="text" name="firstName" value="${firstName}">
                <label for="">Last Name</label>
                <input type="text" name="lastName" value="${lastName}">
                <input type="submit" value="submit">
            </div>
        </form>
    </body>
</html>

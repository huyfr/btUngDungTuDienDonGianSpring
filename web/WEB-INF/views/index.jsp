<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/05/2020
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tu dien don gian</title>
  </head>
  <body>
  <form action="/result" method="get">
    <input type="text" name="word">
    <input type="submit" value="Translate">
  </form>
  <p>Ket qua: ${result}</p>
  <p>${message}</p>
  </body>
</html>

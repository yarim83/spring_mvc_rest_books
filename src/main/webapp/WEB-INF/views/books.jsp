<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <style>
        body {
            color: ${color};
            background-color: ${backgroundColor};
        }

        table {
            border-collapse: collapse;
        }

        table, td {
            border: 1px solid darkslateblue;
            padding: 10px;
            text-align: center;
        }

        th {
            border: 1px solid darkslateblue;
            padding: 10px;
            color: white;
            background-color: darkslateblue;
        }

        tr:nth-Child(odd) {
            background-color: lightcyan;
        }
    </style>
    <title>Title</title>
</head>
<body>
<table border="1">
<tr>
    <th>ID</th>
    <th>NAZWA</th>
    <th>TYTUŁ</th>
    <th>TYP</th>
    <th>WYDAWCA</th>
    <th>ISBN</th>
</tr>
<c:forEach var="book" items="${books}">
    <tr>
        <td>${book.id}</td>
        <td>${book.author}</td>
        <td>${book.title}</td>
        <td>${book.type}</td>
        <td>${book.publisher}</td>
        <td>${book.isbn}</td>
    </tr>
</c:forEach>
</table>
<form method="post" action="/books/">
    <input type="text" name="author">
    <input type="submit" value="paramName">
</form>

</body>
</html>

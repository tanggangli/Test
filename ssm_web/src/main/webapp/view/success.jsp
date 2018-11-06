<%--
  Created by IntelliJ IDEA.
  User: 墨明棋妙
  Date: 2018/11/5
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h3>测试成功</h3>
<c:forEach items="${list}" var="kind">
    ${kind.kind_name}
</c:forEach>
</body>
</html>

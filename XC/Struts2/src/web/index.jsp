<%--
  Created by IntelliJ IDEA.
  User: 冰封承諾Andy
  Date: 2017/6/3
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>测试页</title>
</head>
<body>
    这是一个测试页面 <br>
    name:<s:property value="name"/> <br>
    age:<s:property value="age"/> <br>
    BeanName:<s:property value="user.name"/> <br>
</body>
</html>

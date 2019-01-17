<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2019/1/17
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
<link href="css/login.css" rel="stylesheet"  type="text/css">
</head>
<body>
<form action="/login">
    姓名：<input name="name"><br>
    密码:<input name="password" type="password"><br>
    <input type="button" value="提交" id="bi">
</form>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    $(function () {
        $("#bi").click(function () {
            $.getJSON("/login",$("#bi").serialize(),function (data) {
                if(data.code==500){
                    alert(data.msg);
                }else{
                    location="main.jsp"
                }

            })
        })
    })

</script>
</body>
</html>

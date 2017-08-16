<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: brina
  Date: 4/10/17
  Time: 1:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript">
        function doAjax() {
            $.ajax({
                url: 'loginValidate',
                data: ({userName: $('#username').val(), password: $('#password').val()}),
                success: function (data) {
                    $('').html(data)
                }

            })
            
        }
    </script>
</head>
<body>
    <header class="top_header">
        <div class="header_topline">
            <div class="container">
                <div class="col-md-12">
                    <div class="row">
                        <button class="auth_buttons hidden-md hidden-lg hidden-sm"><i class="fa fa-user"></i></button>
                        <div class="top_links">
                            <a href="#" target="_blank">Вход</a> /
                            <a href="#" target="_blank">Регистрация</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>



</body>
</html>
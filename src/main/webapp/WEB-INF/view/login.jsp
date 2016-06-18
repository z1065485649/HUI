<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <title>HUI后台管理系统 - 登录</title>
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="/static/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="/static/css/animate.min.css" rel="stylesheet">
    <link href="/static/css/style.min.css" rel="stylesheet">
    <link href="/static/css/login.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
      <script type="text/javascript" src="../scripts/angularjs/angular.js"></script>
    <script>
        if(window.top!==window.self){window.top.location=window.location};
    </script>

</head>

<body class="signin" ng-app="loginApp" >
    <div class="signinpanel"  ng-controller="userLogin">
        <div class="row">
            <div class="col-sm-7">
                <div class="signin-info">
                    <div class="logopanel m-b">
                        <h1>[ HUI ]</h1>
                    </div>
                    <div class="m-b"></div>
                    <h4>欢迎使用 <strong>HUI 后台管理系统</strong></h4>
                    <ul class="m-b">
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势五</li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-5">
                <form method="post" id=“loginForm” name="loginForm" ng-submit="login(loginForm.$valid)" >
                    <h4 class="no-margins">登录：</h4>
                    <p class="m-t-md">登录到HUI 后台管理系统</p>
                    <input type="text" class="form-control uname" minlength="2" required="" ng-model='user.account' aria-required="true" placeholder="用户名" />
                    <input type="password" class="form-control pword m-b" required="" ng-model='user.password' aria-required="true" placeholder="密码" />
                    <button class="btn btn-success btn-block">登录</button>
                </form>
            </div>
        </div>
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2016 All Rights Reserved. HUI
            </div>
        </div>
    </div>
    <script type="text/javascript" src="../scripts/system/login.js"></script>
</body>

</html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	 <link href="${pageContext.request.contextPath }/styles/login.css" rel="stylesheet" type="text/css">
	  <script src="${pageContext.request.contextPath }/Scripts/jquery-1.11.3.js" rel="script" type="text/javascript"></script>
	      <script src="${pageContext.request.contextPath }/Scripts/login.js" rel="script" type="text/javascript"></script>
</head>
<body>
<div class="background-image">

</div>

<div id="content">

    <div class="login-content">
        <div class="login-head-img">

            <span>私密聊天系统</span>
        </div>
        <form class="loginForm" action="login.action" method="post">
            <table >
                <tr>
                    <td>
            <input name="userPhone" type="text" placeholder="账号">
                    </td>
                </tr>
                <tr>
                    <td>
            <input name="userPassword" type="password" placeholder="密码">
                    </td>
                </tr>
                <tr>
                    <td class="button">
                        <span class="login">登录</span><span class="sign">注册</span>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'chat.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <c:forEach items="${messages }" var="message">
    <c:choose>
    <c:when test="${message.messageSender!=senderUser.userId }">
   
                <li>
                    <div class="current-chat-image">
                        <img src="images/${reciverUser.userPhoto }">
                    </div>
                    <div class="current-chat-box">
                        <div class="current-chat-info"><span>${reciverUser.userName } ${message.messageDate }</span></div>
                        <div class="current-chat-content">
                           <span>
                               ${message.messageInfo }
                           </span>
                        </div>
                    </div>
                </li>
                </c:when>
                <c:otherwise>
                 <li>
                    <div class="current-chat-right-image">
                        <img src="images/${senderUser.userPhoto }">
                    </div>
                    <div class="current-chat-right-box">
                        <div class="current-chat-right-info"><span>${message.messageDate } &nbsp; &nbsp;${senderUser.userName } </span></div>
                        <div class="current-chat-right-content">
                           <span> ${message.messageInfo }</span>
                        </div>
                    </div>
                </li>
                </c:otherwise>
                 </c:choose>
            </c:forEach>
  </body>
</html>

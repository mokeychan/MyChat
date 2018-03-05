<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML >
<html>
<head>
<title>My JSP 'main.jsp' starting page</title>

<link href="${pageContext.request.contextPath }/layui/css/layui.css"
	type="text/css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/styles/main.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath }/Scripts/jquery-1.11.3.js"
	rel="script" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/Scripts/iscroll.js"
	rel="script" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/Scripts/main.js"
	rel="script" type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath }/layui/lay/dest/layui.all.js"
	type="text/javascript"></script>
</head>
<body>
	<audio class="cue"
		src="${pageContext.request.contextPath }/audio/cue.mp3" preload="auto"></audio>
	<input class="loginId" type="hidden" value="${user.userId}">
	<div id="chat-content" class="shadow" hidden>
		<div class="chat-item">
			<ul>

			</ul>
		</div>

		<div class="chat-body">

			<div class="chat-head">
				<div class="chat-friend-image">
					<img src="images/001.jpg">
				</div>
				<div class="chat-friend-name">
					<span>恋旧</span>
				</div>
			</div>
			<div class="chat-body-content" id="chat-body-content">
				<ul>

				</ul>
			</div>
			<div class="chat-edit" id="chat-edit" contenteditable="true"></div>
			<div class="chat-button">
				<span class="chat-close">关闭</span><span class="chat-submit">发送</span>
			</div>
		</div>

	</div>
	<div id="content" class="shadow">
		<div class="content-head">
			<input type="hidden" class="userPhoto" value="${user.userPhoto }">
			<span class="userName">${user.userName }</span> <span
				class="userAutoGraph">${user.userAutoGraph }</span>
			<ul>
				<li><img src="images/01.png"></li>
				<li><img src="images/03.png"></li>
				<li><img src="images/02.png"><span class="cue-circle">2</span></li>
			</ul>
			<div class="active-box">
				<span></span><span></span><span  class="active"></span>
			</div>
		</div>
		
		<div class="content-body">
			<div class="list" id="list"  hidden>
				<ul>
					<c:forEach items="${friendList }" var="user">
						<li data-id="${user.userId }">
							<div class="friend-image">
								<input type="hidden" class="userImage" value="${user.userPhoto }">
								<img class="gray" src="images/${user.userPhoto }">
							</div>
							<div class="friend-info">
								<span class="friend-name">${user.userName }</span>
								
								 <span
									class="friend-autoGraph">${user.userAutoGraph }</span>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
			<div  class="many-chat" id="many-chat"  hidden>
				<span style="margin:30px 30px;font-size:24px;display: inline-block;">该项需要时在开发</span>
			</div>
			<div class="chat-list" id="chat-list">
				<ul>
					<c:forEach items="${chatFriends }" var="chatFriend">
						<li  data-id="${chatFriend.userId }">
							<div class="chat-list-friend-image">
								<img src="images/${chatFriend.userPhoto }">
							</div>
							<div class="chat-list-friend-info">
								<span class="chat-list-friend-name">${chatFriend.userName }</span>
								 <span class="friend-list-friend-message">${chatFriend.messageInfo }
								 </span>
								 <span class="cue-circle2">${chatFriend.count }</span>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
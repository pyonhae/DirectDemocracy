<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글 목록 보기</title>
<link href="<%=request.getContextPath()%>/css/board.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.1.js"></script>
<script type="text/javascript">
<!--
	function selectedOptionCheck(){
		$("#type > option[value=<%=request.getParameter("type")%>]").attr("selected", "true");
	}
	
	function moveAction(where){
		switch (where) {
		case 1:
			location.href = "write.do";
			break;
		
		case 2:
			location.href = "list.do";
			break;
		}
	}
//-->
</script>
</head>
<body onload="selectedOptionCheck()">
<div class="wrapper">
	<div class="navBar">
		<ul>
			<li><a href="list.do">스프링  게시판</a></li>
			<li><a href="../logout.do">로그아웃</a></li>		
		</ul>
		<form action="list.do" method="get">		
			<select id="type" name="type">
				<option value="subject">제목</option>
				<option value="content">내용</option>
				<option value="writer">작성자</option>
			</select>
			<input type="text" id="keyword" name="keyword" value="<%if(request.getParameter("keyword") != null){ out.print(new String(request.getParameter("keyword").getBytes("8859_1"), "UTF-8")); } else { out.print(""); }%>" />
			<input type="submit" value="검색" />			
		</form>
	</div>	
	
	<table border="0" class="boardTable">
		<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>댓글수</th>
			<th>조회수</th>
			<th>추천수</th>
			<th>작성일</th>	
		</tr>
		</thead>
		<tbody>
		<c:forEach var="board" items="${boardList}">
		<tr>
			<td class="idx">${board.rnum}</td>
			<td align="left" class="subject">
				<c:if test="${board.comment >= 10}"><img src="<%=request.getContextPath()%>/img/hit.jpg" /></c:if>
				<a href="view.do?idx=${board.idx}">${board.subject}</a></td>
			<td class="writer"><c:choose><c:when test="${board.writerId == userId}"><strong>${board.writer}</strong></c:when><c:otherwise>${board.writer}</c:otherwise></c:choose></td>
			<td class="comment">${board.comment}</td>
			<td class="hitcount">${board.hitcount}</td>
			<td class="recommendcount">${board.recommendcount}</td>
			<td class="writeDate">${board.writeDate}</td>		
		</tr>
		</c:forEach>
		</tbody>
	</table>
	<br />
	${pageHtml}
	<br /><br />
	<input type="button" value="목록" class="writeBt" onclick="moveAction(2)"/>
	<input type="button" value="쓰기" class="writeBt" onclick="moveAction(1)"/>	
</div>
</body>
</html>
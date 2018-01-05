<%--
  Created by IntelliJ IDEA.
  User: sirLiu
  Date: 2018/1/3
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-sm-3 col-md-2 sidebar" id="authorityDiv">
    <ul class="nav nav-sidebar">
        <li class="active"><h3>学生基本情况 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/page/addStudentPage">学生录入</a></li>
        <li><a href="${pageContext.request.contextPath}/page/alterStudentPage">学生基本信息修改</a></li>
        <li><a href="${pageContext.request.contextPath}/page/selectAndDeleteStudentPage">学生基本信息查询/删除</a></li>
    </ul>
    <ul class="nav nav-sidebar">
        <li class="active"><h3>学生成绩 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/page/importGradePage">成绩录入/修改</a></li>
        <li><a href="${pageContext.request.contextPath}/page/selectAndDeleteGradePage">成绩查询/删除</a></li>
        <li><a href="${pageContext.request.contextPath}/page/gradeStatisticsAndRankingPage">成绩统计及排名</a></li>
    </ul>
    <ul class="nav nav-sidebar">
        <li class="active"><h3>班级管理 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/page/chooseCourseWithClassPage">班级选课</a></li>
    </ul>
    <ul class="nav nav-sidebar">
        <li class="active"><h3>特殊情况 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/page/alterStuStatusPage">学籍状态</a></li>
    </ul>
</div>

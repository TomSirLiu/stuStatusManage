<%--
  Created by IntelliJ IDEA.
  User: sirLiu
  Date: 2018/1/3
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-sm-3 col-md-2 sidebar">
    <ul class="nav nav-sidebar">
        <li class="active"><h3>学生基本情况 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/addStudent">学生录入</a></li>
        <li><a href="${pageContext.request.contextPath}/alterStudent">学生基本信息修改</a></li>
        <li><a href="${pageContext.request.contextPath}/selectAndDeleteStudent">学生基本信息查询/删除</a></li>
    </ul>
    <ul class="nav nav-sidebar">
        <li class="active"><h3>学生成绩 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/importScore">成绩录入/修改</a></li>
        <li><a href="${pageContext.request.contextPath}/selectAndDeleteScore">成绩查询/删除</a></li>
        <li><a href="${pageContext.request.contextPath}/gradeStatisticsAndRanking">成绩统计及排名</a></li>
    </ul>
    <ul class="nav nav-sidebar">
        <li class="active"><h3>班级管理 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/chooseCourseWithClass">班级选课</a></li>
    </ul>
    <ul class="nav nav-sidebar">
        <li class="active"><h3>特殊情况 <span class="sr-only">(current)</span></h3></li>
        <li><a href="${pageContext.request.contextPath}/alterStuStatus">学籍状态</a></li>
    </ul>
</div>

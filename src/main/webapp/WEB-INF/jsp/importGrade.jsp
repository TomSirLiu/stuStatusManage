<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="common/nav-sidebar.jsp"/>
<%--stu_id int(5) comment '学号',
    course_id int(5) comment '课程代码',
    schedule_time date comment '选课时间',
    grade int(2) comment '成绩',--%>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">学号</label>
                    <div class="col-sm-8">
                        <%-- 这里要判断学号是否存在 --%>
                        <input type="number" class="form-control" placeholder="import student's ID">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">课程代码</label>
                    <div class="col-sm-8">
                        <%-- 这里要判断课程代码是否存在，以及该学生是否选择了该课程 --%>
                        <input type="number" class="form-control" placeholder="import course's ID">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">成绩</label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" placeholder="import grade">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">录入/修改成绩</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>

<jsp:include page="common/final.jsp"/>
<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>
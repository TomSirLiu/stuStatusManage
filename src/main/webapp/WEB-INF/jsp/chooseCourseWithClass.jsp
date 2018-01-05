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
                    <label class="col-sm-2 control-label">班级编号</label>
                    <div class="col-sm-8">
                        <select class="form-control">
                            <%-- 用js显示出所有的班级编号 --%>
                            <option value="test">test</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">课程代码</label>
                    <div class="col-sm-8">
                        <select class="form-control">
                            <%-- 用js显示出所有的课程代码 --%>
                            <option value="test">test</option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">选课</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>

<jsp:include page="common/final.jsp"/>
<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>
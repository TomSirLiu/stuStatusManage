<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="common/nav-sidebar.jsp"/>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal" id="alterStudentForm" action="/stuStatusManage/alterStudent">
                <div class="form-group">
                    <label class="col-sm-2 control-label">学号</label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="alterStuId" name="alterStuID" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">姓名</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="alterStuName" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">年龄</label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" name="alterStuAge" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">性别</label>
                    <div class="col-sm-8">
                        <label class="radio-inline">
                            <input type="radio" name="alterStuSex" value="男" required="required"> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="alterStuSex" value="女" required="required"> 女
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">籍贯</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="alterStuAddress" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">班级编号</label>
                    <div class="col-sm-8">
                        <select class="form-control" name="alterStuClassID" id="addStuClassID">

                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">所属管理员编号</label>
                    <div class="col-sm-8">
                        <select class="form-control" name="alterStuManagerID" id="addStuManagerID">
                            <%--<option value="james">james</option>--%>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">修改学生基本信息</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>

<jsp:include page="common/final.jsp"/>
<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>
<script src="${pageContext.request.contextPath}/assets/js/myJS/alterStudent.js" ></script>


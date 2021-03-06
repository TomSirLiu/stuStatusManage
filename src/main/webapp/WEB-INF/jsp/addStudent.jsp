<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp" />
<jsp:include page="common/nav.jsp" />

<%--stu_id int(5) primary key comment '学号',
    stu_name varchar(10) comment '学生姓名',
    stu_age int(2) comment '学生年龄',
    stu_sex enum('男','女') comment '学生性别',
    stu_address varchar(10) comment '学生籍贯地址',
    stu_status_id int(2) comment '状态id',
    stu_class_id int(2) comment '班级编号',
    manager_id int(5) comment '管理员编号',--%>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal" id="addStudentForm" action="/stuStatusManage/addStudent">
                <div class="form-group">
                    <label class="col-sm-2 control-label">学号</label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" placeholder="import student's ID" name="addStuID" id="addStuID" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">姓名</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" placeholder="import student's name" name="addStuName" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">年龄</label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" placeholder="import student's age" name="addStuAge" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">性别</label>
                    <div class="col-sm-8">
                        <label class="radio-inline">
                            <input type="radio" name="addStuSex" value="男" required="required"> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="addStuSex" value="女" required="required"> 女
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">籍贯</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" placeholder="import student's address" name="addStuAddress" required="required">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">状态</label>
                    <div class="col-sm-8">
                        <select class="form-control" name="addStuStatusID">
                            <option value="1">在读</option>
                            <option value="2">已毕业</option>
                            <option value="3">留级</option>
                            <option value="4">休学</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">班级名称</label>
                    <div class="col-sm-8">
                        <select class="form-control" name="addStuClassID" id="addStuClassID">

                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">所属管理员的名称</label>
                    <div class="col-sm-8">
                        <select class="form-control" name="addStuManagerID" id="addStuManagerID">
                             <%--<option value="james">james</option>--%>
                        </select>
                    </div>

                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">录入该学生</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>
<jsp:include page="common/final.jsp" />

<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>
<script src="${pageContext.request.contextPath}/assets/js/myJS/addStudent.js" ></script>

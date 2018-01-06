<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="alterStuId">学号</label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" readonly="readonly" id="alterStuId" value="007">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="alterStuName">姓名</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" readonly="readonly" id="alterStuName" value="..">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="alterStuAge">年龄</label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" readonly="readonly" id="alterStuAge" value="3" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="alterStuSex">性别</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" readonly="readonly" id="alterStuSex" value="..">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="alterStuAddress">籍贯</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" readonly="readonly" id="alterStuAddress" value="..">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="alterStuClassName">班级名称</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" readonly="readonly" id="alterStuClassName" value=".." >
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ManagerForAlterStu">所属管理员</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" readonly="readonly" id="ManagerForAlterStu" value="..">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="alterStuStatus">状态</label>
                    <div class="col-sm-8">
                        <select class="form-control" id="alterStuStatus">
                            <option value="在读">在读</option>
                            <option value="已毕业">已毕业</option>
                            <option value="留级">留级</option>
                            <option value="休学">休学</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">修改学籍状态</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>

<jsp:include page="common/final.jsp"/>
<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>

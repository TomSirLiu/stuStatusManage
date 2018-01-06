<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">学生查询</h1>
            <div class="row">
                <div class="col-lg-8"><!-- /.col-lg-8 -->
                    <form class="form-inline">
                        <div class="form-group col-md-4">
                            <label class="col-sm-2 control-label" for="queryStuName">姓名</label>
                            <div class="col-sm-3">
                                <input type="text" class="form-control"  placeholder="import student's name" id="queryStuName">
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label class="col-sm-offset-1 col-sm-2 control-label" for="queryStuAge">年龄</label>
                            <div class="col-sm-2">
                                <input type="number" class="form-control" placeholder="import student's age" id="queryStuAge">
                            </div>
                        </div>
                        <div class="form-group  col-md-4">
                            <label class="col-sm-offset-2 col-sm-2 control-label" for="queryStuSex">性别</label>
                            <div class="col-sm-3">
                                <select class="form-control" id="queryStuSex">
                                    <option value="all">----</option>
                                    <option value="男">男</option>
                                    <option value="女">女</option>
                                </select>
                            </div>
                        </div>
                    </form>
                </div><!-- /.col-lg-8 -->
                <div class="col-lg-4">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Directly query with student's ID" id="queryStuID">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button" onclick="queryStu()">查询学生</button>
                        </span>
                    </div><!-- /input-group -->
                </div><!-- /.col-lg-4 -->
            </div><!-- /.row -->

            <br><br><br>

            <h2 class="sub-header">查询结果</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                        <th>年龄</th>
                        <th>性别</th>
                        <th>籍贯</th>
                        <th>学籍状态</th>
                        <th>班级</th>
                        <th>所属管理员</th>
                        <th>删除</th>
                    </tr>
                    </thead>
                    <tbody id="queryStudents">

                    </tbody>
                </table>
            </div>
            <nav aria-label="...">
                <ul class="pager">
                    <li><a href="javascript:;" onclick="previousPage()">Previous</a></li>
                    <li><a href="javascript:;" onclick="nextPage()">Next</a></li>
                </ul>
            </nav>
        </div>

    </div>
</div>

<jsp:include page="common/final.jsp"/>
<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>
<script src="${pageContext.request.contextPath}/assets/js/myJS/selectAndDeleteStudent.js" ></script>
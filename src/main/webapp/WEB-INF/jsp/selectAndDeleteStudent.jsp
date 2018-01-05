<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="common/nav-sidebar.jsp"/>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">学生查询</h1>
            <div class="row">
                <div class="col-lg-8"><!-- /.col-lg-8 -->
                    <form class="form-inline">
                        <div class="form-group col-md-4">
                            <label class="col-sm-2 control-label">学号</label>
                            <div class="col-sm-3">
                                <input type="number" class="form-control"  placeholder="import student's ID">
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label class="col-sm-offset-1 col-sm-2 control-label">姓名</label>
                            <div class="col-sm-3">
                                <input type="text" class="form-control" placeholder="import student's name">
                            </div>
                        </div>
                        <div class="form-group  col-md-4">
                            <label class="col-sm-offset-2 col-sm-2 control-label">性别</label>
                            <div class="col-sm-3">
                                <select class="form-control">
                                    <option value="男">男</option>
                                    <option value="女">女</option>
                                </select>
                            </div>
                        </div>
                    </form>
                </div><!-- /.col-lg-8 -->
                <div class="col-lg-4">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search for student.">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">查询学生</button>
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
                    <tbody>
                    <tr>
                        <td>1,001</td>
                        <td>Lorem</td>
                        <td>ipsum</td>
                        <td>dolor</td>
                        <td>sit</td>
                        <td>sit</td>
                        <td>sit</td>
                        <td>sit</td>
                        <td><button class="btn btn-primary">删除</button></td>
                    </tr>
                    <tr>
                        <td>1,002</td>
                        <td>amet</td>
                        <td>consectetur</td>
                        <td>adipiscing</td>
                        <td>elit</td>
                        <td>elit</td>
                        <td>elit</td>
                        <td>elit</td>
                        <td><button class="btn btn-primary">删除</button></td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <nav aria-label="...">
                <ul class="pager">
                    <li><a href="#">Previous</a></li>
                    <li><a href="#">Next</a></li>
                </ul>
            </nav>
        </div>

    </div>
</div>

<jsp:include page="common/final.jsp"/>
<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="common/nav-sidebar.jsp"/>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">成绩查询</h1>
            <div class="row">
                <div class="col-lg-6"><!-- /.col-lg-6 -->
                    <div class="input-group">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">学号</button>
                          </span>
                        <input type="number" class="form-control" placeholder="import student's ID">
                    </div><!-- /input-group -->
                </div><!-- /.col-lg-6 -->
                <div class="col-lg-6">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search for student.">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">Go!</button>
                          </span>
                    </div><!-- /input-group -->
                </div><!-- /.col-lg-6 -->
            </div><!-- /.row -->

            <br><br><br>

            <h2 class="sub-header">查询结果</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                        <th>性别</th>
                        <th>班级</th>
                        <th>课程名称</th>
                        <th>成绩</th>
                        <th>删除</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1,001</td>
                        <td>Lorem</td>
                        <td>ipsum</td>
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

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">成绩查询</h1>
            <div class="row">
                <div class="col-lg-7">
                    <div class="input-group">
                        <span class="input-group-addon">
                            学号
                        </span>
                        <input type="number" class="form-control" placeholder="Search for student's ID." id="stuIDForQueryGrade">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button" onclick="queryGrade()" id="queryGradeButton">Go!</button>
                        </span>
                    </div><!-- /input-group -->
                </div><!-- /.col-lg-7 -->
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
                    <tbody id="queryGrade">

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
<script src="${pageContext.request.contextPath}/assets/js/myJS/selectAndDeleteGrade.js" ></script>

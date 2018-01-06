<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="common/init.jsp"/>
<jsp:include page="common/nav.jsp"/>


        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="sub-header">成绩统计条件</h1>
            <!-- Single button -->
            <div class="btn-group col-lg-offset-1 col-lg-3">
                <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    =====统计条件===== <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="#">只按成绩高低排名</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="#">输入课程代码统计并排名</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="#">输入学生号统计并排名</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="#">输入学生总分排名</a></li>
                </ul>
            </div>
            <div class="btn-group col-lg-8">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="根据统计条件输入..">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">统计排名</button>
                    </span>
                </div><!-- /input-group -->
            </div>

            <br><br><br>

            <h2 class="sub-header">成绩分类排名</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>排名</th>
                        <th>学号</th>
                        <th>学生姓名</th>
                        <th>课程代码</th>
                        <th>课程名称</th>
                        <th>课程人数上限</th>
                        <th>课程类型</th>
                        <th>教师号 有时间做一个模态框弹出教师信息</th>
                        <th>分数</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1,001</td>
                        <td>1,001</td>
                        <td>Lorem</td>
                        <td>ipsum</td>
                        <td>sit</td>
                        <td>sit</td>
                        <td>sit</td>
                        <td>sit</td>
                        <td>sit</td>
                    </tr>
                    <tr>
                        <td>1,002</td>
                        <td>1,002</td>
                        <td>amet</td>
                        <td>consectetur</td>
                        <td>adipiscing</td>
                        <td>elit</td>
                        <td>elit</td>
                        <td>elit</td>
                        <td>elit</td>
                    </tr>
                    </tbody>
                </table>
            </div>


        </div>

    </div>
</div>

<jsp:include page="common/final.jsp"/>
<script src="${pageContext.request.contextPath}/assets/js/myJS/base.js" ></script>
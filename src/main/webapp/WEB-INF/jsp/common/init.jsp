<%--
  Created by IntelliJ IDEA.
  User: sirLiu
  Date: 2018/1/3
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="bootstrapForStuStatusManage">
    <meta name="author" content="sirLiu">

    <title>学生学籍管理系统</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="${pageContext.request.contextPath}/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/assets/css/othersCss/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <script src="${pageContext.request.contextPath}/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<!-- userLogin modal -->
<div class="modal fade" id="loginModal">
    <div class="modal-dialog" style="width:588px">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title">请先登陆/注册</h3>
            </div>
            <br>
            <form class="form-horizontal">
                <input type="hidden" name="operate" value="update"/>
                <div class="form-group">
                    <label class="col-sm-3 control-label" style="font-size:17px">身份</label>
                    <div class="col-sm-8">
                        <select class="form-control" id="loginType">
                            <option value="manager">管理员</option>
                            <option value="teacher">教师</option>
                            <option value="student">学生</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label" style="font-size:17px">用户名</label>
                    <div class=" col-sm-8">
                        <input class="form-control" id="loginName">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label" style="font-size:17px">密码</label>
                    <div class="col-sm-8 ">
                        <input type="password" class="form-control" id="loginPassword">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-10">
                        <button type="button" class="btn btn-default btn-primary col-sm-offset-1"
                                onclick="login()">
                            登陆
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- hint modal -->
<div class="modal fade" tabindex="-1" role="dialog" id="hintModal">
    <div class="modal-dialog" role="document" style="width:588px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h3 class="modal-title">提示</h3>
            </div>
            <div class="modal-body">
                <p></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="confirmHint">确定</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->




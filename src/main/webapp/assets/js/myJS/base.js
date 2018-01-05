
var students;
var courses;
var managers;
var classes;

$(function () {
    $.get({
        url:"/stuStatusManage/selectAllStu",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            students = JSON.parse(data).allStudents;
        }
    });
    $.get({
        url:"/stuStatusManage/getAllClasses",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            classes = JSON.parse(data).classes;
        }
    });
    $.get({
        url:"/stuStatusManage/getAllCourses",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            courses = JSON.parse(data).courses;
        }
    });
    $.get({
        url:"/stuStatusManage/getAllManagers",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            managers = JSON.parse(data).managers;
        }
    });
    //去 sessionStorage 取值
    var hasLoginName = window.sessionStorage.getItem("hasLoginName");
    console.log(hasLoginName);
    if(hasLoginName === null ){
        $('#loginModal').modal({backdrop: 'static', keyboard: false});
    }else{
        $("#hasLoginName").html(hasLoginName);
        var hasLoginType = window.sessionStorage.getItem("hasLoginType");
        if(hasLoginType === "teacher"){
            $("#authorityDiv").html('<ul class="nav nav-sidebar">\n' +
                '        <li class="active"><h3>学生成绩 <span class="sr-only">(current)</span></h3></li>\n' +
                '        <li><a href="/stuStatusManage/page/importGradePage">成绩录入/修改</a></li>\n' +
                '        <li><a href="/stuStatusManage/page/selectAndDeleteGradePage">成绩查询/删除</a></li>\n' +
                '    </ul>');
        }else if(hasLoginType === "student"){
            $("#authorityDiv").html('<ul class="nav nav-sidebar">\n' +
                '        <li class="active"><h3>学生基本情况 <span class="sr-only">(current)</span></h3></li>\n' +
                '        <li><a href="/stuStatusManage/page/selectAndDeleteStudentPage">学生基本信息查询</a></li>\n' +
                '    </ul>\n' +
                '    <ul class="nav nav-sidebar">\n' +
                '        <li class="active"><h3>学生成绩 <span class="sr-only">(current)</span></h3></li>\n' +
                '        <li><a href="/stuStatusManage/page/selectAndDeleteGradePage">成绩查询</a></li>\n' +
                '        <li><a href="/stuStatusManage/page/gradeStatisticsAndRankingPage">成绩统计及排名</a></li>\n' +
                '    </ul>');
        }
    }
    //绑定退出登陆按钮
    $("#exitLogin").bind('click',function () {
        window.alert("   即将为您退出登陆!");
        window.sessionStorage.removeItem("hasLoginName");
        window.sessionStorage.removeItem("hasLoginType");
        window.location.reload();
    });
});
function login() {
    var loginType = $("#loginType").val();
    var loginName = $("#loginName").val();
    var loginPassword = $("#loginPassword").val();
    $.get({
        url:"/stuStatusManage/login",
        data:{
            loginType:loginType,
            loginName:loginName,
            loginPassword:loginPassword
        },
        success:function (data) {
            console.log(JSON.parse(data));
            var info = JSON.parse(data);
            if(info.code ==="SUCCESS"){
                window.sessionStorage.setItem("hasLoginType",loginType);
                window.sessionStorage.setItem("hasLoginName",loginName);
                $("#confirmHint").bind("click", function () {
                    window.location.reload();
                });
                $("#hintModal p").html("&nbsp;&nbsp;&nbsp;恭喜，&nbsp;<b>" + loginName + "</b>&nbsp;!用户登陆成功！将为您自动登陆!");
                $('#hintModal').modal({
                    keyboard: false
                });
            }else if(info.code ==="FAIL"){
                $("#hintModal p").html("   " + info.error+"!");
                $('#hintModal').modal({
                    keyboard: false
                });
            }
        }
    });
}
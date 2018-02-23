var students;
var courses;
var managers;
var classes;

$(function () {
    $.get({
        url: "/stuStatusManage/selectAllStu",
        async: false,
        success: function (data) {
            console.log(JSON.parse(data));
            students = JSON.parse(data).allStudents;
        }
    });
    $.get({
        url: "/stuStatusManage/getAllClasses",
        async: false,
        success: function (data) {
            console.log(JSON.parse(data));
            classes = JSON.parse(data).classes;
        }
    });
    $.get({
        url: "/stuStatusManage/getAllCourses",
        async: false,
        success: function (data) {
            console.log(JSON.parse(data));
            courses = JSON.parse(data).courses;
        }
    });
    $.get({
        url: "/stuStatusManage/getAllManagers",
        async: false,
        success: function (data) {
            console.log(JSON.parse(data));
            managers = JSON.parse(data).managers;
        }
    });
    //去 sessionStorage 取值
    var hasLoginName = window.sessionStorage.getItem("hasLoginName");
    console.log(hasLoginName);
    if (hasLoginName === null) {
        $('#loginModal').modal({backdrop: 'static', keyboard: false});
    } else {
        $("#hasLoginName").html(hasLoginName);
        var hasLoginType = window.sessionStorage.getItem("hasLoginType");
        if (hasLoginType === "teacher") {
            $("#authorityDiv").html('<ul class="nav nav-sidebar">\n' +
                '        <li class="active"><h3>&nbsp; &#x5B66;&#x751F;&#x6210;&#x7EE9; <span class="sr-only">(current)</span></h3></li>\n' +
                '        <li><a href="/stuStatusManage/page/importGradePage">&nbsp; &#x6210;&#x7EE9;&#x5F55;&#x5165;/&#x4FEE;&#x6539;</a></li>\n' +
                '        <li><a href="/stuStatusManage/page/selectAndDeleteGradePage">&nbsp; &#x6210;&#x7EE9;&#x67E5;&#x8BE2;/&#x5220;&#x9664;</a></li>\n' +
                '    </ul>');
        } else if (hasLoginType === "student") {
            $("#authorityDiv").html('<ul class="nav nav-sidebar">\n' +
                '        <li class="active"><h3>&nbsp; &#x5B66;&#x751F;&#x57FA;&#x672C;&#x60C5;&#x51B5; <span class="sr-only">(current)</span></h3></li>\n' +
                '        <li><a href="/stuStatusManage/page/selectAndDeleteStudentPage">&nbsp; &#x5B66;&#x751F;&#x57FA;&#x672C;&#x4FE1;&#x606F;&#x67E5;&#x8BE2;</a></li>\n' +
                '    </ul>\n' +
                '    <ul class="nav nav-sidebar">\n' +
                '        <li class="active"><h3>&nbsp; &#x5B66;&#x751F;&#x6210;&#x7EE9; <span class="sr-only">(current)</span></h3></li>\n' +
                '        <li><a href="/stuStatusManage/page/selectAndDeleteGradePage">&nbsp; &#x6210;&#x7EE9;&#x67E5;&#x8BE2;</a></li>\n' +
                '    </ul>');
        } else if (hasLoginType === "manager") {
            $("#authorityDiv").html('<ul class="nav nav-sidebar">' +
                '<li class="active"><h3>&nbsp; &#x5B66;&#x751F;&#x57FA;&#x672C;&#x60C5;&#x51B5; <span class="sr-only">(current)</span></h3></li>' +
                '   <li><a href="/stuStatusManage/page/addStudentPage">&nbsp; &#x5B66;&#x751F;&#x5F55;&#x5165;</a></li>' +
                '   <li><a href="/stuStatusManage/page/alterStudentPage">&nbsp; &#x5B66;&#x751F;&#x57FA;&#x672C;&#x4FE1;&#x606F;&#x4FEE;&#x6539;</a></li>' +
                '   <li><a href="/stuStatusManage/page/selectAndDeleteStudentPage">&nbsp; &#x5B66;&#x751F;&#x57FA;&#x672C;&#x4FE1;&#x606F;&#x67E5;&#x8BE2;/&#x5220;&#x9664;</a></li>' +
                '   </ul>' +
                '   <ul class="nav nav-sidebar">' +
                '   <li class="active"><h3>&nbsp; &#x5B66;&#x751F;&#x6210;&#x7EE9; <span class="sr-only">(current)</span></h3></li>' +
                '   <li><a href="/stuStatusManage/page/importGradePage">&nbsp; &#x6210;&#x7EE9;&#x5F55;&#x5165;/&#x4FEE;&#x6539;</a></li>' +
                '   <li><a href="/stuStatusManage/page/selectAndDeleteGradePage">&nbsp; &#x6210;&#x7EE9;&#x67E5;&#x8BE2;/&#x5220;&#x9664;</a></li>' +
                '   <li><a href="/stuStatusManage/page/gradeStatisticsAndRankingPage">&nbsp; &#x6210;&#x7EE9;&#x7EDF;&#x8BA1;&#x53CA;&#x6392;&#x540D;</a></li>' +
                '   </ul>' +
                '   <ul class="nav nav-sidebar">' +
                '   <li class="active"><h3>&nbsp; &#x73ED;&#x7EA7;&#x7BA1;&#x7406; <span class="sr-only">(current)</span></h3></li>' +
                '   <li><a href="/stuStatusManage/page/chooseCourseWithClassPage">&nbsp; &#x73ED;&#x7EA7;&#x9009;&#x8BFE;</a></li>' +
                '   </ul>' +
                '   <ul class="nav nav-sidebar">' +
                '   <li class="active"><h3>&nbsp; &#x7279;&#x6B8A;&#x60C5;&#x51B5; <span class="sr-only">(current)</span></h3></li>' +
                '   <li><a href="/stuStatusManage/page/alterStuStatusPage">&nbsp;&#x5B66;&#x7C4D;&#x72B6;&#x6001;</a></li>' +
                '   </ul>');
        }
    }
    //绑定退出登陆按钮
    $("#exitLogin").bind('click', function () {
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
        url: "/stuStatusManage/login",
        data: {
            loginType: loginType,
            loginName: loginName,
            loginPassword: loginPassword
        },
        success: function (data) {
            console.log(JSON.parse(data));
            var info = JSON.parse(data);
            if (info.code === "SUCCESS") {
                window.sessionStorage.setItem("hasLoginType", loginType);
                window.sessionStorage.setItem("hasLoginName", loginName);
                $("#confirmHint").bind("click", function () {
                    if (loginType === "manager") {
                        window.location.href = "/stuStatusManage/page/addStudentPage";
                    } else if (loginType === "teacher") {
                        window.location.href = "/stuStatusManage/page/importGradePage";
                    } else if (loginType === "student") {
                        window.location.href = "/stuStatusManage/page/selectAndDeleteStudentPage";
                    } else {
                        window.location.reload();
                    }
                });
                $("#hintModal p").html("&nbsp&nbsp&nbsp;恭喜，&nbsp;<b>" + loginName + "</b>&nbsp;!用户登陆成功！将为您自动登陆!");
                $('#hintModal').modal({
                    keyboard: false
                });
            } else if (info.code === "FAIL") {
                $("#hintModal p").html("   " + info.error + "!");
                $('#hintModal').modal({
                    keyboard: false
                });
            }
        }
    });
}
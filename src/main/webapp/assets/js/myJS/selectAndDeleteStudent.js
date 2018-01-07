/**
 * Created by Sir_Liu on 2018/1/4.
 */

var queryStudents;
var currentPage = 1;
var pageSize = 5;

function queryStu() {
    var queryStuName = $("#queryStuName").val();
    var queryStuAge = $("#queryStuAge").val();
    var queryStuSex = $("#queryStuSex").val();
    var queryStuID = $("#queryStuID").val();
    var hasLoginType = window.sessionStorage.getItem("hasLoginType");
    if (hasLoginType === "student") {
        $.get({
            url: "/stuStatusManage/selectStuByName",
            async: false,
            data: {
                selectStuName: window.sessionStorage.getItem("hasLoginName")
            },
            success: function (data) {
                var currentStudent = JSON.parse(data).student;
                $("#queryStudents").html('<tr>' +
                    '<td>' + currentStudent.stuId + '</td>' +
                    '<td>' + currentStudent.stuName + '</td>' +
                    '<td>' + currentStudent.stuAge + '</td>' +
                    '<td>' + currentStudent.stuSex + '</td>' +
                    '<td>' + currentStudent.stuAddress + '</td>' +
                    '<td>' + currentStudent.stuStatus.stuStatusName + '</td>' +
                    '<td>' + currentStudent.stuClass.className + '</td>' +
                    '<td>' + currentStudent.manager.managerName + '</td>' +
                    '<td><button class="btn btn-primary" onclick="deleteStu(' + currentStudent.stuId + ')">删除</button></td>' +
                    '</tr>');
            }
        });
    } else {
        $.post({
            url: "/stuStatusManage/queryStuByCondition",
            async: false,
            data: {
                queryStuName: queryStuName,
                queryStuAge: queryStuAge,
                queryStuSex: queryStuSex,
                queryStuID: queryStuID
            },
            success: function (data) {
                queryStudents = JSON.parse(data).queryStudents;
                if (queryStudents.length < (currentPage - 1) * pageSize) {
                    currentPage--;
                }
                showQueryStudents();
            }
        })
    }
}

function previousPage() {
    if (queryStudents === undefined) {
        return false;
    }
    if (currentPage > 1) {
        currentPage--;
    }
    showQueryStudents();
}

function nextPage() {
    if (queryStudents === undefined) {
        return false;
    }
    if (currentPage * pageSize < queryStudents.length) {
        currentPage++;
    }
    showQueryStudents();
}

function showQueryStudents() {
    $("#queryStudents").html('');
    for (var i = (currentPage - 1) * pageSize; i < queryStudents.length && i < currentPage * pageSize; i++) {
        var content = '<tr>' +
            '<td>' + queryStudents[i].stuId + '</td>' +
            '<td>' + queryStudents[i].stuName + '</td>' +
            '<td>' + queryStudents[i].stuAge + '</td>' +
            '<td>' + queryStudents[i].stuSex + '</td>' +
            '<td>' + queryStudents[i].stuAddress + '</td>' +
            '<td>' + queryStudents[i].stuStatus.stuStatusName + '</td>' +
            '<td>' + queryStudents[i].stuClass.className + '</td>' +
            '<td>' + queryStudents[i].manager.managerName + '</td>' +
            '<td><button class="btn btn-primary" onclick="deleteStu(' + queryStudents[i].stuId + ')">删除</button></td>' +
            '</tr>';
        $("#queryStudents").append(content);
    }
}

function deleteStu(stuID) {
    var hasLoginType = window.sessionStorage.getItem("hasLoginType");
    if (hasLoginType !== "manager") {
        alert("您不是管理员，无权删除！");
        return false;
    }
    if (window.confirm("确定要删除这个学生的信息吗？")) {
        $.post({
            url: "/stuStatusManage/deleteStuByID",
            data: {deleteStuID: stuID},
            success: function (data) {
                var info = JSON.parse(data);
                if (info.code === "SUCCESS") {
                    alert("删除学生信息成功！");
                    if (queryStudents.length < (currentPage - 1) * pageSize) {
                        currentPage--;
                    }
                    queryStu();
                } else if (info.code === "FAIL") {
                    alert("删除学生信息出错！");
                }
            }
        })
    } else {
        return false;
    }
}
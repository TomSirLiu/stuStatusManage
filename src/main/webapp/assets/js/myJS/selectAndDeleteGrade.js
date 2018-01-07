/**
 * Created by Sir_Liu on 2018/1/6.
 */

var queryGrades;
var currentPage = 1;
var pageSize = 5;

$(function () {
    var hasLoginType = window.sessionStorage.getItem("hasLoginType");
    if (hasLoginType === "student") {
        $("#queryGradeButton").attr('disabled', 'disabled');
        $.get({
            url: "/stuStatusManage/queryGradeWithStuName",
            data: {
                stuName: window.sessionStorage.getItem("hasLoginName")
            },
            success: function (data) {
                var info = JSON.parse(data);
                if (info.code === "SUCCESS") {
                    queryGrades = info.grades;
                    showQueryGrades();
                } else if (info.code === "FAIL") {
                    window.alert(info.error);
                }
            }
        })
    }
});

function queryGrade() {
    var stuID = $("#stuIDForQueryGrade").val();
    $.get({
        url: "/stuStatusManage/queryGradeWithStuID",
        data: {
            stuID: stuID
        },
        success: function (data) {
            var info = JSON.parse(data);
            if (info.code === "SUCCESS") {
                queryGrades = info.grades;
                showQueryGrades();
            } else if (info.code === "FAIL") {
                window.alert(info.error);
            }
        }
    })
}

function showQueryGrades() {
    $("#queryGrade").html("");
    for (var i = (currentPage - 1) * pageSize; i < queryGrades.length && i < currentPage * pageSize; i++) {
        $("#queryGrade").append('<tr>' +
            '<td>' + queryGrades[i].student.stuId + '</td>' +
            '<td>' + queryGrades[i].student.stuName + '</td>' +
            '<td>' + queryGrades[i].student.stuAge + '</td>' +
            '<td>' + queryGrades[i].stuClass.className + '</td>' +
            '<td>' + queryGrades[i].course.courseName + '</td>' +
            '<td>' + queryGrades[i].grade + '</td>' +
            '<td><button class="btn btn-primary" onclick="deleteGrade(' + queryGrades[i].student.stuId + ',' + queryGrades[i].course.courseId + ')">删除</button></td>' +
            '</tr>');
    }
}

function previousPage() {
    if (queryGrades === undefined) {
        return false;
    }
    if (currentPage > 1) {
        currentPage--;
    }
    showQueryGrades();
}

function nextPage() {
    if (queryGrades === undefined) {
        return false;
    }
    if (currentPage * pageSize < queryGrades.length) {
        currentPage++;
    }
    showQueryGrades();
}

function deleteGrade(stuID, courseID) {
    var hasLoginType = window.sessionStorage.getItem("hasLoginType");
    if (hasLoginType !== "manager") {
        alert("您不是管理员，无权删除！");
        return false;
    }
    if (window.confirm("确定要删除这个成绩吗？")) {
        $.post({
            url: "/stuStatusManage/deleteGradeByKey",
            data: {
                stuID: stuID,
                courseID: courseID
            },
            success: function (data) {
                var info = JSON.parse(data);
                if (info.code === "SUCCESS") {
                    alert("删除成绩成功！");
                    queryGrade();
                } else if (info.code === "FAIL") {
                    alert("删除成绩出错！");
                }
            }
        })
    } else {
        return false;
    }
}
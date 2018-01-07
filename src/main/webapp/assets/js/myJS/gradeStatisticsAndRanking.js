/**
 * Created by Sir_Liu on 2018/1/6.
 */

var statisticsType = 'higherGradeFirst';

function switchStatisticsType(type, typeName) {
    statisticsType = type;
    if (type === "groupBySumGrade" || type === "higherGradeFirst") {
        $("#gradeCondition").attr("disabled", "disabled");
    } else {
        $("#gradeCondition").attr("disabled", false);
    }
    $("#conditionButton").html(typeName + '<span class="caret"></span>');
}

function statisticsAndRankGrades() {
    var conditionId = $("#gradeCondition").val();
    $.get({
        url: "/stuStatusManage/" + statisticsType,
        data: {
            statisticsConditionId: conditionId
        },
        success: function (data) {
            var grades = JSON.parse(data).grades;
            $("#queryGradesGroup").html("");
            for (var i = 0; i < grades.length; i++) {
                if (grades[i].grade === undefined) {
                    grades[i].grade = "无";
                }
                $("#queryGradesGroup").append('<tr>' +
                    '<td>' + (i + 1) + '</td>' +
                    '<td>' + grades[i].stuID + '</td>' +
                    '<td>' + grades[i].stuName + '</td>' +
                    '<td>' + grades[i].courseID + '</td>' +
                    '<td>' + grades[i].courseName + '</td>' +
                    '<td>' + grades[i].courseTopLimit + '</td>' +
                    '<td>' + grades[i].courseType + '</td>' +
                    '<td><button class="btn btn-primary" data-toggle="modal" data-target="#teacherModal" onclick="selectTeacherByName(\'' + grades[i].teacherName + '\')">' + grades[i].teacherName + '</button></td>' +
                    '<td>' + grades[i].grade + '</td>' +
                    '</tr>');
            }
        }
    })
}

function selectTeacherByName(teacherName) {
    $.get({
        async: false,
        url: "/stuStatusManage/selectByTeacherName",
        data: {
            teacherName: teacherName
        },
        success: function (data) {
            var teacher = JSON.parse(data).teacher;
            $("#teacherID").val(teacher.teacherId);
            $("#teacherName").val(teacher.teacherName);
            $("#teacherLevel").val(teacher.teacherLevel);
            $("#teacherType").val(teacher.teacherType);
            $("#teacherEntryTime").val(new Date(teacher.teacherEntryTime).toLocaleString());
        }
    })
}
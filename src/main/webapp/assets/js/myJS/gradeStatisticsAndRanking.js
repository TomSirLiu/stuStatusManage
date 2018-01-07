/**
 * Created by Sir_Liu on 2018/1/6.
 */

var statisticsType;

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
                $("#queryGradesGroup").append('<tr>' +
                    '<td>' + (i + 1) + '</td>' +
                    '<td>' + grades[i].stuID + '</td>' +
                    '<td>' + grades[i].stuName + '</td>' +
                    '<td>' + grades[i].courseID + '</td>' +
                    '<td>' + grades[i].courseName + '</td>' +
                    '<td>' + grades[i].courseTopLimit + '</td>' +
                    '<td>' + grades[i].courseType + '</td>' +
                    '<td>' + grades[i].teacherName + '</td>' +
                    '<td>' + grades[i].grade + '</td>' +
                    '</tr>');
            }
        }
    })
}
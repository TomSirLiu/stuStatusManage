/**
 * Created by Sir_Liu on 2018/1/7.
 */

function alterStatus() {
    $.get({
        url: "/stuStatusManage/alterStuStatusByID",
        data: {
            alterStuID: $("#alterStuId").val(),
            stuStatusID: $("#alterStuStatus").val()
        },
        success: function (data) {
            var info = JSON.parse(data);
            if (info.code === "SUCCESS") {
                window.alert("修改学生状态成功");
            } else if (info.code === "FAIL") {
                window.alert(info.error);
            }
        }
    })
}

function selectStu() {
    $.get({
        url: "/stuStatusManage/selectStuByID",
        data: {
            selectStuID: $("#alterStuId").val()
        },
        success: function (data) {
            var info = JSON.parse(data);
            if (info.code === "SUCCESS") {
                $("#alterStuName").val(info.student.stuName);
                $("#alterStuAge").val(info.student.stuAge);
                $("#alterStuSex").val(info.student.stuSex);
                $("#alterStuAddress").val(info.student.stuAddress);
                $("#alterStuClassName").val(info.student.stuClass.className);
                $("#ManagerForAlterStu").val(info.student.manager.managerName);
                $("#alterStuStatus").val(info.student.stuStatus.stuStatusId);
            }
        }
    })
}
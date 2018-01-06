/**
 * Created by Sir_Liu on 2018/1/6.
 */

function importGrade() {
    var stuID = $("#stuID").val();
    var courseID = $("#courseID").val();
    var grade = $("#grade").val();
    if(stuID===""|| courseID===""|| grade===""){
        window.alert("请补全信息！！");
        return false;
    }
    $.get({
        url:"/stuStatusManage/importGrade",
        data:{
            stuID:stuID,
            courseID:courseID,
            grade:grade
        },
        success:function (data) {
            var info =JSON.parse(data);
            if(info.code === "SUCCESS"){
                window.alert(info.successInfo);
                $("#gradeForm")[0].reset();
            }else if(info.code === "FAIL"){
                window.alert(info.error);
                return false;
            }
        }
    })
}
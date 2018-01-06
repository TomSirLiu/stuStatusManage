/**
 * @Author sirLiu
 * @Date 2018/1/4 22:54
 */

$(function () {

    $("#altStuManagerID").html();
    for(var i=0;i<managers.length;i++){
        var content='<option value="'+managers[i].managerId+'">'+managers[i].managerName+'</option>';
        $("#addStuManagerID").append(content);
    }

    $("#altStuClassID").html();
    for(var i=0;i<classes.length;i++){
        var content='<option value="'+classes[i].classId+'">'+classes[i].className+'</option>';
        $("#addStuClassID").append(content);
    }
});

$("#alterStudentForm").submit(function(){
    var existStu = false;
    $.get({
        url:"/stuStatusManage/selectStuByID",
        async:false,
        data:{selectStuID:$("#alterStuId").val()},
        success:function (data) {
            if(JSON.parse(data).code==="SUCCESS"){
                existStu=true;
            }
        }
    });
    if(!existStu){
        alert("不存在这个学号的学生！！");
        return false;
    }
    if(window.confirm("确定要修改这个学生的基本信息吗？")){
        //点击确定的操作
        // $("#addStudentForm").submit();
        alert("修改学生基本信息成功！！");
    }else{
        //点击取消的操作
        //return false 阻止表单提交
        return false;
    }
});
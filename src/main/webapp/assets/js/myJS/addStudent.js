/**
 * @Author sirLiu
 * @Date 2018/1/4 9:40
 */
$(function () {

    $("#addStuManagerID").html();
    for(var i=0;i<managers.length;i++){
        var content='<option value="'+managers[i].managerId+'">'+managers[i].managerName+'</option>';
        $("#addStuManagerID").append(content);
    }

    $("#addStuClassID").html();
    for(var i=0;i<classes.length;i++){
        var content='<option value="'+classes[i].classId+'">'+classes[i].className+'</option>';
        $("#addStuClassID").append(content);
    }
});

$("#addStudentForm").submit(function(){
    var existStu = false;
    $.get({
        url:"/stuStatusManage/selectStuByID",
        async:false,
        data:{selectStuID:$("#addStuID").val()},
        success:function (data) {
            if(JSON.parse(data).code==="SUCCESS"){
                existStu=true;
            }
        }
    });
    if(existStu){
        alert("该学号已存在！！");
        return false;
    }

    if(window.confirm("确定要添加该学生吗？？")){
        //点击确定的操作
        // $("#addStudentForm").submit();
        alert("添加成功！！");
    }else{
        //点击取消的操作
        //return false 阻止表单提交
        return false;
    }
});
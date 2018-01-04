/**
 * @Author sirLiu
 * @Date 2018/1/4 22:54
 */

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
        alert("has not exist the student!!");
        return false;
    }
    if(window.confirm("would u like to alter this new student?")){
        //点击确定的操作
        // $("#addStudentForm").submit();
        alert("alter success!!");
    }else{
        //点击取消的操作
        //return false 阻止表单提交
        return false;
    }
});
/**
 * @Author sirLiu
 * @Date 2018/1/4 9:40
 */
$("#addStudentForm").submit(function(){

    if(window.confirm("你确定要取消录入该学生吗？")){
        //点击确定的操作

    }else{
        //点击取消的操作
        //return false 阻止表单提交
        return false;
    }
});
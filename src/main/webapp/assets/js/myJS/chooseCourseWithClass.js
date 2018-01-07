/**
 * Created by Sir_Liu on 2018/1/7.
 */

$(function () {
   $.get({
       url:"/stuStatusManage/getAllClasses",
       success:function (data) {
           var classes = JSON.parse(data).classes;
           $("#allClassName").html("");
           for(var i=0;i<classes.length;i++){
               $("#allClassName").append('<option value="'+classes[i].classId+'">'+classes[i].className+'</option>');
           }
       }
   });
    $.get({
       url:"/stuStatusManage/getAllCourses",
       success:function (data) {
           var courses = JSON.parse(data).courses;
           $("#allCourseName").html("");
           for(var i=0;i<courses.length;i++){
               $("#allCourseName").append('<option value="'+courses[i].courseId+'">'+courses[i].courseName+'</option>');
           }
       }
   })
});

function chooseCourse() {
    var classID =  $("#allClassName").val();
    var courseID =  $("#allCourseName").val();
    $.post({
        url:"/stuStatusManage/chooseCourseWithClass",
        data:{
            classID:classID,
            courseID:courseID
        },
        success:function (data) {
            var info = JSON.parse(data);
            if(info.code === "SUCCESS"){
                window.alert("选课成功！");
            }else if(info.code==="FAIL"){
                window.alert("###"+info.error+"###\n\n"+info.repeatStudentsName);
            }
        }
    });
}
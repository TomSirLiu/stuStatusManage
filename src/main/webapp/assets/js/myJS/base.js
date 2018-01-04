
var students;
var courses;
var managers;
var classes;

$(function () {
    $.get({
        url:"/stuStatusManage/selectAllStu",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            students = JSON.parse(data).allStudents;
        }
    });
    $.get({
        url:"/stuStatusManage/getAllClasses",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            classes = JSON.parse(data).classes;
        }
    });
    $.get({
        url:"/stuStatusManage/getAllCourses",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            courses = JSON.parse(data).courses;
        }
    });
    $.get({
        url:"/stuStatusManage/getAllManagers",
        async:false,
        success:function (data) {
            console.log(JSON.parse(data));
            managers = JSON.parse(data).managers;
        }
    });
});
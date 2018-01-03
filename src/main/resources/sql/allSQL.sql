use student_management;
show tables;
show create table stu_status;

-- 管理员表
create table manager(
	manager_id int(5) primary key comment '管理员编号',
    manager_name varchar(10) comment '管理员姓名',
    manager_sex enum('男','女') comment '管理员性别',
	manager_living_address varchar(10) comment '管理员住址'
)charset utf8 comment '管理员表';

-- 班级class
create table class(
	class_id int(2) primary key comment '班级编号',
    class_grade int(2) comment '班级所在年级',
    class_name varchar(10) comment '班级名称'
)charset utf8 comment '班级表';

-- 学生状态 字段：状态id、状态名称  插入记录（在读，已毕业，留级，休学）
create table stu_status(
	stu_status_id int(2) primary key comment '状态id',
	stu_status_name varchar(5) comment '状态名称'
) charset utf8 comment '学生状态';
insert into stu_status values(1,'在读');
insert into stu_status values(2,'已毕业');
insert into stu_status values(3,'留级');
insert into stu_status values(4,'休学');

-- 学生
create table student(
	stu_id int(5) primary key comment '学号',
    stu_name varchar(10) comment '学生姓名',
    stu_age int(2) comment '学生年龄',
    stu_sex enum('男','女') comment '学生性别',
    stu_address varchar(10) comment '学生籍贯地址',
    stu_status_id int(2) comment '状态id',
    stu_class_id int(2) comment '班级编号',
    manager_id int(5) comment '管理员编号',
    foreign key (stu_status_id) references stu_status(stu_status_id),
    foreign key (stu_class_id) references class(class_id),
    foreign key (manager_id) references manager(manager_id)
) charset utf8 comment '学生基本信息表';

-- 教师
create table teacher(
	teacher_id int(2) primary key comment '教师号',
    teacher_name varchar(4) comment '教师姓名',
    teacher_level int(2) comment '教师等级',
    teacher_type enum('讲师','教授','助教'),
    teacher_entry_time 	date comment '教师入职时间'
)charset utf8 comment '教师表';

-- 课程 字段：
create table course(
	course_id int(5) primary key comment '课程代码',
    course_name varchar(10) comment '课程名称',
    course_top_limit int(5) comment '课程人数上限',
    course_type enum('选修','必修') comment '课程类型',
    teacher_id int(5) comment '教师号',
    foreign key (teacher_id) references teacher(teacher_id)
) charset utf8 comment '课程表';

-- 选课及成绩表
create table grade(
	stu_id int(5) comment '学号',
    course_id int(5) comment '课程代码',
    schedule_time date comment '选课时间',
    grade int(2) comment '成绩',
    foreign key(stu_id) references student(stu_id),
    foreign key(course_id) references course(course_id),
    primary key(stu_id,course_id)
)charset utf8 comment '选课及成绩表';




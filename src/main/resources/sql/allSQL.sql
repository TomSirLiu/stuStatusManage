USE student_management;
SHOW TABLES;
SHOW CREATE TABLE stu_status;

-- 管理员表
CREATE TABLE manager (
  manager_id             INT(5) PRIMARY KEY COMMENT '管理员编号',
  manager_name           VARCHAR(10) COMMENT '管理员姓名',
  manager_sex            ENUM ('男', '女') COMMENT '管理员性别',
  manager_living_address VARCHAR(10) COMMENT '管理员住址'
)CHARSET utf8 COMMENT '管理员表';
INSERT INTO manager VALUES (001, '刘主任', '男', '天河区中兴路事务所');
INSERT INTO manager VALUES (002, '林助理', '男', '天河区广东工业大学');
INSERT INTO manager VALUES (003, '王小姐', '女', '广州市');

-- 班级class
CREATE TABLE class (
  class_id    INT(2) PRIMARY KEY COMMENT '班级编号',
  class_grade INT(2) COMMENT '班级所在年级',
  class_name  VARCHAR(10) COMMENT '班级名称'
)
  CHARSET utf8
  COMMENT '班级表';
INSERT INTO class VALUES (001, 2015, 'MIS1');
INSERT INTO class VALUES (002, 2016, 'MIS2');
INSERT INTO class VALUES (003, 2015, '临床1');
INSERT INTO class VALUES (004, 2015, '临床2');
INSERT INTO class VALUES (005, 2017, '会计1');
INSERT INTO class VALUES (006, 2017, '会计2');
INSERT INTO class VALUES (007, 2015, '金工1');
INSERT INTO class VALUES (008, 2016, '管科1');
INSERT INTO class VALUES (009, 2015, '管科2');
INSERT INTO class VALUES (010, 2016, '信工1');
INSERT INTO class VALUES (011, 2015, '信工2');
INSERT INTO class VALUES (012, 2015, '信工3');

-- 学生状态 字段：状态id、状态名称  插入记录（在读，已毕业，留级，休学）
CREATE TABLE stu_status (
  stu_status_id   INT(2) PRIMARY KEY COMMENT '状态id',
  stu_status_name VARCHAR(5) COMMENT '状态名称'
)CHARSET utf8 COMMENT '学生状态';
INSERT INTO stu_status VALUES (1, '在读');
INSERT INTO stu_status VALUES (2, '已毕业');
INSERT INTO stu_status VALUES (3, '留级');
INSERT INTO stu_status VALUES (4, '休学');

-- 学生
CREATE TABLE student (
  stu_id        INT(5) PRIMARY KEY COMMENT '学号',
  stu_name      VARCHAR(10) COMMENT '学生姓名',
  stu_age       INT(2) COMMENT '学生年龄',
  stu_sex       ENUM ('男', '女') COMMENT '学生性别',
  stu_address   VARCHAR(10) COMMENT '学生籍贯地址',
  stu_status_id INT(2) COMMENT '状态id',
  stu_class_id  INT(2) COMMENT '班级编号',
  manager_id    INT(5) COMMENT '管理员编号',
  FOREIGN KEY (stu_status_id) REFERENCES stu_status (stu_status_id),
  FOREIGN KEY (stu_class_id) REFERENCES class (class_id),
  FOREIGN KEY (manager_id) REFERENCES manager (manager_id)
)CHARSET utf8 COMMENT '学生基本信息表';
SELECT * FROM student;
INSERT INTO student VALUES (123456789, '王二', 22, '男', '广东广州', 1, 1, 1);

-- 教师
CREATE TABLE teacher (
  teacher_id         INT(2) PRIMARY KEY COMMENT '教师号',
  teacher_name       VARCHAR(4) COMMENT '教师姓名',
  teacher_level      INT(2) COMMENT '教师等级',
  teacher_type       ENUM ('讲师', '教授', '助教'),
  teacher_entry_time DATE COMMENT '教师入职时间'
)CHARSET utf8 COMMENT '教师表';
SELECT * FROM teacher;
INSERT INTO teacher VALUES (001, '丁老师', 2, '教授', now());
INSERT INTO teacher VALUES (002, '吴老师', 2, '教授', now());
INSERT INTO teacher VALUES (003, '王老师', 1, '教授', now());
INSERT INTO teacher VALUES (004, '林讲师', 3, '讲师', now());
INSERT INTO teacher VALUES (005, '欧阳助教', 4, '助教', now());

-- 课程 字段：
CREATE TABLE course (
  course_id        INT(5) PRIMARY KEY COMMENT '课程代码',
  course_name      VARCHAR(10) COMMENT '课程名称',
  course_top_limit INT(5) COMMENT '课程人数上限',
  course_type      ENUM ('选修', '必修') COMMENT '课程类型',
  teacher_id       INT(2) COMMENT '教师号',
  FOREIGN KEY (teacher_id) REFERENCES teacher (teacher_id)
)CHARSET utf8 COMMENT '课程表';
SELECT * FROM course;
INSERT INTO course VALUES (001, '中美关系与大国政治', 199, '选修', 004);
INSERT INTO course VALUES (002, 'javaWeb课设', 80, '必修', 001);
INSERT INTO course VALUES (003, '数据库课程设计', 80, '必修', 002);
INSERT INTO course VALUES (004, '心理电影赏析', 180, '选修', 003);
INSERT INTO course VALUES (005, '计算机网络', 80, '必修', 002);
INSERT INTO course VALUES (006, '毛泽东概论', 250, '必修', 005);

-- 选课及成绩表
CREATE TABLE grade (
  stu_id        INT(5) COMMENT '学号',
  course_id     INT(5) COMMENT '课程代码',
  schedule_time DATETIME COMMENT '选课时间',
  grade         INT(2) COMMENT '成绩',
  FOREIGN KEY (stu_id) REFERENCES student (stu_id),
  FOREIGN KEY (course_id) REFERENCES course (course_id),
  PRIMARY KEY (stu_id, course_id)
) CHARSET utf8 COMMENT '选课及成绩表';
SELECT *
FROM grade;
INSERT INTO grade VALUES (283301193, 001, now(), 88);
INSERT INTO grade VALUES (283301193, 002, now(), 78);
INSERT INTO grade VALUES (283301193, 003, now(), 98);
INSERT INTO grade VALUES (388300659, 001, now(), 91);
INSERT INTO grade VALUES (388300659, 002, now(), 81);
INSERT INTO grade VALUES (388300659, 003, now(), 79);
ALTER TABLE grade
  MODIFY COLUMN schedule_time DATETIME COMMENT '选课时间';


SELECT
  student.stu_id,
  student.stu_name,
  course.course_id,
  course.course_name,
  course.course_top_limit,
  course.course_type,
  teacher.teacher_name,
  sum(grade) AS total_score
FROM grade, student, course, teacher
WHERE grade.stu_id = student.stu_id AND grade.course_id = course.course_id AND course.teacher_id = teacher.teacher_id
GROUP BY grade.stu_id
ORDER BY total_score DESC;

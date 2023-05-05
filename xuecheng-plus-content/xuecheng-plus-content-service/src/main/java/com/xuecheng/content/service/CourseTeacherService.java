package com.xuecheng.content.service;

import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

public interface CourseTeacherService {

    /**
     * 查询教师接口
     */
    List<CourseTeacher> getCourseTeacherList(Long courseId);

    /**
     * 修改/添加教师接口
     */
    CourseTeacher saveCourseTeacher(CourseTeacher courseTeacher);

    /**
     * 删除教师接口
     */
    void deleteCourseTeacher(Long courseId, Long teacherId);
}

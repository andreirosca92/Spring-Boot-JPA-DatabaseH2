package org.javadev.springbootquickstart.course.service;

import java.util.ArrayList;
import java.util.List;


import org.javadev.springbootquickstart.course.model.Course;
import org.javadev.springbootquickstart.course.repository.CourseRepository;

import org.springframework.stereotype.Component;


@Component
public interface CourseService {


  public List<Course> getAllCourses(String topicId);

  public Course getCourse(String id);


  public void addCourse(Course course);


  public void updateCourse(Course course);

  public void deleteCourse(String id);

}

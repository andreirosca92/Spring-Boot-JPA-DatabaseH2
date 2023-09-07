package org.javadev.springbootquickstart.course.serviceimpl;

import jakarta.transaction.Transactional;
import org.javadev.springbootquickstart.course.model.Course;
import org.javadev.springbootquickstart.course.repository.CourseRepository;
import org.javadev.springbootquickstart.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Transactional
    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    @Transactional
    public Course getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    @Transactional
    public void addCourse(Course course){
        courseRepository.save(course);
    }

    @Transactional
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }
    @Transactional
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}

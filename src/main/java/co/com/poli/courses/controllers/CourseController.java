package co.com.poli.courses.controllers;

import co.com.poli.courses.entities.Course;
import co.com.poli.courses.services.course.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping()
    public List<Course> findAll(){
        return courseService.findAll();
    }

    @PostMapping()
    public Course create(@RequestBody Course course){
        return courseService.create(course);
    }
}

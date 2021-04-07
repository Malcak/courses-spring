package co.com.poli.courses.services.course;

import co.com.poli.courses.entities.Course;
import co.com.poli.courses.repositories.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course create(Course course) {
        return courseRepository.save(course);
    }
}

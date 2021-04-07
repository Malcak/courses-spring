package co.com.poli.courses.services.teacher;

import co.com.poli.courses.entities.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> findAll();

    Teacher create(Teacher teacher);

}

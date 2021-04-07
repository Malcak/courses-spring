package co.com.poli.courses.controllers;

import co.com.poli.courses.entities.Teacher;
import co.com.poli.courses.services.teacher.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping()
    public List<Teacher> findAll(){
        return teacherService.findAll();
    }

    @PostMapping()
    public Teacher create(@RequestBody Teacher teacher){
        return teacherService.create(teacher);
    }
}

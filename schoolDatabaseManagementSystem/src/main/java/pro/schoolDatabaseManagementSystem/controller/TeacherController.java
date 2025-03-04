package pro.schoolDatabaseManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.schoolDatabaseManagementSystem.entity.Teacher;
import pro.schoolDatabaseManagementSystem.repo.Teacherrepo;
import pro.schoolDatabaseManagementSystem.service.TeacherService;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService TeacherService;

    @PostMapping("/teacher/add")
    public Teacher saveTeacher(@RequestBody Teacher teacher)
    {
        return TeacherService.createTeacher(teacher);
    }

    @GetMapping("/teacher/all")
    public Iterable<Teacher> getAllTeachers()
    {
        return TeacherService.getAllTeachers(new Teacher());
    }

    @Autowired
    private Teacherrepo teacherrepo;
    @PutMapping("/teacher/update/{id}")
    public Teacher updateTeacher(@PathVariable int id)
    {
        return TeacherService.updateTeacher(teacherrepo.findById(id).get());
    }
    @DeleteMapping("/teacher/delete/{id}")
    public void deleteTeacher(@PathVariable int id)
    {
        Teacher teacher =TeacherService.deleteTeacher(teacherrepo.findById(id).get());
         teacherrepo.delete(teacher);
    }
}

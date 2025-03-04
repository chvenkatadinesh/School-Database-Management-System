package pro.schoolDatabaseManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.schoolDatabaseManagementSystem.entity.Student;
import pro.schoolDatabaseManagementSystem.repo.StudentRepo;
import pro.schoolDatabaseManagementSystem.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students/add")
    public Student saveStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/students/all")
    public Iterable<Student> getAllStudents(){
        return studentService.getallStudents(new Student());
    }
    @Autowired
    private StudentRepo studentRepo;
    @PutMapping("/students/update/{id}")
    public Student updateStudents(@PathVariable int id){
        return studentService.updateStudents(studentRepo.findById(id).get());
    }

    @DeleteMapping("/students/delete/{id}")
    public void  deleteStudent(@PathVariable int id){
        Student stu=studentService.deleteStudent(studentRepo.findById(id).get());
        studentRepo.delete(stu);
    }
}

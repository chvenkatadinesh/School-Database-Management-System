package pro.schoolDatabaseManagementSystem.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import pro.schoolDatabaseManagementSystem.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    //Student details
    Student createStudent(Student student);
    List<Student> getallStudents(Student student);
    Student updateStudents(Student student);
    Student deleteStudent(Student student);
}

package pro.schoolDatabaseManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import pro.schoolDatabaseManagementSystem.entity.Student;
import pro.schoolDatabaseManagementSystem.repo.StudentRepo;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getallStudents(Student student) {
        List<Student> students = studentRepo.findAll();
        return students;
    }

    @Override
    public Student updateStudents(Student student) {
        Student Student = studentRepo.findById(student.getId()).get();
        student.setStudentname("SamWell");
        student.setStudentAddress("897 houseTarly HornHill");
        student.setStudentEmail("samwell@gmail.com");
        return studentRepo.save(student);
    }

    @Override
    public Student deleteStudent(Student student) {
        return studentRepo.save(student);
    }

}

package pro.schoolDatabaseManagementSystem.service;

import org.springframework.stereotype.Service;
import pro.schoolDatabaseManagementSystem.entity.Teacher;

import java.util.List;

@Service
public interface TeacherService {

    Teacher createTeacher(Teacher teacher);
    List<Teacher> getAllTeachers(Teacher teacher);
    Teacher updateTeacher(Teacher teacher);
    Teacher deleteTeacher(Teacher teacher);

}
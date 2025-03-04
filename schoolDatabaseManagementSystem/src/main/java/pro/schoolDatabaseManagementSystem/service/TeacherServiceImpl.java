package pro.schoolDatabaseManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.schoolDatabaseManagementSystem.entity.Teacher;
import pro.schoolDatabaseManagementSystem.repo.Teacherrepo;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private Teacherrepo teacherRepo;

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }
    @Override
    public List<Teacher> getAllTeachers(Teacher teacher) {
        List<Teacher> teachers = teacherRepo.findAll();
        return teachers;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        Teacher teacher1=teacherRepo.findById(teacher.getId()).get();
        teacher1.setTeachername("Bhoopalan");
        return teacherRepo.save(teacher);
    }

    @Override
    public Teacher deleteTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }
}

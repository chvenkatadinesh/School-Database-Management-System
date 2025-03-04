package pro.schoolDatabaseManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.schoolDatabaseManagementSystem.entity.Teacher;

@Repository
public interface Teacherrepo extends JpaRepository<Teacher,Integer> {

}

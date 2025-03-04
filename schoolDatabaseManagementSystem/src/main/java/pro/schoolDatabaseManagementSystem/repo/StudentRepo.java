package pro.schoolDatabaseManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.schoolDatabaseManagementSystem.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{



}

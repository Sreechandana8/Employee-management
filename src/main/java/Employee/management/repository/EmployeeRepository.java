package Employee.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee.management.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

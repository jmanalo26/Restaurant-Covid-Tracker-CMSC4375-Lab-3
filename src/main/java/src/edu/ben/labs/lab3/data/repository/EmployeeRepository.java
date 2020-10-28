package src.edu.ben.labs.lab3.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import src.edu.ben.labs.lab3.data.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Page<Employee> findByID(String name, final Pageable pageable);
    Page<Employee> findByFirstName(String name, final Pageable pageable);
    Page<Employee> findByLastName(String name, final Pageable pageable);
    Page<Employee> findByEmail(String name, final Pageable pageable);
    Page<Employee> findByPhone(String name, final Pageable pageable);
    Page<Employee> findByBirthday(String name, final Pageable pageable);
    Page<Employee> findByEntryDate(String name, final Pageable pageable);
    Page<Employee> findByAddressID(String name, final Pageable pageable);
    Page<Employee> findByRestaurantID(String name, final Pageable pageable);
    List<Employee> findByCovidPos(boolean value);
}

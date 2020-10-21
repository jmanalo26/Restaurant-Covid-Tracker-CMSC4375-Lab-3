package src.edu.ben.labs.lab3.data.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import src.edu.ben.labs.lab3.data.model.Employee;
import src.edu.ben.labs.lab3.data.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Page<Employee> findEmployeeID(String query, Integer page, Integer limit) {
        return employeeRepository.findByID(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findFirstName(String query, Integer page, Integer limit) {
        return employeeRepository.findByFirstName(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findLastName(String query, Integer page, Integer limit) {
        return employeeRepository.findByLastName(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findEmail(String query, Integer page, Integer limit) {
        return employeeRepository.findByEmail(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findPhoneNum(String query, Integer page, Integer limit) {
        return employeeRepository.findByPhone(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findEntryDate(String query, Integer page, Integer limit) {
        return employeeRepository.findByEntryDate(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findBirthday(String query, Integer page, Integer limit) {
        return employeeRepository.findByBirthday(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findAddressID(String query, Integer page, Integer limit) {
        return employeeRepository.findByAddressID(query, PageRequest.of(page, limit));
    }

    public Page<Employee> findRestaurantID(String query, Integer page, Integer limit) {
        return employeeRepository.findByRestaurantID(query, PageRequest.of(page, limit));
    }
}

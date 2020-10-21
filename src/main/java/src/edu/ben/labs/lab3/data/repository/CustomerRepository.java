package src.edu.ben.labs.lab3.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import src.edu.ben.labs.lab3.data.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findByCustomerID(String name, final Pageable pageable);
    Page<Customer> findByFirstName(String name, final Pageable pageable);
    Page<Customer> findByLastName(String name, final Pageable pageable);
    Page<Customer> findByEmail(String name, final Pageable pageable);
    Page<Customer> findByPhone(String name, final Pageable pageable);
    Page<Customer> findByBirthday(String name, final Pageable pageable);
    Page<Customer> findByEntryDate(String name, final Pageable pageable);
    Page<Customer> findByAddressID(String name, final Pageable pageable);
    Page<Customer> findByRestaurantID(String name, final Pageable pageable);
}

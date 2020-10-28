package src.edu.ben.labs.lab3.data.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import src.edu.ben.labs.lab3.data.model.Address;
import src.edu.ben.labs.lab3.data.model.Customer;
import src.edu.ben.labs.lab3.data.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(final CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Page<Customer> findCustomerID (String query, Integer page, Integer limit) {
        return customerRepository.findByCustomerID(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findFirstName (String query, Integer page, Integer limit) {
        return customerRepository.findByFirstName(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findLastName (String query, Integer page, Integer limit) {
        return customerRepository.findByLastName(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findEmail (String query, Integer page, Integer limit) {
        return customerRepository.findByEmail(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findPhoneNum (String query, Integer page, Integer limit) {
        return customerRepository.findByPhone(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findEntryDate (String query, Integer page, Integer limit) {
        return customerRepository.findByEntryDate(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findBirthday (String query, Integer page, Integer limit) {
        return customerRepository.findByBirthday(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findAddressID (String query, Integer page, Integer limit) {
        return customerRepository.findByAddressID(query, PageRequest.of(page, limit));
    }

    public Page<Customer> findRestaurantID (String query, Integer page, Integer limit) {
        return customerRepository.findByRestaurantID(query, PageRequest.of(page, limit));
    }

    public List<Customer> findCovid () {
        return customerRepository.findByCovidPos(true);
    }
}

package src.edu.ben.labs.lab3.data.service;
import src.edu.ben.labs.lab3.data.model.Address;
import src.edu.ben.labs.lab3.data.repository.AddressRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Service for address to find address attributes
 */
@Service
public class AddressService {
    private final AddressRepository addressRepository;
    public AddressService(final AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Page<Address> findAddressID (String query, Integer page, Integer limit) {
        return addressRepository.findByAddressID(query, PageRequest.of(page, limit));
        }

    public Page<Address> findStreet1 (String query, Integer page, Integer limit) {
        return addressRepository.findByStreet1(query, PageRequest.of(page, limit));
    }

    public Page<Address> findStreet2 (String query, Integer page, Integer limit) {
        return addressRepository.findByStreet2(query, PageRequest.of(page, limit));
    }

    public Page<Address> findStreet3 (String query, Integer page, Integer limit) {
        return addressRepository.findByStreet3(query, PageRequest.of(page, limit));
    }

    }


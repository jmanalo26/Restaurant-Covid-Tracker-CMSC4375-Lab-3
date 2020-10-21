package src.edu.ben.labs.lab3.data.repository;
import src.edu.ben.labs.lab3.data.model.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{
    Page<Address> findByAddressID(String name, final Pageable pageable);
    Page<Address> findByStreet1(String name, final Pageable pageable);
    Page<Address> findByStreet2(String name, final Pageable pageable);
    Page<Address> findByStreet3(String name, final Pageable pageable);

}

package src.edu.ben.labs.lab3.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import src.edu.ben.labs.lab3.data.model.Restaurant;

import java.util.List;

/**
 * Repository search functions for restaurants
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>  {
    List<Restaurant> findByRestaurantID(int num);
    Page<Restaurant> findByName(String name, final Pageable pageable);
    Page<Restaurant> findByEmail(String name, final Pageable pageable);
    Page<Restaurant> findByPhone(String name, final Pageable pageable);
    List<Restaurant> findByAddressID(int num);
}

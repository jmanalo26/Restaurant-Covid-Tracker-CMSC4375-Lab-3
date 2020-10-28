package src.edu.ben.labs.lab3.data.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import src.edu.ben.labs.lab3.data.model.Restaurant;
import src.edu.ben.labs.lab3.data.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    public RestaurantService(final RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> findRestaurantID(int query, Integer page, Integer limit) {
        return restaurantRepository.findByRestaurantID(query);
    }

    public Page<Restaurant> findRestaurantName(String query, Integer page, Integer limit) {
        return restaurantRepository.findByName(query, PageRequest.of(page, limit));
    }

    public Page<Restaurant> findRestaurantEmail(String query, Integer page, Integer limit) {
        return restaurantRepository.findByEmail(query, PageRequest.of(page, limit));
    }

    public Page<Restaurant> findRestaurantPhone(String query, Integer page, Integer limit) {
        return restaurantRepository.findByPhone(query, PageRequest.of(page, limit));
    }

    public List<Restaurant> findRestaurantAddress(int query, Integer page, Integer limit) {
        return restaurantRepository.findByAddressID(query);
    }
}

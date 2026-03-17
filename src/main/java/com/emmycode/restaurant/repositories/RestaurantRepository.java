package com.emmycode.restaurant.repositories;

import com.emmycode.restaurant.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {
    // To-Do: Custom Queries
}

package com.lhfff.cardealerapi.repository;

import com.lhfff.cardealerapi.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("CarRepository")
public interface CarRepository extends MongoRepository<Car, String> {
}

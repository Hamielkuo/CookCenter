package com.CookCenter.repository;
import com.CookCenter.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Customer, String> {
	
	Customer findByUsername(String username);
}
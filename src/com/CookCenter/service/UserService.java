package com.CookCenter.service;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CookCenter.Entity.Customer;
import com.CookCenter.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Customer create(Customer customer) {

		customer.setId(UUID.randomUUID().toString());
	    return userRepository.save(customer);
	}

}

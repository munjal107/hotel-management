package com.hotel.management.Controller;

import com.hotel.management.Model.Hotel;
import com.hotel.management.Model.Rewards;
import com.hotel.management.Service.CustomerService;
import com.hotel.management.Service.HotelService;
import com.hotel.management.Service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.hotel.management.Model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	HotelService hotelService;

	@Autowired
	RewardsService rewardsService;



	@PostMapping("/signup")
	public String addUser(@RequestBody Customer data) {
		System.out.println("->"+data);
		
		String password = data.getPassword();
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		password = encoder.encode(password);
		data.setPassword(password);

		customerService.addCustomer(data);
		
		return "success";
	}

	@PutMapping("/update/{id}")
	public String updateCustomer(@RequestBody Customer c, @PathVariable long id){
		customerService.updateCustomer(c, id);
		return "success";
	}

	// hotel-id
	@GetMapping("/enroll/{custid}/{id}")
	public ResponseEntity<String> enrollAsCustomer(@PathVariable Long custid,@PathVariable Long id){
		Hotel hotel = hotelService.getHotelById(id);
		Customer customer = customerService.getCustomerById(custid);

		Rewards rewards = new Rewards();
		rewards.setCustomer(customer);
		rewards.setHotel(hotel);
		rewards.setLoyaltyBonus(5000);

		// TO-DO
		// If customer is already enrolled throw exception


		return rewardsService.enrollCustomer(rewards);

	}


	
	
	
}

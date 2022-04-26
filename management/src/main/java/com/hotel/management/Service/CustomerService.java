package com.hotel.management.Service;

import com.hotel.management.Model.Customer;
import org.springframework.http.ResponseEntity;

public interface CustomerService {

    public Customer addCustomer(Customer c);
    public Customer updateCustomer(Customer c, long id);
    public Customer getCustomerById(long id);

}

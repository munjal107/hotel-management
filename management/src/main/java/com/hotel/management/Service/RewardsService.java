package com.hotel.management.Service;

import com.hotel.management.Model.Rewards;
import org.springframework.http.ResponseEntity;

public interface RewardsService {

    public ResponseEntity<String> enrollCustomer(Rewards rewards);
}

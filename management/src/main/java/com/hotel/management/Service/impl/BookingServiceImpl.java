package com.hotel.management.Service.impl;

import com.hotel.management.Repository.BookingRepository;
import com.hotel.management.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
}

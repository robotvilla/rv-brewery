package com.robotvilla.rvbrewery.services;

import com.robotvilla.rvbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}

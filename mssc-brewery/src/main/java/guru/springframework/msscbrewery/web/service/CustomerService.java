package guru.springframework.msscbrewery.web.service;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomer(UUID customerId);
}

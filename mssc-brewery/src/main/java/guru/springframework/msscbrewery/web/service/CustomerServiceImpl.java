package guru.springframework.msscbrewery.web.service;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomer(UUID customerId) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Abebe")
                .build();
    }
}

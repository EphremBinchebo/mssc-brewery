package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import guru.springframework.msscbrewery.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    private final CustomerService customerService;

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);
    }
}

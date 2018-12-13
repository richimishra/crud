package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    ServiceClass serviceClass;


    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer)
    {
        serviceClass.create(customer);
    }
    @GetMapping("/read")
    public Optional<Customer> getCustomer(@RequestParam Integer id)
    {
        return serviceClass.read(id);

    }
    @GetMapping("/readAll")
    public List<Customer> getAllCustomers(){

        return serviceClass.readAll();
    }
    @PostMapping("/update")
    public boolean updateCustomer(@RequestBody Customer customer)
    {
        return serviceClass.update(customer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id)
    {

        serviceClass.delete(id);
    }
}


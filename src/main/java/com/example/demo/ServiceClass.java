package com.example.demo;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceClass {

    @Autowired
    CustomerRepository customerRepository;

    public Customer create(Customer customer)
    {

      return this.customerRepository.save(customer);

    }

    public Optional<Customer> read(Integer id) {
        return  this.customerRepository.findById(id);

    }


    public boolean update(Customer customer) {


     Customer customer1 = null;
        customer1 = this.customerRepository.save(customer);
        if(customer1!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public void delete(Integer id)
    {
        this.customerRepository.deleteById(id);
    }


    public List<Customer> readAll() {
        List<Customer> toReturn= (List<Customer>) this.customerRepository.findAll();
        return toReturn;
    }
}



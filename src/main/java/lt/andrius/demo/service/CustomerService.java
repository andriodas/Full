package lt.andrius.demo.service;

import lt.andrius.demo.repository.CustomerRepository;
import lt.andrius.demo.repository.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer>getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();

    }
}

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

    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();

    }

    public Customer getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId).get();
    }


    public Customer getMyCustomerById(int id) {
        return customerRepository.findByCustomerNumber(id).get();
    }

    public Customer getMyCustomerByName(String name) {
        return customerRepository.findByCustomerName(name).get();

    }

    public List<Customer> getMyCustomerByNameLike(String customerName) {
        return (List<Customer>) customerRepository.findByCustomerNameLike(customerName);
    }

    public List<Customer> getQueryCustomerByNameLike(String customerName) {
        return (List<Customer>) customerRepository.findByCustomerNameLike(customerName);
    }
}

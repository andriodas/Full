package lt.andrius.demo.controller;

import lt.andrius.demo.repository.model.Customer;
import lt.andrius.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path ="/customermapping")//https://localhost:8080/customermapping
public class CustomerController {
    @Autowired
    private CustomerService customerService;
 //   https://localhost:8080/customermapping/test
    @GetMapping(path ="/test")
    public @ResponseBody String getTestPage() {
        return "This is some test from SPRING";
    }
    @GetMapping(path = "/customer/all")
    public @ResponseBody List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    //http://localhost:8080/customermapping/customer/122
    @GetMapping(path = "/customer/{id}")
    public @ResponseBody Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }
}

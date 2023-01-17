package lt.andrius.demo.controller;

import lt.andrius.demo.repository.model.Customer;
import lt.andrius.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/customermapping")//https://localhost:8080/customermapping
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //   https://localhost:8080/customermapping/test
    @GetMapping(path = "/test")
    public @ResponseBody String getTestPage() {
        return "This is some test from SPRING";
    }

    @GetMapping(path = "/customer/all")
    public @ResponseBody List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    //http://localhost:8080/customermapping/customer/122
    @GetMapping(path = "/customer/{id}")
    public @ResponseBody Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping(path = "/mycustomer/{id}")
    public @ResponseBody Customer getMyCustomerById(@PathVariable int id) {
        return customerService.getMyCustomerById(id);
    }

    //  http://localhost:8080/customermapping/mycustomer/name/{name}
    @GetMapping(path = "/mycustomer/name/{name}")
    public @ResponseBody Customer getMyCutomerByName(@PathVariable String name) {
        return customerService.getMyCustomerByName(name);

    }

    //  http://localhost:8080/customermapping/mycustomer/like/a
    @GetMapping(path = "/mycustomer/like/{name}")
    public @ResponseBody List<Customer> getMyCutomerByNameLike(@PathVariable String name) {
        return customerService.getMyCustomerByNameLike("%" + name + "%");

    }

    //  http://localhost:8080/customermapping/mycustomer/querylike/auto
    @GetMapping(path = "/mycustomer/querylike/{name}")
    public @ResponseBody List<Customer> getQueryCustomerByNameLike(@PathVariable String name) {
        return customerService.getQueryCustomerByNameLike("%" + name + "%");

    }

    // http://localhost:8080/customermapping/mycustomer/id?customerNumber=122
    @GetMapping(path = "/mycustomer/id")
    public @ResponseBody Customer getMyCustomerByIdWithRequestParam(@RequestParam int customerNumber) {
        return customerService.getMyCustomerById(customerNumber);
    }

}

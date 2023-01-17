package lt.andrius.demo.controller;

import lt.andrius.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //https://localhost:8080/
@RequestMapping(path = "/customertemplate")
public class CustomerTemplateController {
    @Autowired
    private CustomerService customerService;

    //   http://localhost:8080/customertemplate/test
    @GetMapping(path = "/test")
    public String getTestPage() {
        return "test_page";
    }
}


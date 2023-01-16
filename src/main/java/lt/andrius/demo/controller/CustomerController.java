package lt.andrius.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //https://localhost:8080/
@RequestMapping(path ="/customermapping")//https://localhost:8080/customermapping
public class CustomerController {
 //   https://localhost:8080/customermapping/test
    @GetMapping(path ="/test")
    public @ResponseBody String getTestPage() {
        return "This is some test from SPRING";
    }

}

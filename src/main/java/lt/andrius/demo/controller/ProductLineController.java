package lt.andrius.demo.controller;


import lt.andrius.demo.repository.model.ProductLine;
import lt.andrius.demo.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/productmapping")//https://localhost:8080/customermapping

public class ProductLineController {

    @Autowired
    private ProductLineService productLineService;

    //   https://localhost:8080/customermapping/test
    @GetMapping(path = "/test")
    public @ResponseBody String getTestPage() {
        return "This is some test from SPRING";
    }

    @GetMapping(path = "/product/all")
    public @ResponseBody List<ProductLine> getAllProducts() {
        return productLineService.getAllProducts();
    }

    //http://localhost:8080/productmapping/product/Ships
    @GetMapping(path = "/product/{id}")
    public @ResponseBody ProductLine getProductById(@PathVariable String id) {
        return productLineService.getProductById(String.valueOf((id)));
    }
}




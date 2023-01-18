package lt.andrius.demo.controller;

import lt.andrius.demo.repository.model.ProductLine;
import lt.andrius.demo.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/productlinetemplate")
public class ProductLineTemplateController {

    @Autowired
    private ProductLineService productLineService;

    //   https://localhost:8080/productlinetemplate/test
    @GetMapping(path = "/test")
    public String getTestPage() {
        return "test_page";
    }

    // http://localhost:8080/productlinetemplate/firstpage_productlines/productlines/Ships
    @GetMapping(path = "/firstpage_productlines/productlines/{id}")
    public String getCustomerWithFirstPage(Model model, @PathVariable String id) {
        ProductLine productLine = productLineService.getMyProductById(id);
        model.addAttribute("productline", productLine.getProductLine());
        model.addAttribute("textdescription", productLine.getTextdescription());
        model.addAttribute("htmldescription", productLine.getHtmldescription());

        return "firstpage_productlines";
    }

    //   http://localhost:8080/productlinetemplate/firstpage/productlines/all
    @GetMapping(path = "/firstpage/productlines/all")
    public String getAllProductLine(Model model) {
        List<ProductLine> productLineList = productLineService.getAllProducts();
        model.addAttribute("key_productlines_list", productLineList);
        return "firstpage_productlines_list";
    }
}
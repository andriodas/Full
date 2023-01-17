package lt.andrius.demo.service;


import lt.andrius.demo.repository.model.ProductLine;
import lt.andrius.demo.repository.model.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductLineService {
    @Autowired
    private ProductLineRepository productLineRepository;

    public List<ProductLine> getAllProducts(){
        return (List<ProductLine>) productLineRepository.findAll();
    }

    public ProductLine getProductById(String id){
        return productLineRepository.findById(id).get();
    }
    public ProductLine getMyProductById(String id){
        return productLineRepository.findByProductLine(id).get();
    }
    public List<ProductLine> getMyProductLineLike(String text){
        return (List<ProductLine>) productLineRepository.findByProductLineLike(text);
    }
}


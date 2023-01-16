package lt.andrius.demo.bootstrap;

import lt.andrius.demo.repository.CustomerRepository;
import lt.andrius.demo.repository.model.ProductLineRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private CustomerRepository customerRepository;
    private ProductLineRepository productLineRepository;

    public BootStrapData(CustomerRepository customerRepository, ProductLineRepository productLineRepository) {
        this.customerRepository = customerRepository;
        this.productLineRepository = productLineRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        customerRepository.findAll().forEach(System.out::println);
        System.out.println("\n==================\n");
        System.out.println(customerRepository.findById(112));
        productLineRepository.findAll().forEach(System.out::println);
        System.out.println("\n==================\n");
        System.out.println(productLineRepository.findById("Ships"));
    }
}

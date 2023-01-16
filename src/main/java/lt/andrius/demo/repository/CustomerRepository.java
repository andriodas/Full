package lt.andrius.demo.repository;

import lt.andrius.demo.repository.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}

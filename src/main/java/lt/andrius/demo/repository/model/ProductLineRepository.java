package lt.andrius.demo.repository.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductLineRepository extends CrudRepository<ProductLine, String>{

    Optional<ProductLine> findByProductLine(String id);

    Iterable<ProductLine> findByProductLineLike(String text);

}

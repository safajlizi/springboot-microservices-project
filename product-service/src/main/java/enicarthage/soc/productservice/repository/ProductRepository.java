package enicarthage.soc.productservice.repository;

import enicarthage.soc.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
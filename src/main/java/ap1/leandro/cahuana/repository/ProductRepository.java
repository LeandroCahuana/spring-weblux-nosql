package ap1.leandro.cahuana.repository;

import ap1.leandro.cahuana.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    
}
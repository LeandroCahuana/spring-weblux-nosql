package ap1.leandro.cahuana.service.impl;

import ap1.leandro.cahuana.model.Product;
import ap1.leandro.cahuana.repository.ProductRepository;
import ap1.leandro.cahuana.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService{
    
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Flux<Product> findAll() {
        log.info("Mostrando datos");
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> findById(String id) {
        log.info("Mostrando datos por ID ");
        return productRepository.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        log.info("Registrando datos " + product.toString());
        product.setStatus(true);
        return productRepository.save(product);
    }

    @Override
    public Mono<Product> update(Product product) {
        log.info("Actualizando datos " + product.toString());
        product.setStatus(true);
        return productRepository.save(product);
    }

    @Override
    public Mono<Void> delete(String id) {
        return productRepository.deleteById(id);
    }
}

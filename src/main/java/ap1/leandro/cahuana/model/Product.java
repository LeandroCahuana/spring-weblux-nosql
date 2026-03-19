package ap1.leandro.cahuana.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "product")
public class Product {
    
    @Id
    private String id;
    private String nameProduct;
    private String descriptionProduct;
    private String supplierId;
    private Integer amount;
    private Double price;
    private String category;
    private Boolean status;
}

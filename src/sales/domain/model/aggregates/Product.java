package sales.domain.model.aggregates;

public class Product {

    private final long productId; // cuando instancias tiene que asignarle un valor
    private final String productName;
    private final String productDescription;

    public Product(long productId, String productName, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
    }
}

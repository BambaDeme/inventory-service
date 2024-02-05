package deme.ahmadou.inventoryservice.services;

import deme.ahmadou.inventoryservice.entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();

    public Product getProductById(String id);

    public Product addProduct(Product product);

    public Product updateProduct(Product product);

}

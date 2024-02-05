package deme.ahmadou.inventoryservice.repositories;

import deme.ahmadou.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

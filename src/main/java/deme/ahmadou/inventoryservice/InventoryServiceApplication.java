package deme.ahmadou.inventoryservice;

import deme.ahmadou.inventoryservice.entities.Product;
import deme.ahmadou.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            List<Product> products = List.of(
                Product.builder()
                      .id(UUID.randomUUID().toString())
                      .name("Iphone 15")
                      .price(600_000)
                      .quantity(1)
                      .build(),
                Product.builder()
                        .id(UUID.randomUUID().toString())
                        .name("Ipad Air 5")
                        .price(400_000)
                        .quantity(3)
                        .build(),
                Product.builder()
                        .id(UUID.randomUUID().toString())
                        .name("Apple watch series 8")
                        .price(230_000)
                        .quantity(5)
                        .build()
            );

            productRepository.saveAll(products);
        };
    }

}

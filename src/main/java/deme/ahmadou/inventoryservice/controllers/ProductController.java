package deme.ahmadou.inventoryservice.controllers;

import deme.ahmadou.inventoryservice.entities.Product;
import deme.ahmadou.inventoryservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    @PreAuthorize("hasAuthority('USER')")
    public List<Product> getProducts(){
        return this.productService.getAllProducts();
    }

    @GetMapping("products/{id}")
    public Product getProductById(@PathVariable String id){
        return this.productService.getProductById(id);
    }

    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
}

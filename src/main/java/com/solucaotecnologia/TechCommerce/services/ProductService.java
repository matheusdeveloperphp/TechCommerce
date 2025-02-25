package com.solucaotecnologia.TechCommerce.services;

import com.solucaotecnologia.TechCommerce.dto.ProductDTO;
import com.solucaotecnologia.TechCommerce.entities.Product;
import com.solucaotecnologia.TechCommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = productRepository.findById(id);
        if (result.isPresent()) {
            Product product = result.get();
            ProductDTO productDTO = new ProductDTO(product);
            return productDTO;
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }
}

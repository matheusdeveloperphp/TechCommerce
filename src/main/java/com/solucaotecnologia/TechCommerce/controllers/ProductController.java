package com.solucaotecnologia.TechCommerce.controllers;

import com.solucaotecnologia.TechCommerce.dto.ProductDTO;
import com.solucaotecnologia.TechCommerce.entities.Product;
import com.solucaotecnologia.TechCommerce.repositories.ProductRepository;
import com.solucaotecnologia.TechCommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO productDTO = productService.findById(id);
        ProductDTO productDTO1 = productDTO;
        return productDTO1;
    }

}

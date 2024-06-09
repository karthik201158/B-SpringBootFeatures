package com.karthik.caching.simple.service;



import com.karthik.caching.simple.model.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();
}

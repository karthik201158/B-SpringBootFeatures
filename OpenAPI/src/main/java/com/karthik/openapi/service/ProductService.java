package com.karthik.openapi.service;



import com.karthik.openapi.model.ProductDTO;
import org.springframework.data.domain.Page;
import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();
}

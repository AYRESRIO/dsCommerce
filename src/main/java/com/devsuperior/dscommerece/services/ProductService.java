package com.devsuperior.dscommerece.services;

import com.devsuperior.dscommerece.dto.ProductDTO;
import com.devsuperior.dscommerece.entities.Product;
import com.devsuperior.dscommerece.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

   @Autowired
   private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }

    /*
       @Transactional(readOnly = true)
       public ProductDTO findById(Long id){
       Optional<Product> result = repository.findById(id);
       Product product = result.get();
       ProductDTO dto = new ProductDTO(product);
       return dto;
    }
     */
    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable){
       Page<Product> result = repository.findAll(pageable);
        return result.map(x->new ProductDTO(x));
    }


}

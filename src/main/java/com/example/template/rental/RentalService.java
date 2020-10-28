<<<<<<< HEAD
package com.example.template.rental;

import org.springframework.stereotype.Service;

@Service
public interface RentalService {
    Rental getRentalById(long rentalId);
    Rental save(Rental data);
    Rental save(String data);
=======
package com.example.template.product;

public interface ProductService {
    void decreaseStock(Long productId, int quantity);
    void increaseStock(Long productId, int quantity);
    Product getProductById(Long id);
    Product save(String data);
>>>>>>> main
}

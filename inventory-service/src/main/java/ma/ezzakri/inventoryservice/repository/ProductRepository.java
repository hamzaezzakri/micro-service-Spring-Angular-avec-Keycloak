package ma.ezzakri.inventoryservice.repository;

import ma.ezzakri.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

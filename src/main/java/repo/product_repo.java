package repo;

import entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface product_repo extends JpaRepository<product,Integer> {
}

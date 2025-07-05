package service;

import entity.product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repo.product_repo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class product_sevice {
    private final product_repo repo;

    public product findById(int id){
        return repo.findById(id).orElseThrow();
    }
    public product save(product p){
        return repo.save(p);
    }
    public void deleteById(int id){
        repo.deleteById(id);
    }

    public List<product> findAll() {
        return repo.findAll();
    }
}

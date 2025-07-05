package controller;

import entity.product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.product_sevice;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class product_controller {
   private final product_sevice sevice;
   @GetMapping
   public List<product> getAll(){
      return sevice.findAll();
   }
   @GetMapping("/{id}")
   public product get(@PathVariable int id){
      return sevice.findById(id);
   }
   @PostMapping
   public product save(@RequestBody product product){
      return sevice.save(product);
   }
   @PutMapping
   public product update(@PathVariable int id, @RequestBody product product){
      product.setId(id);
      return save(product);
   }
   @DeleteMapping
   public void delete(@PathVariable int id){
       sevice.deleteById(id);
   }
}

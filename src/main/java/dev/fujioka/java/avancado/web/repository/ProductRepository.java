package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository
     extends JpaRepository<Product, Long> {

    public List<Product> findProductByName(@Param("name") String name);

    public List<Product> findProductById(@Param("id") Long id);

    public List<Product> findProductByDesc(@Param("description") String description);


   // @Query("select p from Product p"){
    //    public List<Product> listaProdutos();
   // } //isso é a mesma coisa da parte de cima.

}


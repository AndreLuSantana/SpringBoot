package br.com.andre.springbootcourse.userrepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.andre.springbootcourse.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

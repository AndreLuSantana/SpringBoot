package br.com.andre.springbootcourse.userrepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andre.springbootcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

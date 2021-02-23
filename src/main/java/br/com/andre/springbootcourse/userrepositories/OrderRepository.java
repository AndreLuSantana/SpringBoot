package br.com.andre.springbootcourse.userrepositories;

import org.springframework.data.repository.CrudRepository;

import br.com.andre.springbootcourse.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}

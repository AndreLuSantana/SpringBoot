package br.com.andre.springbootcourse.userrepositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.andre.springbootcourse.entities.Order;
import br.com.andre.springbootcourse.entities.OrderItem;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long>{


}

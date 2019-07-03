package tacos.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tacos.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

  // Find all orders by delivery ZIP code. Spring Data automatically implements
  // method based on its name.
  List<Order> findByDeliveryZip(String deliveryZip);
}

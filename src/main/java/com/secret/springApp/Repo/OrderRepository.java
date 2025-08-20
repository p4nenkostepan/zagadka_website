package com.secret.springApp.Repo;

import com.secret.springApp.Models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{

}

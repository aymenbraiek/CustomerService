package com.targa.labs.dev.myboutique.CustomerService.repository;

import com.targa.labs.dev.myboutique.CustomerService.domain.Cart;
import com.targa.labs.dev.myboutique.CustomerService.domain.enumeration.CartStatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    List<Cart> findByStatus(CartStatus status);

    List<Cart> findByStatusAndCustomerId(CartStatus status, Long customerId);

}

package com.alpaca.mrc.domain.cart.repository;

import com.alpaca.mrc.domain.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}

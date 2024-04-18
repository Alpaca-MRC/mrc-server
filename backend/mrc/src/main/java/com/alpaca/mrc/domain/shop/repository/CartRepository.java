package com.alpaca.mrc.domain.shop.repository;

import com.alpaca.mrc.domain.shop.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}

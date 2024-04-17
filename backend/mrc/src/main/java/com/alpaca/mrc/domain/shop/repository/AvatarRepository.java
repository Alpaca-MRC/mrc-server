package com.alpaca.mrc.domain.shop.repository;

import com.alpaca.mrc.domain.shop.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}

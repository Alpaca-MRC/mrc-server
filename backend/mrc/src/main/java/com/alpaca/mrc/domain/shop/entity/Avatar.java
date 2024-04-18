package com.alpaca.mrc.domain.shop.entity;

import com.alpaca.mrc.domain.shop.Service.ShopServiceImpl.ProductWithProbability;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "avatar")
public class Avatar implements ProductWithProbability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "avatar_name")
    private String name;

    @Column(name = "avatar_prob")
    private double prob;

//    @Override
//    public double getProb() {
//        return this.prob;
//    }
}

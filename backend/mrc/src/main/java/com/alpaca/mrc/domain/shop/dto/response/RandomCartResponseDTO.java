package com.alpaca.mrc.domain.shop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class RandomCartResponseDTO {

    private String name;

    public static RandomCartResponseDTO of(String name) {
        return RandomCartResponseDTO.builder()
                .name(name)
                .build();
    }
}

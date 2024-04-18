package com.alpaca.mrc.domain.shop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class RandomAvatarResponseDTO {

    private String name;

    public static RandomAvatarResponseDTO of(String name) {
        return RandomAvatarResponseDTO.builder()
                .name(name)
                .build();
    }
}

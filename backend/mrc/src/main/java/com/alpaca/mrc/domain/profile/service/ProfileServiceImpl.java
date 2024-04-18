package com.alpaca.mrc.domain.profile.service;

import com.alpaca.mrc.domain.profile.dto.request.ProfileUpdateAvatarRequestDTO;
import com.alpaca.mrc.domain.profile.dto.request.ProfileUpdateCartRequsetDTO;
import com.alpaca.mrc.domain.profile.dto.response.ProfileGetAvatarResponseDTO;
import com.alpaca.mrc.domain.profile.dto.response.ProfileGetCartResponseDTO;
import com.alpaca.mrc.domain.profile.dto.response.ProfileUpdateAvatarResponseDTO;
import com.alpaca.mrc.domain.profile.dto.response.ProfileUpdateCartResponseDTO;
import com.alpaca.mrc.domain.shop.repository.AvatarRepository;
import com.alpaca.mrc.domain.shop.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final CartRepository cartRepository;
    private final AvatarRepository avatarRepository;

    public ProfileGetCartResponseDTO getCart() {

        // 유저 조회

        // 유저의 모든 카트 조회

        return null;
    }

    @Transactional
    public ProfileUpdateCartResponseDTO updateCart(ProfileUpdateCartRequsetDTO requestDTO) {

        // 유저 조회

        // 유저의 선택 카트 변경

        return null;
    }

    public ProfileGetAvatarResponseDTO getAvatar() {

        // 유저 조회

        // 유저의 모든 아바타 조회

        return null;
    }


    @Transactional
    public ProfileUpdateAvatarResponseDTO updateAvatar(ProfileUpdateAvatarRequestDTO requestDTO) {

        // 유저 조회

        // 유저의 선택 아바타 변경

        return null;
    }
}

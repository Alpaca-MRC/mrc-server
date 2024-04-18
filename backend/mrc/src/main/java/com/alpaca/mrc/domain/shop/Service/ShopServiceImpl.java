package com.alpaca.mrc.domain.shop.Service;

import com.alpaca.mrc.domain.shop.dto.response.RandomAvatarResponseDTO;
import com.alpaca.mrc.domain.shop.dto.response.RandomCartResponseDTO;
import com.alpaca.mrc.domain.shop.entity.Avatar;
import com.alpaca.mrc.domain.shop.entity.Cart;
import com.alpaca.mrc.domain.shop.repository.AvatarRepository;
import com.alpaca.mrc.domain.shop.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.SecureRandom;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {

    private final AvatarRepository avatarRepository;
    private final CartRepository cartRepository;
    private static final SecureRandom random = new SecureRandom();

    @Transactional
    public RandomAvatarResponseDTO getRandomAvatar() {
        List<Avatar> avatars = avatarRepository.findAll();
        return RandomAvatarResponseDTO.of(selectRandomly(avatars).getName());
    }

    @Transactional
    public RandomCartResponseDTO getRandomCart() {
        List<Cart> carts = cartRepository.findAll();
        return RandomCartResponseDTO.of(selectRandomly(carts).getName());
    }

    private <T extends ProductWithProbability> T selectRandomly(List<T> products) {
        double total = 0;
        double randomValue = random.nextDouble(); // 0.0 이상 1.0 미만의 난수 생성

        for (T product : products) {
            total += product.getProb();
            if (randomValue < total) {
                return product;
            }
        }
        // 이론적으로 여기에 도달할 일은 없으나, 모든 확률이 합쳐서 정확히 1.0이 아닐 경우를 대비
        return products.getLast();
    }

    // 상품의 선택 확률 반환
    public interface ProductWithProbability {
        double getProb();
    }
}

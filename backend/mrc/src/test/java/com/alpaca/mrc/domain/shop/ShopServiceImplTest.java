package com.alpaca.mrc.domain.shop;


import com.alpaca.mrc.domain.shop.Service.ShopServiceImpl;
import com.alpaca.mrc.domain.shop.dto.response.RandomAvatarResponseDTO;
import com.alpaca.mrc.domain.shop.dto.response.RandomCartResponseDTO;
import com.alpaca.mrc.domain.shop.entity.Avatar;
import com.alpaca.mrc.domain.shop.entity.Cart;
import com.alpaca.mrc.domain.shop.repository.AvatarRepository;
import com.alpaca.mrc.domain.shop.repository.CartRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class ShopServiceImplTest {

    @Mock
    private AvatarRepository avatarRepository;

    @Mock
    private CartRepository cartRepository;

    @InjectMocks
    private ShopServiceImpl shopService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getRandomAvatarTest() {
        // 가상의 Avatar 리스트를 생성
        Avatar avatar1 = new Avatar(1L, "Avatar1", 0.3);
        Avatar avatar2 = new Avatar(2L, "Avatar2", 0.1);
        Avatar avatar3 = new Avatar(3L, "Avatar3", 0.1);
        Avatar avatar4 = new Avatar(4L, "Avatar4", 0.1);
        Avatar avatar5 = new Avatar(5L, "Avatar5", 0.1);
        Avatar avatar6 = new Avatar(6L, "Avatar6", 0.1);
        Avatar avatar7 = new Avatar(7L, "Avatar7", 0.1);
        Avatar avatar8 = new Avatar(8L, "Avatar8", 0.1);
        List<Avatar> avatars = Arrays.asList(avatar1, avatar2, avatar3, avatar4, avatar5, avatar6, avatar7, avatar8);

        // avatarRepository의 findAll 메서드가 avatars 리스트를 반환하도록 설정
        when(avatarRepository.findAll()).thenReturn(avatars);

        // 메서드 실행
        RandomAvatarResponseDTO result = shopService.getRandomAvatar();

        // 결과 디버깅
        System.out.println("Random Avatar: " + result.getName());

        // 결과 검증
        assertNotNull(result);
        assertTrue(avatars.stream().anyMatch(a -> a.getName().equals(result.getName())));
    }

    @Test
    void getRandomCartTest() {
        // 가상의 Cart 리스트를 생성
        Cart cart1 = new Cart(1L, "Cart1", 0.3);
        Cart cart2 = new Cart(2L, "Cart2", 0.1);
        Cart cart3 = new Cart(3L, "Cart3", 0.1);
        Cart cart4 = new Cart(4L, "Cart4", 0.1);
        Cart cart5 = new Cart(5L, "Cart5", 0.1);
        Cart cart6 = new Cart(6L, "Cart6", 0.1);
        Cart cart7 = new Cart(7L, "Cart7", 0.1);
        Cart cart8 = new Cart(8L, "Cart8", 0.1);
        List<Cart> carts = Arrays.asList(cart1, cart2, cart3, cart4, cart5, cart6, cart7, cart8);

        // cartRepository의 findAll 메서드가 carts 리스트를 반환하도록 설정
        when(cartRepository.findAll()).thenReturn(carts);

        // 메서드 실행
        RandomCartResponseDTO result = shopService.getRandomCart();

        // 결과 디버깅
        System.out.println("Random Cart: " + result.getName());

        // 결과 검증
        assertNotNull(result);
        assertTrue(carts.stream().anyMatch(a -> a.getName().equals(result.getName())));
    }
}

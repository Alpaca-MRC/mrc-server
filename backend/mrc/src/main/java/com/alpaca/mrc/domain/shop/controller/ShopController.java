package com.alpaca.mrc.domain.shop.controller;

import com.alpaca.mrc.domain.shop.Service.ShopServiceImpl;
import com.alpaca.mrc.global.result.ResultCode;
import com.alpaca.mrc.global.result.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/shop")
@Slf4j
public class ShopController {

    private final ShopServiceImpl shopService;

    // 캐릭터 뽑기
    @Operation(summary = "캐릭터 뽑기")
    @PostMapping("/avatar")
    public ResponseEntity<ResultResponse> getRandomAvatar() {

        return ResponseEntity.ok(ResultResponse.of(ResultCode.SUCCESS, shopService.getRandomAvatar()));
    }

    // 카트 뽑기
    @Operation(summary = "카트 뽑기")
    @PostMapping("/cart")
    public ResponseEntity<ResultResponse> getRandomCart() {

        return ResponseEntity.ok(ResultResponse.of(ResultCode.SUCCESS, shopService.getRandomCart()));
    }
}

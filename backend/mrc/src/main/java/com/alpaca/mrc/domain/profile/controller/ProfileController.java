package com.alpaca.mrc.domain.profile.controller;

import com.alpaca.mrc.domain.profile.dto.request.ProfileUpdateAvatarRequestDTO;
import com.alpaca.mrc.domain.profile.dto.request.ProfileUpdateCartRequsetDTO;
import com.alpaca.mrc.domain.profile.service.ProfileServiceImpl;
import com.alpaca.mrc.global.result.ResultCode;
import com.alpaca.mrc.global.result.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/profile")
@Slf4j
public class ProfileController {

    private final ProfileServiceImpl profileService;

    @Operation(summary = "카트 조회")
    @GetMapping("/cart")
    public ResponseEntity<ResultResponse> getCart() {

        return ResponseEntity.ok(ResultResponse.of(ResultCode.SUCCESS, profileService.getCart()));
    }

    @Operation(summary = "카트 변경")
    @PostMapping("/cart")
    public ResponseEntity<ResultResponse> updateCart(@RequestBody ProfileUpdateCartRequsetDTO requestDTO) {

        return ResponseEntity.ok(ResultResponse.of(ResultCode.SUCCESS, profileService.updateCart(requestDTO)));
    }

    @Operation(summary = "아바타 조회")
    @GetMapping("/avatar")
    public ResponseEntity<ResultResponse> getAvatar() {

        return ResponseEntity.ok(ResultResponse.of(ResultCode.SUCCESS, profileService.getAvatar()));
    }

    @Operation(summary = "아바타 변경")
    @PostMapping("/avatar")
    public ResponseEntity<ResultResponse> updateAvatar(@RequestBody ProfileUpdateAvatarRequestDTO requestDTO) {

        return ResponseEntity.ok(ResultResponse.of(ResultCode.SUCCESS, profileService.updateAvatar(requestDTO)));
    }


}

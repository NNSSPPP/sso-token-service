package com.example.apitest.controller;

import com.example.apitest.entity.SsoUserTestEntity;
import com.example.apitest.model.SsoUserResponseModel;
import com.example.apitest.service.SsoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app-controller")
public class SsoUserController {

    @Autowired
    private SsoUserService ssoUserService;

    @PostMapping("/gentoken")
    public ResponseEntity<SsoUserResponseModel> generateToken(@RequestBody SsoUserTestEntity ssoUserTestEntity) {
        return ssoUserService.saveSsoUser(ssoUserTestEntity);
    }
}

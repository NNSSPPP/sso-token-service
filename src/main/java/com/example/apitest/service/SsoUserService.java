package com.example.apitest.service;

import com.example.apitest.entity.SsoUserTestEntity;
import com.example.apitest.model.SsoUserResponseModel;
import com.example.apitest.repository.SsoUserTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SsoUserService {

    @Autowired
    private SsoUserTestRepository ssoUserTestRepo;

    public ResponseEntity<SsoUserResponseModel> saveSsoUser(SsoUserTestEntity ssoUserTestEntity) {
        try {
            // error 400 checkvalidation
            if (ssoUserTestEntity.getUserid() == null || ssoUserTestEntity.getUserid().trim().isEmpty() ||
                    ssoUserTestEntity.getTokenid() == null || ssoUserTestEntity.getTokenid().trim().isEmpty()) {

                SsoUserResponseModel error = new SsoUserResponseModel();
                SsoUserResponseModel.ResponseData data = new SsoUserResponseModel.ResponseData();
                data.setUserid(ssoUserTestEntity.getUserid());
                data.setTokenid(ssoUserTestEntity.getTokenid());

                error.setResponseCode("E000001");
                error.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
                error.setResponseData(data);

                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
            }

            // Save
            if(ssoUserTestEntity.getRequestDate() == null) {
                ssoUserTestEntity.setRequestDate(new Date());
            }

            SsoUserTestEntity savedata = ssoUserTestRepo.save(ssoUserTestEntity);

            SsoUserResponseModel success = new SsoUserResponseModel();
            SsoUserResponseModel.ResponseData data = new SsoUserResponseModel.ResponseData();
            data.setUserid(savedata.getUserid());
            data.setTokenid(savedata.getTokenid());

            success.setResponseCode("I07000");
            success.setResponseMessage("ทำรายการเรียบร้อย");
            success.setResponseData(data);

            return ResponseEntity.ok(success);

        } catch (Exception e) {
            SsoUserResponseModel error = new SsoUserResponseModel();

            //error500
            error.setResponseCode("E000002");
            error.setResponseMessage("ไม่สามารถเชื่อมต่อฐานข้อมูลหรือไม่พบฐานข้อมูล");
            error.setResponseData(null);

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }
    }
}

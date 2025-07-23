package com.example.apitest.repository;

import com.example.apitest.entity.SsoUserTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface SsoUserTestRepository extends JpaRepository<SsoUserTestEntity, Date> {
}

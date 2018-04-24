package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepositery extends JpaRepository<UserInfo, Long> {

}

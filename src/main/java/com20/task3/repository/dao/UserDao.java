package com20.task3.repository.dao;

import com20.task3.dto.authenticationDto.UserResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<UserResponse> getAll();

}
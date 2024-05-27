package com20.task3.serivce;

import com20.task3.dto.SimpleResponse;
import com20.task3.dto.userDto.UserRequest;
import com20.task3.dto.userDto.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> getAll();

    UserResponse getById(Long id);

    SimpleResponse save(UserRequest userRequest);

    SimpleResponse update(Long id, UserRequest userRequest);

    SimpleResponse delete(Long id);


}

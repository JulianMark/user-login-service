package com.project.user.userloginservice.service;

import com.project.user.userloginservice.mapper.UserLoginMapper;
import com.project.user.userloginservice.service.http.UserLoginRequest;
import com.project.user.userloginservice.service.http.UserLoginResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginService {

    private final UserLoginMapper userLoginMapper;

    public UserLoginService(UserLoginMapper userLoginMapper) {
        this.userLoginMapper = userLoginMapper;
    }

    @PostMapping(
            value ="/login",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserLoginResponse> loginUser(
            @RequestBody UserLoginRequest userLoginRequest){

        Integer id = userLoginMapper.loginUser(userLoginRequest);
        return  ResponseEntity.ok(new UserLoginResponse(id));
    }
}

package com.project.user.userloginservice.mapper;

import com.project.user.userloginservice.service.http.UserLoginRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserLoginMapper {

    Integer loginUser(@Param("userLogin") UserLoginRequest userLoginRequest);
}

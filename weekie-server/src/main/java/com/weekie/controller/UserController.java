package com.weekie.controller;

import com.alibaba.fastjson2.JSONObject;
import com.weekie.entity.User;
import com.weekie.result.Result;
import com.weekie.service.UserService;
import com.weekie.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/api/login")
  public  Result<UserVO>login(@RequestParam String username, @RequestParam String password) throws Exception {
    return Result.success(userService.login(username,password));
    }
    @GetMapping("/api/read")
    public  Result<UserVO>read() throws Exception {
        return Result.success(userService.read());
    }
    @PostMapping("/api/change")
    public  Result<UserVO>change( @RequestBody(required = false) JSONObject user) throws Exception {
        User u=new User();
        u.setFirstName(user.getString("firstName"));
        u.setLastName(user.getString("lastName"));
        u.setEmail(user.getString("email"));
        if(user!=null) userService.change(u);
        return Result.success();
    }

}

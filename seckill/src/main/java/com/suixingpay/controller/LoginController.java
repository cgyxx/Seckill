package com.suixingpay.controller;

import com.suixingpay.entity.LoginParam;
import com.suixingpay.entity.Result;
import com.suixingpay.entity.Salesman;
import com.suixingpay.redis.RedisService;
import com.suixingpay.service.SalesmanService;
import com.suixingpay.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @Author sunshuaiguo
 * @Date 2019/12/8 15:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    SalesmanService salesmanService;
    @Autowired
    RedisService redisService;

    @RequestMapping("/login")
    public Result<Salesman> doLogin(HttpServletResponse response, HttpSession session , @Valid LoginParam loginParam) {
        Result<Salesman> login = salesmanService.login(loginParam);
        if (login.isSuccess()){
            CookieUtil.writeLoginToken(response,session.getId());
            //redisService.set(UserKey.getByName , session.getId() ,login.getData(), Const.RedisCacheExtime.REDIS_SESSION_EXTIME );
        }
        return login;
    }



}

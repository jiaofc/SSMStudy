package com.cafedead.learn.controller;

import com.cafedead.learn.dao.entity.User;
import com.cafedead.learn.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiaofucheng
 * 2021 -04 -12 -下午11:49
 */
    @Controller
    @RequestMapping("/user")
    public class UserController {
        @Resource
        //依赖注入@Autowiredspring
        private IUserService userService;

        @RequestMapping("/showUser.do")
        public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            long userId = Long.parseLong(request.getParameter("id")); // 获取参数 id

            User user = this.userService.selectUser(userId);          // 执行业务

            ObjectMapper mapper = new ObjectMapper();
            response.getWriter().write(mapper.writeValueAsString(user));
            response.getWriter().close();
        }
    }

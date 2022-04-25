package com.wang.controller;


import com.wang.common.lang.Result;
import com.wang.entity.User;
import com.wang.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wang
 * @since 2022-04-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Result getUserById(@PathVariable Integer id) {

        User user = userService.getById(id);

        if (user == null) {
            return Result.fail("用户不存在");
        } else {
            return Result.success(user);
        }

    }


}

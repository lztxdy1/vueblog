package com.wang.service.impl;

import com.wang.entity.User;
import com.wang.mapper.UserMapper;
import com.wang.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-04-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

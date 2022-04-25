package com.wang.service.impl;

import com.wang.entity.Blog;
import com.wang.mapper.BlogMapper;
import com.wang.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

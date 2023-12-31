package com.wxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao extends BaseMapper<User> {
}

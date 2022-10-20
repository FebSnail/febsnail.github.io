package com.example.service;

import com.example.controller.userDto.UserDTO;
import com.example.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 阮小六
 * @since 2022-06-17
 */
public interface IUserService extends IService<User> {

        UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);
}

package com.example.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author 阮小六
 * @since 2022-06-17
 */
@Data
public class User {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @Alias("用户名")
    private String username;
    @Alias("密码")
    private String password;
    @Alias("昵称")
    private String nickname;
    @Alias("邮箱")
    private String email;
    @Alias("电话")
    private String phone;
    @Alias("地址")
    private String address;
    @Alias("创建时间")
    private LocalDateTime createTime;
    @Alias("头像")
    private String avatarUrl;
//    @Alias("用户名")
//    private String role;


}

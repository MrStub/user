package com.weixin.user.model;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther: daizh1
 * @Description:
 */
@Data
public class User {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String password;
}
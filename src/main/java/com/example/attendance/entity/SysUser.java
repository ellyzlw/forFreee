package com.example.attendance.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysUser implements Serializable {

    private String username;

    private String password;

    private String role;

    private String name;

}

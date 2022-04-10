package com.example.attendance.service;

import com.example.attendance.entity.SysUser;

public interface SysUserService {

    SysUser findByUsername(String username);

}

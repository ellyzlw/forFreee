package com.example.attendance.service.impl;

import com.example.attendance.dao.SysUserDao;
import com.example.attendance.entity.SysUser;
import com.example.attendance.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao userDao;

    @Override
    public synchronized SysUser findByUsername(String username) {
        SysUser user = null;
        try {
            user = userDao.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}

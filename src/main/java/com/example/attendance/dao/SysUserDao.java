package com.example.attendance.dao;

import com.example.attendance.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserDao {

    /**
     * find by username
     *
     * @param username
     * @return
     */
    SysUser findByUsername(String username);

}
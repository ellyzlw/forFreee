package com.example.attendance.dao;

import com.example.attendance.entity.Attendance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AttendanceDao {

    /**
     * find by username
     *
     * @param username
     * @return
     */
    List<Attendance> findByUsername(String username);


    /**
     * insert a record
     *
     * @param attendance
     * @return
     */
    int insert(Attendance attendance);

}

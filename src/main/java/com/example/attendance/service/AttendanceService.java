package com.example.attendance.service;

import com.example.attendance.entity.Attendance;

import java.util.List;

public interface AttendanceService {

    List<Attendance> findByUsername(String username);

    //Attendance findByUserIdAndTime(int userId, String time);

    int insert(Attendance attendance);

}

package com.example.attendance.service.impl;

import com.example.attendance.dao.AttendanceDao;
import com.example.attendance.entity.Attendance;
import com.example.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public synchronized List<Attendance> findByUsername(String username) {
        List<Attendance> attendanceList = null;
        try {
            attendanceList = attendanceDao.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attendanceList;
    }

    @Override
    public synchronized int insert(Attendance attendance) {
        int ret = 0;
        try {
            ret = attendanceDao.insert(attendance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}

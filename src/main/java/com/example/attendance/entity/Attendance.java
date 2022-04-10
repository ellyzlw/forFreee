package com.example.attendance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {

    private String username;

    /**
     * 0: check in
     * 1: check out
     */
    private int type;

    private Date date;
}

package com.example.attendance.web;

import com.example.attendance.entity.Attendance;
import com.example.attendance.entity.SysUser;
import com.example.attendance.service.AttendanceService;
import com.example.attendance.util.UserUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class IndexController {

    @Resource
    private UserUtil userUtil;

    @Resource
    private AttendanceService attendanceService;

    @GetMapping("/")
    public String info(HttpServletRequest request, Model model) {
        SysUser user = userUtil.getUserForRequest(request);
        if (user == null) {
            return "error";
        }
        model.addAttribute("name", user.getName());
        return "index";
    }

    @GetMapping("/check")
    public String check(HttpServletRequest request, Model model) {
        return "check";
    }

    @GetMapping("/check/in")
    public String checkIn(HttpServletRequest request, RedirectAttributes redirectAttributes) {
        SysUser user = userUtil.getUserForRequest(request);
        if (user == null) {
            return "error";
        }
        Attendance attendance = new Attendance(user.getUsername(), 0, new Date());
        attendanceService.insert(attendance);
        redirectAttributes.addFlashAttribute("checkType", 0);
        return "redirect:/";
    }

    @GetMapping("/check/out")
    public String checkOut(HttpServletRequest request, RedirectAttributes redirectAttributes) {
        SysUser user = userUtil.getUserForRequest(request);
        if (user == null) {
            return "error";
        }
        Attendance attendance = new Attendance(user.getUsername(), 1, new Date());
        attendanceService.insert(attendance);
        redirectAttributes.addFlashAttribute("checkType", 1);
        return "redirect:/";
    }

    @GetMapping("/check/history")
    public String records(HttpServletRequest request, Model model) {
        SysUser user = userUtil.getUserForRequest(request);
        if (user == null) {
            return "error";
        }

        List<Attendance> attendanceList = attendanceService.findByUsername(user.getUsername());
        if (attendanceList == null) {
            return "error";
        }

        model.addAttribute("records", attendanceList);
        return "history";
    }

}

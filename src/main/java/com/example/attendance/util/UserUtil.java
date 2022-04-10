package com.example.attendance.util;

import com.example.attendance.entity.SysUser;
import com.example.attendance.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Repository
public class UserUtil {

    @Autowired
    SysUserService userService;

    public SysUser getUserForRequest(HttpServletRequest request) {
        Principal principal = request.getUserPrincipal();
        String username = principal.getName();

        HttpSession session = request.getSession();
        SysUser user = (SysUser) session.getAttribute("user");
        if (user == null || !username.equals(user.getUsername())) {
            user = userService.findByUsername(username);
            session.setAttribute("user", user);
        }
        return user;
    }

}

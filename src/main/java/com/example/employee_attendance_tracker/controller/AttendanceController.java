package com.example.employee_attendance_tracker.controller;

import com.example.employee_attendance_tracker.entity.Attendance;
import com.example.employee_attendance_tracker.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/mark")
    public String markAttendance(@RequestBody Attendance attendance) {
        attendanceService.markAttendance(attendance);
        return "Attendance marked successfully";
    }

    @GetMapping("/employee/{id}")
    public List<Attendance> getByEmployee(@PathVariable Long id) {
        return attendanceService.getAttendanceByEmployee(id);
    }

    @GetMapping("/status/{status}")
    public List<Attendance> getByStatus(@PathVariable String status) {
        return attendanceService.getAttendanceByStatus(status);
    }
}
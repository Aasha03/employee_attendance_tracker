package com.example.employee_attendance_tracker.service;

import com.example.employee_attendance_tracker.entity.Attendance;
import java.util.List;

public interface AttendanceService {
    void markAttendance(Attendance attendance);
    List<Attendance> getAttendanceByEmployee(Long employeeId);
    List<Attendance> getAttendanceByStatus(String status);
}
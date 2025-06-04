package com.example.employee_attendance_tracker.service;

import com.example.employee_attendance_tracker.entity.Attendance;
import com.example.employee_attendance_tracker.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository repository;

    public void markAttendance(Attendance attendance) {
        repository.save(attendance);
    }

    public List<Attendance> getAttendanceByEmployee(Long employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    public List<Attendance> getAttendanceByStatus(String status) {
        return repository.findByStatus(status);
    }
}
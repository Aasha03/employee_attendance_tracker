package com.example.employee_attendance_tracker.repository;

import com.example.employee_attendance_tracker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
package com.aaron.controller;

import com.aaron.pojo.Department;
import com.aaron.pojo.Employee;
import com.aaron.service.DepartmentService;
import com.aaron.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/24
 */
@RestController
public class TestController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/test")
    public List<Employee> test() {
        return employeeService.queryEmpList();
    }

    @GetMapping("/test2")
    public List<Department> test2() {
        return departmentService.getDeptList();
    }
}

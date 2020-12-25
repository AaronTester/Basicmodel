package com.aaron.controller;

import com.aaron.pojo.Employee;
import com.aaron.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/19
 */
@RestController
@Api("swaggerDemoController相关的api")
public class TestController {
    private static Logger log = LoggerFactory.getLogger(TestController.class);

    @Reference(interfaceClass = EmployeeService.class)
    private EmployeeService employeeService;


    @RequestMapping("/test")
    @ApiOperation(value="test")
    public List<Employee> test() {
        List<Employee> employees = employeeService.queryEmpList();
        System.out.println("-----------------------");
        System.out.println("======================");
        return employees;
    }
}

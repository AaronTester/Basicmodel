package com.aaron.service.impl;

import com.aaron.mapper.DepartmentMapper;
import com.aaron.pojo.Department;
import com.aaron.service.DepartmentService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/20
 */
@Component
@Service(interfaceClass = DepartmentService.class)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDeptList() {
        return departmentMapper.getDeptList();
    }

    @Override
    public Department getDept(Integer id) {
        return departmentMapper.getDept(id);
    }

    @Override
    public int delDept(Integer id) {
        return departmentMapper.delDept(id);
    }

    @Override
    public int addDept(Department department) {
        return 0;
    }

    @Override
    public int updateDept(Department department) {
        return 0;
    }

}

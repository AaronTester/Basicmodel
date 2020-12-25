package com.aaron.service;

import com.aaron.pojo.Department;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/20
 */
public interface DepartmentService {
    public List<Department> getDeptList();

    public Department getDept(Integer id);

    public int delDept(Integer id);

    public int addDept(Department department);

    public int updateDept(Department department);
}

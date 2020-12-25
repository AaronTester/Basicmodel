package com.aaron.mapper;

import com.aaron.pojo.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/4/10
 */
@Mapper
public interface DepartmentMapper {

    public List<Department> getDeptList();

    public Department getDept(Integer id);

    public int delDept(Integer id);
}

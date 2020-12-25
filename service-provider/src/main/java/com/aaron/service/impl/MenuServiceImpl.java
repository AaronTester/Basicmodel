package com.aaron.service.impl;

import com.aaron.mapper.MenuMapper;
import com.aaron.pojo.Menu;
import com.aaron.service.MenuService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/22
 */
@Component
@Service(interfaceClass = MenuService.class)
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> queryMenuList() {
        return menuMapper.queryMenuList();
    }
}

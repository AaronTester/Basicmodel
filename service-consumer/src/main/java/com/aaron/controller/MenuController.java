package com.aaron.controller;

import com.aaron.pojo.Menu;
import com.aaron.service.MenuService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/22
 */
@Controller
public class MenuController {

    @Reference(interfaceClass = MenuService.class)
    private MenuService menuService;

    @PostMapping("/menulist")
    @ResponseBody
    public List<Menu> menuList() {
        return menuService.queryMenuList();
    }
}

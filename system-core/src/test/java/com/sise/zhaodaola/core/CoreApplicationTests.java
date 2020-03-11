package com.sise.zhaodaola.core;

import com.sise.zhaodaola.business.entity.Menu;
import com.sise.zhaodaola.business.entity.Role;
import com.sise.zhaodaola.business.mapper.MenuMapper;
import com.sise.zhaodaola.business.mapper.RoleMapper;
import com.sise.zhaodaola.business.service.MenuService;
import com.sise.zhaodaola.business.service.RoleService;
import com.sise.zhaodaola.business.service.UserService;
import com.sise.zhaodaola.business.service.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collection;
import java.util.Set;

@SpringBootTest
class CoreApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleService roleService;
    
    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private MenuService menuService;

    @Test
    void contextLoads() {
        String encode = passwordEncoder.encode("py1653@scse.com.cn");
        System.out.println(encode);
    }

    @Test
    void test01() {
        String username = "py1653@scse.com.cn";
        UserDto userDto = userService.findByUsername(username);
        System.out.println(userDto);
    }

    @Test
    void test02() {
        Set<Menu> byRolesToMenus = roleMapper.findByRolesToMenus(1);
        Set<Role> roles = roleMapper.findByUserId(1);
        roles.forEach(System.out::println);
        byRolesToMenus.forEach(System.out::println);
    }

    @Test
    void test03() {
        Collection<GrantedAuthority> authorization = roleService.mapToGrantedAuthorization(2);
        authorization.forEach(a -> System.out.println(a.getAuthority()));
    }
    
    @Test
    void test04(){
        String username = "py1653@scse.com.cn";
        Set<String> keyByUsername = menuService.findMenusKeyByUsername(username);
        keyByUsername.forEach(System.out::println);
    }
}

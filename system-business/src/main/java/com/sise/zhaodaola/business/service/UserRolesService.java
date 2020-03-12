package com.sise.zhaodaola.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sise.zhaodaola.business.entity.UserRoles;

/**
 * @Author: PangYi
 * @Date 2020/3/610:46 下午
 */
public interface UserRolesService extends IService<UserRoles> {

    /**
     * 更新用户的角色
     */
    void updateUserRoles(Integer uid, Integer rid);
}

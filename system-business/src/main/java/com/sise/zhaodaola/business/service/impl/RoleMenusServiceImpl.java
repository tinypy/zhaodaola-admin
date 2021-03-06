package com.sise.zhaodaola.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sise.zhaodaola.business.entity.RoleMenus;
import com.sise.zhaodaola.business.mapper.RoleMenusMapper;
import com.sise.zhaodaola.business.service.RoleMenusService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: PangYi
 * @Date 2020/3/610:57 下午
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RoleMenusServiceImpl extends ServiceImpl<RoleMenusMapper, RoleMenus> implements RoleMenusService {
}

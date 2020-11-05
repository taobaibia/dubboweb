package com.offcn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.offcn.controller</p>
 * <p>ClassName:UserController</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2020-10-09
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getName")
    public String getName(){
            return userService.getName();
        }
}

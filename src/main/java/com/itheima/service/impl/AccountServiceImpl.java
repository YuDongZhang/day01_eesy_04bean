package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public void  saveAccount(){
        System.out.println("saveAccount 执行 ");
    }
}

package com.itheima.ui;


import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     * 获取spring ioc容器,并根据id获取对象
     *
     * @param args
     */
    public static void main(String[] args) {

        //1,获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2,根据id获取bean对象 , 下面的2中方式都可以
        IAccountService as1 = (IAccountService) ac.getBean("accountService3");
        as1.saveAccount();

    }
}

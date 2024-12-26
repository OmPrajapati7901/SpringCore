package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");

//        UserDataProvider dataProvider = new UserDatabaseProvider();

        UserManager userManagerWithDB = context.getBean("userManagerWithUserDatabaseProvider", UserManager.class);
        System.out.println(userManagerWithDB.getUserInfo());

//        UserDataProvider webServiceProvider = new WebServiceDataProvider();

        UserManager userManagerWithWeb = context.getBean("userManagerWithWebServiceDataProvider", UserManager.class);
        System.out.println(userManagerWithWeb.getUserInfo());


    }
}

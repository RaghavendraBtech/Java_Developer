package com.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.UserBean;

public class UserTest {

	public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Spconfig.xml");
        UserBean ub=(UserBean)ctx.getBean("id3");
      //  ub.create();
       //ub.insertRecord();
        ub.updateRecord();
        //ub.deleteRecord();
        //ub.getOneRecord();
        //ub.getAllrecord();

	}

}

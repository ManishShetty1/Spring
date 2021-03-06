package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp
{
    public static void main(String[] args)
    {
        //get appligcation context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from application context
        Coach coachObj=context.getBean("myCoach", Coach.class);

        //invoke methods on the bean
        System.out.println(coachObj.getDailyWorkOut());

        //close application context
        context.close();
    }
}

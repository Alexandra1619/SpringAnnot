package ru.medvedeva.annot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");

        Shop shop=context.getBean("shop",Shop.class);
        shop.ProductFeedA();
        shop.ProductFeedB();
        context.close();
    }
}

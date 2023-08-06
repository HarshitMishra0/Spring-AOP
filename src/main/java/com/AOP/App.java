package com.AOP;

import com.AOP.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PaymentService paymentObject = context.getBean("payment", PaymentService.class);
        paymentObject.makePayment();
    }
}

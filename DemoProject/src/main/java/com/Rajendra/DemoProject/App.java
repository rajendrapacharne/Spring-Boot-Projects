package com.Rajendra.DemoProject;

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
    	//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("Spring.xml"));
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	ApplicationContext fact= new ClassPathXmlApplicationContext("spring.xml");
    	Alien obj= (Alien)factory.getBean("alien");
    	obj.code();
//        System.out.println( "Hello World!" );
    }
}

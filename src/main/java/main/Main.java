package main;

import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

//		Student obj = (Student) context.getBean("student");
//		System.out.println(obj);
        context.getBean("student");
        context.getBean("student");
        context.getBean("student");
        context.getBean("student");

    }
}

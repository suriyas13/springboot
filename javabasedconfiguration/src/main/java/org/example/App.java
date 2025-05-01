package org.example;

import org.example.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new AnnotationConfigApplicationContext(MyConfiguration.class);
        Student st= (Student) context.getBean("student");
        st.writeExam();
    }
}

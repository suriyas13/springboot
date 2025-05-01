package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

    private Writer writer;

    public Student(Writer writer){
        this.writer=writer;
    }

    public Student() {
    }

    public void write(){
        writer.write();
    }
}

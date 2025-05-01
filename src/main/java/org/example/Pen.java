package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pen implements Writer {

    public void write(){
        System.out.println("Write using pen");
    }
}

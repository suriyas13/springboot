package org.example;

public class Student {
    private Writer writer;
    public Student(){
        System.out.println("Student Constructor");
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void writeExam(){
        writer.write();
    }
}

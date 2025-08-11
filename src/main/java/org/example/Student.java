package org.example;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
        System.out.println("Name before change: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

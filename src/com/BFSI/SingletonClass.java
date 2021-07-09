package com.BFSI;

public class SingletonClass {
    private static SingletonClass obj;
    int num;
    private SingletonClass() {
        num = 5;
    }

    public static SingletonClass getInstance() {

        // create object if it's not already created
        if(obj == null) {
            obj = new SingletonClass();
        }

        // returns the singleton object
        return obj;
    }

    public static void main(String[] args) {

        // refers to the only object of SingletonClass
        SingletonClass obj1= SingletonClass.getInstance();
        System.out.println("The value of the variable in singleton class is: " + obj1.num);
    }
}

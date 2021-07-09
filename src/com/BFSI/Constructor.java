package com.BFSI;

public class Constructor {
    // This program eXplains constructor types, constructor overloading and constructor chaining
    int num;
    int addRes = 0;

    Constructor() // non parameterized constructor
    {
        System.out.println("This is Non-Parameterized Constructor and initialised the obj with value 50");
        num = 50;
    }

    Constructor(int num) // Parameterized constructor
    {
        this.num = num;
        System.out.println("This is Parameterized Constructor and initialised with passed value by the user");
    }

    Constructor(int num, int newNum)
    {
        this(); //this will call non-parameterized constructor. i.e. it is constructor chaining
        this.num += num; // this will add user-passed value to the predefined num variable
        this.addRes = this.num + newNum;
        // addRes  = (predefined value in non-parameterized constructor) + (num) + (newNum);
    }


    public static void main(String[] args) {
        Constructor con1 = new Constructor();
        System.out.println("Calling Non-Parameterized constructor and the value of the variable is pre-defined value: "+ con1.num);
        System.out.println();
        System.out.println("          ------------------------------          ");
        Constructor con2 = new Constructor(20); // constructor overloading
        System.out.println("Calling Parameterized constructor and the value of the variable is user-passed value: "+ con2.num);
        System.out.println();
        System.out.println("          ------------------------------          ");
        System.out.println("          CONSTRUCTOR        CHAINING             ");
        System.out.println("          ------------------------------          ");
        Constructor con3 = new Constructor(50, 55);
        System.out.println("Calling Parameterized constructor and the value of the addRes after constructor Chaining is: "+ con3.addRes);
    }
}

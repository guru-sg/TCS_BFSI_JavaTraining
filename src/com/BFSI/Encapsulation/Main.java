package com.BFSI.Encapsulation;

public class Main {

    /*  Consider the class Employee given below for representing employees of an organization.
        It has 5 different instance variables and a method to calculate the total salary based on the jobLevel.
        Salary is calculated in the calculateSalary() method.
        Make necessary changes to the class by making all the attributes private and by adding necessary accessor
        and mutator methods thus bringing in Encapsulation.
    */
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmployeeId("C101");
        employee.setEmployeeName("Steve");
        employee.setSalary(650);
        employee.setJobLevel(4);


        employee.calculateSalary();

        System.out.println("Employee Details:");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Job Level: " + employee.getJobLevel());
        System.out.println("Employee Bonus: " + employee.getBonus());
        System.out.println("Salary: " + employee.getSalary());

    }


}

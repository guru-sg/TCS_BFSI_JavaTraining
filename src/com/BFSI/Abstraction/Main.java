package com.BFSI.Abstraction;

public class Main {
    /*
        Anchor College offers both graduate and postgraduate programs.
        The college stores the names of the students, their test scores and the final result for each student.
        Each student has to take 4 tests in total. You need to create an application for the college by implementing the classes:
        -- Student
        -- UndergraduateStudent
        -- GraduateStudent
        Method Description:
        -- Student:
               -- Student(String studentName)
                        Initialize the instance variable studentName with the value passed to the constructor and other instance variables
                        to the default values.
               -- setTestScore(int testNumber, int testScore)
                        Set the value of the testScore in the appropriate position of testScores array based on the testNumber.
               -- generateResult
                        Abstract Method
            Implement the getter and setter methods appropriately.
        -- UndergraduateStudent:
               -- UndergraduateStudent(String studentName)
                        Initialize the instance variable studentName with the value passed to the constructor and other instance variables
                        to the default values.
               -- generateResult()
                        Implement the abstract method of Student class by setting the value of testResult based on the below details.
                        if(averageScore >= 60) then pass, else, fails.
        -- GraduateStudent:
               -- GraduateStudent(String studentName)
                        Initialize the instance variable studentName with the value passed to the constructor and other instance variables
                        to the default values.
               -- generateResult()
                        Implement the abstract method of Student class by setting the value of testResult based on the below details.
                        if(averageScore >= 70) then pass, else, fails.
    */
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);

        undergraduateStudent.generateResult();

        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());

        System.out.println();

        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);

        graduateStudent.generateResult();

        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
    }
}

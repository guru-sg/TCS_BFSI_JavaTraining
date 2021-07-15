package com.BFSI.Abstraction;

public abstract class Student {
    private String studentName;
    private int[] testScore = new int[4];
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getTestScore() {
        return testScore;
    }

    public void setTestScore(int testNumber, int testScore) {
        this.testScore[testNumber] = testScore;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public abstract void generateResult();
}

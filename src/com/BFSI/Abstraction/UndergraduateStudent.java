package com.BFSI.Abstraction;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int[] temp = new int[4];
        int res = 0;
        temp = this.getTestScore();
        for(int i : temp)
        {
            res += i;
        }
        res = res/4;
        if(res >= 60)
        {
            this.setTestResult("Pass");
        }
        else
        {
            this.setTestResult("Fail");
        }
    }
}

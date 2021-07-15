package com.BFSI.Abstraction;

public class GraduateStudent extends Student{


    public GraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
            int[] temp = new int[4];
            int res = 0;
            temp = this.getTestScore();
            for(int i : temp)
                res += i;
            res = res/4;
            if(res >= 70)
            {
                this.setTestResult("Pass");
            }
            else
            {
                this.setTestResult("Fail");
            }
    }
}

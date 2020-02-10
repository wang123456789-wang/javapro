package com.neuedu.f5.lianxi2;

public class SalariedEmployee extends ColaEmployee{     //拿固定工资的员工
    public int x;  //月固定工资

    public SalariedEmployee(int x) {
        super();
        this.x = x;
    }

    @Override
    public void getSalary(int month) {              //固定工资
        System.out.println("拿固定工资的员工的工资："+x);
    }
}

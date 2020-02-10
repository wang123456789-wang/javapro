package com.neuedu.f5.lianxi2;

public class HourlyEmployee extends ColaEmployee {     //拿小时工资的员工
    public int a;          //每小时的工资(整型)。
    public int b;          //每月工作的小时数(整型)。

    public HourlyEmployee(int a,int b) {
        super();
        this.a = a;
        this.b = b;
    }
    @Override
    public void getSalary(int month) {       //按小时拿工资
        double xiaoshi;
        if(b>160){
            xiaoshi = 160*a+(b-160)*a*1.5;
        }else{
            xiaoshi = a*b;
        }
        System.out.println("拿小时工资的员工的员工的工资："+xiaoshi);
    }
}

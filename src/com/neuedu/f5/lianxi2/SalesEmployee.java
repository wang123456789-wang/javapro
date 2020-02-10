package com.neuedu.f5.lianxi2;

public class SalesEmployee extends ColaEmployee {     //按月销售额和提成率拿工资的员工
    public int j;                //参数：月销售额(整型)
    public double k;                //提成率(浮点型)

    public SalesEmployee(int j, double k) {
        super();
        this.j = j;
        this.k = k;
    }

    @Override
    public void getSalary(int month) {                 //按月销售额和提成率拿工资
       System.out.println("按月销售额和提成率拿工资的员工工资："+j*k);

    }
    public int  payWage(ColaEmployee emp,int month){
        return 0;
    }
}

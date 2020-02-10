package com.neuedu.f5.lianxi2;

public class test {
    public static void main(String[] args) {
        ColaEmployee g1 = new SalariedEmployee(5000);//x月固定工资（整型）
        ColaEmployee x1 = new HourlyEmployee(250,36);//a每小时的工资(整型)；b每月工作的小时数(整型)。
        ColaEmployee y1 = new SalesEmployee(50000,0.1);//j参数：月销售额(整型)；i提成率(浮点型)
        g1.getSalary(2);
        y1.getSalary(3);
        x1.getSalary(4);
    }
    public int payWage(ColaEmployee emp,int month){
        return 0;
    }

}

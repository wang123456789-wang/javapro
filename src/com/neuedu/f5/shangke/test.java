package com.neuedu.f5.shangke;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Dag d1 = new Dag();
        Student s1 = new Student();
        s1.setNo(2222);
        System.out.println(s1.getNo());
        System.out.println( p1.run());
    }
}

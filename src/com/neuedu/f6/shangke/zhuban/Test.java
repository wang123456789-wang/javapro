package com.neuedu.f6.shangke.zhuban;

public class Test {
    public static void main(String[] args) {
        mainboard board = new mainboard();
        Cpu i3 = new I3();
        Cpu i5 = new I5();
        board.setCpu(i5);
        board.method();
    }
}

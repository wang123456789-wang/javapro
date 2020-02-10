package com.neuedu.f4;

public class dag {
    private char sex;
    private int age;
    public void setAge( int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {

        if(sex !='男'&&sex != '女'){
            System.out.println("输出错误");
        }else{
            this.sex =  sex;
        }
    }
}


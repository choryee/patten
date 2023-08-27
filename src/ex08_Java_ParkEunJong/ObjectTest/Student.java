package ex08_Java_ParkEunJong.ObjectTest;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class Student    {
    private String studentName;
    private int grade;
    private int money;

    Student(String studentName, int grade, int money){
        this.studentName=studentName;
        this.grade=grade;
        this.money=money;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }

    public void addMoney(int money){
        this.money+=money;
    }
    public int getMoney(){
        return money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money-=1000;

    }

    public void takeSubway(Subway subway){
        subway.take(2000);
        this.money-=1500;

    }

    public void showInfo(){
        System.out.println(studentName+"님의 남은 돈은"+money+"입니다");
    }



}

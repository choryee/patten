package ex08_Java_ParkEunJong.ObjectTest;

public class Test   {
    public static void main(String[] args) {
        Student student1=new Student("kim", 3, 20000);
        Student student2=new Student("Lee", 2, 30000);
        Student student3=new Student("Park", 1, 10000);

        Bus bus=new Bus(301);
        Subway subway1=new Subway("1호선");
        Subway subway2=new Subway("9호선");

        student1.takeBus(bus);
        student1.showInfo();
        bus.showInfo();

        student2.takeSubway(subway1);
        student1.takeSubway(subway2);
        subway1.showInfo();

        student1.addMoney(3000);
        student1.showInfo();




    }
}

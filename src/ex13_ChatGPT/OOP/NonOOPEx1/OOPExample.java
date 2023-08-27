package ex13_ChatGPT.OOP.NonOOPEx1;

// 이 코드는 위 NonOOPExample코드 보다 어떤점에서 낫나?
//주어진 코드는 객체 지향 프로그래밍의 원칙을 따르는 예시로, 클래스와 객체를 활용하여 기능을 구현하였습니다. 이 코드가 `NonOOPExample` 코드보다 객체 지향적인 이유는 다음과 같습니다:
//
//1. **캡슐화와 정보 은닉:** `Area` 클래스는 `radius`와 `pi`를 클래스의 속성으로 캡슐화하고 있습니다. 또한, `radius`는 `private`로 선언되어 클래스 외부에서 직접 접근하지 못하도록 하였습니다. 이를 통해 데이터를 보호하고 오로지 클래스의 메서드를 통해서만 속성에 접근할 수 있도록 하였습니다.
//
//2. **메서드와 속성의 묶음:** `Area` 클래스는 `calArea()` 메서드를 통해 원의 넓이를 계산하고 `print()` 메서드를 통해 결과를 출력하는 기능을 제공합니다. 이렇게 관련 있는 메서드와 속성을 클래스 내부에 묶어두면 코드 구조화와 가독성이 향상됩니다.
//
//3. **생성자 활용:** `Area` 클래스는 생성자를 통해 초기화됩니다. 이를 통해 객체 생성 과정과 속성 초기화를 한 번에 처리할 수 있습니다.
//
//4. **재사용 가능한 코드:** `Area` 클래스는 클래스 내부에서 원의 넓이를 계산하는 기능을 제공하므로, 이 클래스를 다른 프로젝트나 파일에서도 활용하여 원의 넓이를 계산하는 기능을 재사용할 수 있습니다.
//
//5. **객체 지향적 설계:** 이 코드는 객체 지향 프로그래밍의 원칙을 준수하여 클래스를 정의하고 객체를 생성하여 사용하였습니다. 이는 코드의 유지보수성을 높이고 기능을 확장하기에 용이합니다.
//
//이러한 객체 지향적인 설계와 구현은 코드를 모듈화하고 가독성을 높이며, 코드를 관리하고 확장하기 쉽게 만듭니다.
class Area{
    private int radius;
    double pi=Math.PI;

    Area(int radius){
        this.radius=radius;
    }

    double calArea(){
        return Math.floor( pi*radius*radius);
    }

    public void print(){
        System.out.println(calArea());
    }
}// --Area

interface shape{
    double calculateAreas();
    void print();
}

class ShapeFactory{
    public shape createShape(String type){
        if(type.equalsIgnoreCase("triangle")){
            return new Triangle(2,3);
        }
        return null;
    }
}

class Triangle implements shape{
    int width;
    int height;

    Triangle(int width, int height){
        this.height=height;
        this.width=width;
    }

    @Override
    public double calculateAreas() {
        return width*height;
    }

    @Override
    public void print() {
        System.out.println("-------");
        System.out.println(calculateAreas());
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Area area1=new Area(5);
        //area.calArea();
        area1.print();

        Area area2=new Area(3);
        area2.print();

        shape triangle1=new Triangle(10,5);
        triangle1.print();

        ShapeFactory sf=new ShapeFactory();
        shape triangle=sf.createShape("triangle");
        triangle.print();

    }
}

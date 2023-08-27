package ex13_ChatGPT.OOP.NonOOPEx;

// 객체 지향 프로그래밍을 따르지 않는 예시 코드 (자바)
// 위 코드에서는 객체를 생성하거나 클래스를 정의하지 않고, 모든 기능을 함수로 구현하였습니다. 이렇게 코드를 작성하면 객체 지향 프로그래밍의 장점인 코드 재사용성, 모듈화, 상속, 다형성 등을 활용할 수 없습니다. 코드의 확장성이 낮아지며, 유지보수가 어려워질 수 있습니다.
//
//객체 지향 프로그래밍은 개체의 상호 작용과 관계에 중점을 두는 반면, 위의 예시 코드는 단순히 기능을 순차적으로 실행하는 방식으로 구현되었습니다. 객체 지향 프로그래밍의 장점을 활용하기 위해서는 클래스와 객체를 적절하게 활용하여 코드를 구조화하고 모델링해야 합니다.
public class NonOOPExample {
    public static void main(String[] args) {
        //원 넓이 구하기.
        int radius = 5; // radius가 바뀌면, 여기 코드를 수정해야.<--기존 코드를 수정하면 안됨. OCP에 위배.
        double area = calculateCircleArea(radius);
        System.out.println("Circle area: " + area);
    }

    public static double calculateCircleArea(int radius) {
        return 3.14 * radius * radius;
    }

}

package ex13_ChatGPT.DesignPatten.observer;


import java.util.ArrayList;
import java.util.List;


//인터페이스를 사용할때, 무슨 결합도 차이가 없는데?

// 인터페이스를 사용할 때 결합도를 낮추는 이점은 두 클래스 간의 관계를 느슨하게 만들어 변경에 유연하게 대응할 수 있는 것입니다. 하지만 모든 경우에 인터페이스를 사용한 것만으로 결합도가 무조건 낮아지는 것은 아닙니다.
//
//옵저버 패턴의 예시에서 `Observer`와 `Subject` 인터페이스를 사용하면 결합도를 낮출 수 있는 이유는 다음과 같습니다:
//
//1. **상호 교환 가능성:** `Observer` 인터페이스를 구현한 다양한 클래스를 사용해도 `Subject` 클래스는 변경할 필요가 없습니다. 새로운 옵저버 클래스가 추가되더라도 `Subject` 클래스에는 영향을 미치지 않습니다.
//
//2. **단일 책임 원칙:** 인터페이스를 사용하면 각 클래스가 하나의 책임을 갖게 됩니다. `Subject` 클래스는 관찰자들을 등록하고 알림을 보내는 책임을 가지고, `Observer` 클래스는 업데이트 기능을 가집니다.
//
//3. **유연성과 확장성:** 새로운 `Observer` 구현체를 추가하거나 `Subject` 클래스를 다른 주체로 교체할 수 있습니다. 이는 코드 변경 최소화와 유연한 확장을 가능하게 합니다.
//
//반면에 인터페이스를 사용하지 않고 높은 결합도를 가진 예시 코드에서는, 클래스 간의 직접적인 의존 관계로 인해 변경에 취약하며 확장하기 어려울 수 있습니다.
//
//결론적으로 인터페이스를 사용하여 느슨한 결합도를 얻는 것은 디자인 패턴의 핵심 원리 중 하나이며, 유연하고 확장 가능한 코드를 작성하는 데 도움이 됩니다.
interface subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer {
    void update(int temp);
}

class TemSensor implements subject{
    private List<Observer> observers=new ArrayList<>();
    private int tem;

    public void setTem(int tem){
        this.tem=tem;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer  o : observers){
            o.update(tem);
        }
    }
}

class TempDisplay implements Observer {
    @Override
    public void update(int tem) {
        System.out.println("Temperature updated: " + tem);
    }
}

//바로 위 기존 코드를 수정하지 않고, 밑처럼 Observer를 구현하는 새로운 클래스를 만들면 끝.

//이제 EnhancedTemperatureDisplay 클래스는 Observer 인터페이스를 구현하여 업데이트 로직을 변경한 것입니다. 다른 옵저버들은 변경하지 않고 그대로 유지됩니다.
class EnhancedTemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature < 0) {
            System.out.println("It's freezing!");
        } else if (temperature > 30) {
            System.out.println("It's really hot!");
        } else {
            System.out.println("Temperature updated: " + temperature);
        }
    }
}



public class ObserverPatternEx {
    public static void main(String[] args) {
        Observer tempDisplay1=new TempDisplay();


        TemSensor ts=new TemSensor();
        ts.registerObserver(tempDisplay1);
        ts.setTem(100);
    }
}

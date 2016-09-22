package observer;

public class Test {

    public static void main(String[] args) {

        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者对象
        Observer observer = new ConcreteObserver();
        Observer observer1 = new ConcreteObserver1();

        //将观察者对象登记到主题对象上
        subject.attach(observer);
        subject.attach(observer1);

        //改变主题对象的状态
        subject.change("this is my new state");
    }
}

package decorate;

public class Client {

    public static void main(String[] args){

        Component co = new ConcreteComponent();
        co.method();
        System.out.println("--------------");
        Decorator decoratorA = new ConcreteDecoratorA(co);
        decoratorA.method();
        System.out.println("--------------");
        Decorator decoratorB = new ConcreteDecoratorB(co);
        decoratorB.method();
        System.out.println("---------------");
        Decorator decoratorAB = new ConcreteDecoratorB(decoratorA);
        decoratorAB.method();
        System.out.println("----------------");
    }
}

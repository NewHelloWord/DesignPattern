package decorate;

//具体的装饰器类
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    public void method() {
        System.out.println("这里添加了一层A的包装--start--");
        super.method();
        System.out.println("这里添加了一层A的包装--end--");
    }

}

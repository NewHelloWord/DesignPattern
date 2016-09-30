package decorate;

//具体的装饰器类
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void method() {
        System.out.println("这里添加了一层B的包装--start--");
        super.method();
        System.out.println("这里添加了一层B的包装--end--");
    }
}

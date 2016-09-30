package decorate;

//抽象装饰者Decorator
public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void method() {
        component.method();
    }
}

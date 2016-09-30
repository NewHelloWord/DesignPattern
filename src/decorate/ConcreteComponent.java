package decorate;

//具体组件对象
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("这是ConcreteComponent的method");
    }
}

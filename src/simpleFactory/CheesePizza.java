package simpleFactory;

public class CheesePizza implements Pizza{
    @Override
    public void cut() {
        System.out.println("CheesePizza:cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza:box");
    }
}

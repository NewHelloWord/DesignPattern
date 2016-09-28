package simpleFactory;

public class ClamPizza implements Pizza {
    @Override
    public void cut() {
        System.out.println("ClamPizza:cut");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza:box");
    }
}

package factoryMethod;

public class SportShoes implements Shoes {
    @Override
    public void type() {
        System.out.println("this is SportShoes");
    }

    @Override
    public void purpose() {
        System.out.println("become faster");
    }
}

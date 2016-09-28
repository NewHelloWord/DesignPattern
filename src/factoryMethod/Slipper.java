package factoryMethod;

public class Slipper implements Shoes {
    @Override
    public void type() {
        System.out.println("this is Slipper");
    }

    @Override
    public void purpose() {
        System.out.println("become comfortable");
    }
}

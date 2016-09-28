package factoryMethod;

public class SlipperFactory implements ShoesFactory{
    @Override
    public Shoes createShoes() {
        return new Slipper();
    }
}

package factoryMethod;

public class SportShoesFactory implements ShoesFactory {
    @Override
    public Shoes createShoes() {
        return new SportShoes();
    }
}

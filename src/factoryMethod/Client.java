package factoryMethod;

public class Client {

    public static void main(String[] args){

        ShoesFactory sf = new SlipperFactory();
        Shoes s = sf.createShoes();
        s.type();
        s.purpose();

        sf = new SportShoesFactory();
        s = sf.createShoes();
        s.type();
        s.purpose();

        //-----------------------------

        GenericFactory gf = new GenericShoesFactory();
        gf.create(Slipper.class).type();

    }
}

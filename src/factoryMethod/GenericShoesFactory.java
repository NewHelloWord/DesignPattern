package factoryMethod;

public class GenericShoesFactory implements GenericFactory{
    @Override
    public <T extends Shoes> Shoes create(Class<T> c) {
        if(c == null){
            throw  new IllegalArgumentException("argument must not be null");
        }
        try {
            Shoes shoes = c.newInstance();
            return shoes;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownError(e.getMessage());
        }
    }
}

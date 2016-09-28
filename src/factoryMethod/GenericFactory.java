package factoryMethod;

public interface GenericFactory {

    <T extends Shoes> Shoes create(Class<T> c);    //  泛型方法

    //单个工厂实现类的方法对比前面的多个工厂实现类的方法来说更加的简洁和动态，
    // 而且对于以后新增的产品类来说也能够不用修改原来的代码，符合开闭原则，
    // 但是这种写法在某些情况下是不适用的，
    // 比如不同的 Shoes 对象设置了不同的构造函数，参数都不一样，用反射来实现就不适用了，
    // 这个时候就只能为每一个具体产品类都定义一个对应的具体工厂类了。
}

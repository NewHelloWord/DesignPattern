package adapter.classAdapter;

//适配器角色(Adaper)
public class Adaper extends Adapee implements Target{
    /**
     * 由于源类Adaptee没有方法specificMethod()
     * 因此适配器补充上这个方法
     */
    @Override
    public void specificMethod() {
        //do something
    }
}

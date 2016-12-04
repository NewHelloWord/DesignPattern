package proxy.staticProxy;

/**
 * Created by JerryMouse on 2016/12/4.
 *
 * 代理对象角色
 */
public class ProxyObject extends AbstractObject{

    private AbstractObject ao;

    public ProxyObject(AbstractObject ao) {
        this.ao = ao;
    }

    @Override
    public void operation() {
        System.out.println("before..........");
        ao.operation();
        System.out.println("after...........");
    }
}

package proxy.staticProxy;

/**
 * Created by JerryMouse on 2016/12/4.
 *
 * 目标对象角色
 */
public class RealObject extends AbstractObject{
    @Override
    public void operation() {
        System.out.println("do something");
    }
}

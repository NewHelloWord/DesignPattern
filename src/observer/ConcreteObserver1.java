package observer;

/**
 * 具体观察者角色类
 */
public class ConcreteObserver1 implements Observer{

    //观察者的状态
    private String observerState1;

    @Override
    public void update(String state) {

        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState1 = state;

        System.out.println("观察者1改变状态为："+observerState1);

    }
}

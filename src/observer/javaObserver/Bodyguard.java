package observer.javaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yao on 2016/9/23.
 */
public class Bodyguard implements Observer {

    private String name;

    public Bodyguard(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Star){
            Star star = (Star)o;
            System.out.println(name+"收到通知："+star.getName()+"遇到麻烦 "+arg);
        }
    }

    public String getName() {
        return name;
    }
}

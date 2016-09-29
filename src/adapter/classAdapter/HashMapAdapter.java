package adapter.classAdapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public class HashMapAdapter extends HashMap implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        //当观察者状态改变时
        super.clear();
    }
}

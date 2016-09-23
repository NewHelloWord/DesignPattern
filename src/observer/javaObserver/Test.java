package observer.javaObserver;

/**
 * Created by Yao on 2016/9/23.
 */
public class Test {

    public static void main(String[] args) {

        Star star = new Star("大雄");
        Bodyguard b1 = new Bodyguard("哆啦A梦");
        Bodyguard b2 = new Bodyguard("静香");
        Bodyguard b3 = new Bodyguard("小夫");

        star.addObserver(b1);
        star.addObserver(b2);
        star.addObserver(b3);

        star.inTrouble("考试又考了0分");

        star.deleteObserver(b3);
        star.inTrouble("胖虎欺负我");

    }
}

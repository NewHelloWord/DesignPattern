package abstractFactory;

public class AmdCpu implements Cpu{

    @Override
    public void model() {
        System.out.println("this is AmdCpu");
    }
}

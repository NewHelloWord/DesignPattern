package abstractFactory;

public class IntelComputer implements ComputerFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Board cerateBoard() {
        return new IntelBoard();
    }
}

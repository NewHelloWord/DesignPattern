package abstractFactory;

public class Client {

    public static void main(String[] args){
        ComputerFactory cf = new IntelComputer();
        Cpu cpu = cf.createCpu();
        Board board = cf.cerateBoard();
        cpu.model();
        board.model();

        cf = new AmdComputer();
        cpu = cf.createCpu();
        board = cf.cerateBoard();
        cpu.model();
        board.model();
    }

}

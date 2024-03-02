package Builder;

public class Main {

    public static void main(String[] args) {
        OldComputerBuilder oldComputerBuilder = new OldComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(oldComputerBuilder);
        computerDirector.construct();
        Computer computer = oldComputerBuilder.build();
        System.out.println(computer);

    }
}

package Builder;

public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void construct(){
        computerBuilder.setRam();
        computerBuilder.setCpu();
        computerBuilder.setDisk();
    }
}

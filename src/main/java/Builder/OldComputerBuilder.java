package Builder;

public class OldComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public OldComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void setRam() {
        computer.setRam("Old Ram");
    }

    @Override
    public void setCpu() {
        computer.setCpu("Old Cpu");
    }

    @Override
    public void setDisk() {
        computer.setDisk(50);
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}

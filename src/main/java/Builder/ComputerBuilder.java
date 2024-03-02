package Builder;

public interface ComputerBuilder {

    void setRam();
    void setCpu();
    void setDisk();
    Computer build();
}

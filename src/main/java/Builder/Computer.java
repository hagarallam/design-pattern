package Builder;

public class Computer {

    private String ram ;
    private String cpu ;
    private double disk ;


    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setDisk(double disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{ \n" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", disk=" + disk +
                "\n}";
    }
}

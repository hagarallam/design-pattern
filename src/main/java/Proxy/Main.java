package Proxy;

public class Main {

    public static void main(String[] args) {
        CommandExecutor commandExecutor1 = new CommandExecutorProxy("Admin","1234");
        commandExecutor1.execute("mkdir newFolder");

        CommandExecutor commandExecutor2 = new CommandExecutorProxy("user","1232324");
        commandExecutor2.execute("mkdir newFolder");
    }
}

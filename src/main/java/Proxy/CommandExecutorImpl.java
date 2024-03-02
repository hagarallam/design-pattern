package Proxy;

public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void execute(String command) {
        System.out.println(command+ " Command Executed !!!");
    }
}

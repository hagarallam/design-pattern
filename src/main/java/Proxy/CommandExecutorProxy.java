package Proxy;

public class CommandExecutorProxy implements CommandExecutor{

    private CommandExecutorImpl commandExecutor = new CommandExecutorImpl();

    private String userName ;
    private String password ;


    public CommandExecutorProxy(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void execute(String command) {
        if("Admin".equals(userName) && "1234".equals(password)){
            commandExecutor.execute(command);
        }
        else {
            System.out.println("Sorry you can not execute the command !");
        }
    }
}

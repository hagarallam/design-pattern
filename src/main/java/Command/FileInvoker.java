package Command;

public class FileInvoker {


    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }
}

package Command;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem  = FileSystemFactory.getFileSystemInstance();
        Command openFileCommand = new OpenFileCommand(fileSystem);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.invoke();


        Command writeFileCommand = new WriteFileCommand(fileSystem);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.invoke();


        Command closeFileCommand = new CloseFileCommand(fileSystem);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.invoke();

    }
}

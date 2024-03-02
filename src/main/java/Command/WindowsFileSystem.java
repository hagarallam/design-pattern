package Command;

public class WindowsFileSystem implements FileSystem{
    @Override
    public void openFile() {
        System.out.println("Open file inside Windows OS");

    }

    @Override
    public void closeFile() {
        System.out.println("Close file inside Windows OS");

    }

    @Override
    public void writeFile() {
        System.out.println("Write in a file inside Windows OS");

    }
}

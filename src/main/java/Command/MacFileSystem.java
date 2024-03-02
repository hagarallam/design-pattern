package Command;

public class MacFileSystem implements FileSystem{
    @Override
    public void openFile() {
        System.out.println("Open file inside Mac OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file inside Mac OS");

    }

    @Override
    public void writeFile() {
        System.out.println("write in a file inside Mac OS");

    }
}

package Command;

public class FileSystemFactory {

    public static FileSystem getFileSystemInstance(){
        String osName = System.getProperty("os.name");
        System.out.println("Os name is "+ osName);
        if("Windows 10".contains(osName))
            return new WindowsFileSystem();
        else
            return new MacFileSystem();
    }
}

import java.io.File;
class FileHelper {
    public static File[] makeFilesFromPathAndNames(String path, String[] names) {
        File[] files = new File[names.length];
        for(int i = 0; i < names.length; i++)
        {
            files[i] = makeFileFromPathAndName(path, names[i]);
        }
        return files;
    }

    public static File makeFileFromPathAndName(String path, String name) {
        if(path != null && path.trim().length() > 0)
        {
            return new File(path, name);
        }
        else
        {
            return new File(name);
        }
    }
}

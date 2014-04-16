import static org.junit.Assert.*;
import java.io.File;
import org.junit.Test;

public class FileHelperTest {

    @Test
    public void testMakeFileFromPathAndName() {
        String path = "/home/dylan";
        String name = ".vimrc";
        File result = FileHelper.makeFileFromPathAndName(path, name);
        assertEquals(result.getAbsolutePath(), "/home/dylan/.vimrc");
        assertEquals(result.getName(), ".vimrc");
    }

    @Test
    public void testMakeFileFromPathAndNameWithNull() {
        String path = null;
        String name = ".vimrc";
        File result = FileHelper.makeFileFromPathAndName(path, name);
        assertEquals(result.getAbsolutePath(), "/home/dylan/Dropbox/dev/code/eclipse_workspaces/mint_vm/EbayManager/.vimrc");
        assertEquals(result.getName(), ".vimrc");
    }

    @Test
    public void testMakeFilesFromPathAndNames() {
        String path = "/home/dylan";
        String[] names = new String[] { ".vimrc", ".bashrc", ".gitconfig" };
        File[] files = FileHelper.makeFilesFromPathAndNames(path, names);
        assertEquals(files[0].getAbsolutePath(), "/home/dylan/.vimrc");
        assertEquals(files[0].getName(), ".vimrc");
        assertEquals(files[1].getAbsolutePath(), "/home/dylan/.bashrc");
        assertEquals(files[1].getName(), ".bashrc");
        assertEquals(files[2].getAbsolutePath(), "/home/dylan/.gitconfig");
        assertEquals(files[2].getName(), ".gitconfig");
    }
}

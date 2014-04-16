import java.io.File;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.FileDialog;


public class ImageSelectDialog {

    private Shell m_shell;
    public ImageSelectDialog(Shell shell) {
        m_shell = shell;
    }

    public ArrayList<EbayImage> fetchImages() {
        FileDialog fd = new FileDialog(m_shell, SWT.MULTI);
        fd.open();
        File [] files = FileHelper.makeFilesFromPathAndNames(fd.getFilterPath(), fd.getFileNames());
        ArrayList<EbayImage> images = new ArrayList<EbayImage>();
        for(File file : files) {
            images.add(new EbayImage(file));
        }
        return images;
    }
}

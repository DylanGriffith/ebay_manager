import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class EbayManagerApplication {
    private Shell m_shell;
    private Display m_display;
    private HomePage m_homePage;
    
    public EbayManagerApplication() {
        m_display = new Display();
       
    }

    public void stop() {
        m_display.dispose();
    }

    public void start() {
        m_homePage = new HomePage(m_display);
        
    }
}

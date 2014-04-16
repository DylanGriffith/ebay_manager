import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class EbayManagerApplication {
    private Shell m_shell;
    private Display m_display;
    public EbayManagerApplication() {
        m_display = new Display();
        m_shell = new Shell(m_display);
    }

    public void stop() {
        m_display.dispose();
    }

    public void start() {
        EbayBulkItemUploaderWizard wizard = new EbayBulkItemUploaderWizard();
        WizardDialog dialog = new WizardDialog(m_shell, wizard);
        dialog.open();
    }
}

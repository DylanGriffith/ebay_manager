import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class HomePage {

    private Shell m_shell;

    public HomePage(Display display) {
        Shell m_shell = new Shell(display);
        m_shell.setText("Home");
        m_shell.setSize(500, 500);

        m_shell.open();
        launchBulkUploadWizard();

        while (!m_shell.isDisposed()) {
          if (!display.readAndDispatch()) {
            display.sleep();
          }
        }
    }

    public void launchBulkUploadWizard() {
        Shell wizardShell = new Shell(m_shell);
        EbayBulkItemUploaderWizard wizard = new EbayBulkItemUploaderWizard();
        WizardDialog dialog = new WizardDialog(wizardShell, wizard);
        dialog.open();
    }
}

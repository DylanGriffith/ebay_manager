import org.eclipse.jface.wizard.Wizard;
public class EbayBulkItemUploaderWizard extends Wizard {
    public EbayBulkItemUploaderWizard() {
        super();
        setNeedsProgressMonitor(true);
    }
    @Override
    public void addPages() {
        addPage(new BulkImageUploadWizardPage());
    }

    @Override
    public boolean performFinish() {
        return true;
    }
}

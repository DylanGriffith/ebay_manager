import java.util.ArrayList;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class BulkImageUploadWizardPage extends WizardPage {
    private Text text1;
    private Composite container;
    private ArrayList<EbayImage> m_images;

    public BulkImageUploadWizardPage() {
        super("Select Images");
        setTitle("Select Images");
        setDescription("Bulk Product Creator: Select Images for the items you are going to be creating.");
    }

    @Override
    public void createControl(Composite parent) {
        container = new Composite(parent, SWT.RIGHT | SWT.BOTTOM);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 1;
        addButton(container);
        /*
        Label label1 = new Label(container, SWT.NONE);
        label1.setText("Put here a value");

        text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
        text1.setText("");
        text1.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
            }

        @Override
        public void keyReleased(KeyEvent e) {
            if (!text1.getText().isEmpty()) {
                setPageComplete(true);

            }
        }

        });
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        text1.setLayoutData(gd);*/
        // Required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
    }
    public Button addButton (Composite container) {
        Button btn = new Button(container, SWT.PUSH | SWT.RIGHT | SWT.BOTTOM);
        btn.setText("Select Images");
        
        btn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ImageSelectDialog dlg = new ImageSelectDialog(getShell());
                m_images = dlg.fetchImages();
            }
        });
        
        return btn;
    }
}

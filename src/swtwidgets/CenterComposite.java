package swtwidgets;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;

public class CenterComposite extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CenterComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FormLayout());
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite_1.setLayoutData(new FormData());
		
		Composite composite = new Composite(composite_1, SWT.NONE);
		composite.setLayoutData(new RowData(100, SWT.DEFAULT));
		RowLayout rl_composite = new RowLayout(SWT.VERTICAL);
		rl_composite.marginHeight = 10;
		rl_composite.marginBottom = 5;
		rl_composite.marginTop = 5;
		composite.setLayout(rl_composite);
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setText("Yes");
		
		Button btnCheckButton_1 = new Button(composite, SWT.CHECK);
		btnCheckButton_1.setText("No");
		
		Button btnCheckButton_2 = new Button(composite, SWT.CHECK);
		btnCheckButton_2.setText("Not sure");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

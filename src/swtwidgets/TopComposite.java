package swtwidgets;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.layout.RowData;

public class TopComposite extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TopComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FormLayout());
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		FormData fd_composite = new FormData();
		fd_composite.left = new FormAttachment(0);
		fd_composite.right = new FormAttachment(0, 520);
		fd_composite.bottom = new FormAttachment(0, 64);
		fd_composite.top = new FormAttachment(0);
		composite.setLayoutData(fd_composite);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		RowLayout rl_composite_1 = new RowLayout(SWT.VERTICAL);
		rl_composite_1.justify = true;
		composite_1.setLayout(rl_composite_1);
		
		Button btnRadioButton = new Button(composite_1, SWT.RADIO | SWT.CENTER);
		btnRadioButton.setSelection(true);
		btnRadioButton.setText("Read");
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		RowLayout rl_composite_2 = new RowLayout(SWT.VERTICAL);
		rl_composite_2.justify = true;
		rl_composite_2.center = true;
		composite_2.setLayout(rl_composite_2);
		
		DateTime dateTime = new DateTime(composite_2, SWT.BORDER);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

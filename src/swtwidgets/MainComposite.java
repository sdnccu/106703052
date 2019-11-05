package swtwidgets;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import swing2swt.layout.FlowLayout;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainComposite extends Composite {
	private Text text;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MainComposite(Composite parent, int style) {
		super(parent, style);
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		setLayout(rowLayout);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite.setLayoutData(new RowData(618, SWT.DEFAULT));
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		composite_2.setLayoutData(new RowData(105, 64));
		
		Label lblNewLabel = new Label(composite_2, SWT.HORIZONTAL | SWT.CENTER);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setText("Next Page");
		
		TopComposite TopComposite = new TopComposite(composite, SWT.NONE);
		TopComposite.setLayoutData(new RowData(504, 62));
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		CenterComposite centerComposite = new CenterComposite(composite_1, SWT.NONE);
		
		text = new Text(composite_1, SWT.BORDER);
		text.setLayoutData(new RowData(477, 115));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

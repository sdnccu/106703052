package swtwindow;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import swtwidgets.MainComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainWindow {

	int now=2;
	protected Shell shell;
	private Composite SHOW;
	private Composite NextPage;
	private MainComposite NowPage;
	private Composite BackPage;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(627, 319);
		shell.setText("SWT Application");
		shell.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		SHOW = new Composite(shell, SWT.NONE);
		SHOW.setLayout(new StackLayout());
		
		
		NowPage = new MainComposite(SHOW, SWT.NONE);
		
		NextPage = new Composite(SHOW, SWT.NONE);
		RowLayout rl_NextPage = new RowLayout(SWT.HORIZONTAL);
		rl_NextPage.justify = true;
		NextPage.setLayout(rl_NextPage);
		
		Label lblNewLabel = new Label(NextPage, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Cantarell", 20, SWT.BOLD));
		lblNewLabel.setText("This is the next Page!");
		
		BackPage = new Composite(SHOW, SWT.NONE);
		RowLayout rl_BackPage = new RowLayout(SWT.HORIZONTAL);
		rl_BackPage.justify = true;
		BackPage.setLayout(rl_BackPage);
		
		Label lblThisIsThe = new Label(BackPage, SWT.NONE);
		lblThisIsThe.setText("This is the Back Page!");
		lblThisIsThe.setFont(SWTResourceManager.getFont("Cantarell", 20, SWT.BOLD));
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setLayoutData(new RowData(615, 69));
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Composite composite_2 = new Composite(composite_1, SWT.NONE);
		composite_2.setLayoutData(new RowData(106, SWT.DEFAULT));
		
		Composite composite_3 = new Composite(composite_1, SWT.NONE);
		composite_3.setLayoutData(new RowData(502, 65));
		FillLayout fl_composite_3 = new FillLayout(SWT.HORIZONTAL);
		fl_composite_3.spacing = 200;
		fl_composite_3.marginWidth = 10;
		fl_composite_3.marginHeight = 10;
		composite_3.setLayout(fl_composite_3);
		
		Button button = new Button(composite_3, SWT.CENTER);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				show(-1);
			}
		});
		button.setText("< Back");
		button.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		button.setFont(SWTResourceManager.getFont("Cantarell", 17, SWT.BOLD));
		
		Button button_1 = new Button(composite_3, SWT.CENTER);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				show(1);
			}
		});
		button_1.setText("Next >");
		button_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		button_1.setFont(SWTResourceManager.getFont("Cantarell", 17, SWT.BOLD));
		

		StackLayout layout = (StackLayout) this.SHOW.getLayout();
		layout.topControl = this.NowPage;
		this.SHOW.layout();

	}
	
	private void show(int add) {
		StackLayout layout = (StackLayout) this.SHOW.getLayout();
		if (now==1) {
			if(add==1) {
				layout.topControl = this.NowPage;
				now = 2;
			}else {
				return;
			}
		}
		else if (now==2) {
			if(add==-1) {
				layout.topControl = this.BackPage;
				now = 1;
			}
			else if (add==1){
				layout.topControl = this.NextPage;
				now = 3;
			}else {
				return;
			}
		}
		else if (now==3) {
			if(add==-1) {
				layout.topControl = this.NowPage;
				now = 2;
			}else {
				return;
			}
		}
		this.SHOW.layout();
	}
}

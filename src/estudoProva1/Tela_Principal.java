package estudoProva1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.custom.CTabFolder;

public class Tela_Principal extends Shell {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			Tela_Principal shell = new Tela_Principal(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public Tela_Principal(Display display) {
		super(display, SWT.SHELL_TRIM | SWT.BORDER);
		
		Menu menu = new Menu(this, SWT.BAR);
		setMenuBar(menu);
		
		MenuItem mntmCadastros = new MenuItem(menu, SWT.CASCADE);
		mntmCadastros.setText("Cadastros");
		
		Menu menu_1 = new Menu(mntmCadastros);
		mntmCadastros.setMenu(menu_1);
		
		MenuItem mntmCidades = new MenuItem(menu_1, SWT.NONE);
		mntmCidades.setText("&Cidades");
		
		MenuItem mntmPessoas = new MenuItem(menu_1, SWT.NONE);
		mntmPessoas.setText("&Pessoas");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmReltorios = new MenuItem(menu_1, SWT.CASCADE);
		mntmReltorios.setText("Rel\u00E1torios");
		
		Menu menu_2 = new Menu(mntmReltorios);
		mntmReltorios.setMenu(menu_2);
		
		MenuItem mntmCidades_1 = new MenuItem(menu_2, SWT.NONE);
		mntmCidades_1.setText("Cidades");
		
		MenuItem mntmPessoas_1 = new MenuItem(menu_2, SWT.NONE);
		mntmPessoas_1.setText("Pessoas");
		
		MenuItem mntmSair = new MenuItem(menu_1, SWT.NONE);
		mntmSair.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			System.exit(0);
			}
		});
		mntmSair.setImage(SWTResourceManager.getImage(Tela_Principal.class, "/javax/swing/plaf/metal/icons/ocean/error.png"));
		mntmSair.setText("Sair");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmSobre = new MenuItem(menu, SWT.CASCADE);
		mntmSobre.setText("Sobre");
		
		Menu menu_3 = new Menu(mntmSobre);
		mntmSobre.setMenu(menu_3);
		
		MenuItem mntmVersp = new MenuItem(menu_3, SWT.NONE);
		mntmVersp.setText("Vers\u00E3o");
		
		TabFolder tabFolder = new TabFolder(this, SWT.BORDER);
		tabFolder.setBounds(10, 10, 498, 478);
		
		TabItem tbtmAba = new TabItem(tabFolder, SWT.NONE);
		tbtmAba.setText("Aba1");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(536, 570);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

package swt;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ExemploSWT extends Shell {
	private Text txtNome;
	private DateTime txtData;
	private Button btMasculino;
	private Button btFeminino;
	private Button btnMatutino;
	private Button btnVespertino;
	private Button btnNoturno;
	private Table table;
	private Button btnCadastrar;
	private TableColumn tblclmnNome;
	private TableColumn tblclmnDatNasc;
	private TableColumn tblclmnSexo;
	private TableColumn tblclmnMatutino;
	private TableColumn tblclmnVespertino;

	
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			ExemploSWT shell = new ExemploSWT(display);
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
	public ExemploSWT(Display display) {
		super(display, SWT.SHELL_TRIM);
		setImage(SWTResourceManager.getImage(ExemploSWT.class, "/img/motocross Timb\u00E9 17.jpg"));
		
		Label lblNome = new Label(this, SWT.NONE);
		lblNome.setBounds(10, 13, 53, 20);
		lblNome.setText("Nome:");
		
		txtNome = new Text(this, SWT.BORDER);
		txtNome.setBounds(69, 10, 131, 26);
		
		Label lblDataDeNascimento = new Label(this, SWT.NONE);
		lblDataDeNascimento.setBounds(206, 13, 142, 20);
		lblDataDeNascimento.setText("Data de nascimento:");
		
		txtData = new DateTime(this, SWT.DROP_DOWN);
		txtData.setBounds(356, 13, 102, 28);
		
		Group grpSexo = new Group(this, SWT.NONE);
		grpSexo.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		grpSexo.setText("Sexo");
		grpSexo.setBounds(10, 51, 213, 61);
		
		btMasculino = new Button(grpSexo, SWT.RADIO);
		btMasculino.setBounds(10, 33, 111, 20);
		btMasculino.setText("Masculino");
		
		btFeminino = new Button(grpSexo, SWT.RADIO);
		btFeminino.setBounds(127, 33, 111, 20);
		btFeminino.setText("Feminino");
		
		Group grpTurno = new Group(this, SWT.NONE);
		grpTurno.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		grpTurno.setText("Turno");
		grpTurno.setBounds(10, 120, 346, 71);
		
		btnMatutino = new Button(grpTurno, SWT.RADIO);
		btnMatutino.setBounds(10, 35, 111, 20);
		btnMatutino.setText("Matutino");
		
		btnVespertino = new Button(grpTurno, SWT.RADIO);
		btnVespertino.setBounds(127, 35, 111, 20);
		btnVespertino.setText("Vespertino");
		
		btnNoturno = new Button(grpTurno, SWT.RADIO);
		btnNoturno.setBounds(244, 35, 111, 20);
		btnNoturno.setText("Noturno");
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				int indice = table.getSelectionIndex();
				lista.remove(indice);
				lista();
			}
		});
		table.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		table.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_FOREGROUND));
		table.setBounds(10, 347, 448, 116);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		tblclmnNome = new TableColumn(table, SWT.NONE);
		tblclmnNome.setWidth(91);
		tblclmnNome.setText("Nome");
		
		tblclmnDatNasc = new TableColumn(table, SWT.NONE);
		tblclmnDatNasc.setWidth(110);
		tblclmnDatNasc.setText("Dat Nasc");
		
		tblclmnSexo = new TableColumn(table, SWT.NONE);
		tblclmnSexo.setWidth(83);
		tblclmnSexo.setText("Sexo");
		
		tblclmnMatutino = new TableColumn(table, SWT.NONE);
		tblclmnMatutino.setWidth(74);
		tblclmnMatutino.setText("Matutino");
		
		tblclmnVespertino = new TableColumn(table, SWT.NONE);
		tblclmnVespertino.setWidth(100);
		tblclmnVespertino.setText("Vespertino");
		
		TableColumn tblclmnNoturno = new TableColumn(table, SWT.NONE);
		tblclmnNoturno.setWidth(100);
		tblclmnNoturno.setText("Noturno");
		
		btnCadastrar = new Button(this, SWT.NONE);
		btnCadastrar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cadastra();
				lista();
			}
		});
		btnCadastrar.setBounds(10, 197, 346, 26);
		btnCadastrar.setText("Cadastrar");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Exemplo SWT");
		setSize(499, 577);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	private void cadastra(){		
		Pessoa p = new Pessoa();
		p.setNome(txtNome.getText());
		p.setData(txtData.getDay()+"/"+txtData.getMonth()+1+"/"+txtData.getYear());
		p.setSexo(btMasculino.getSelection()?"Masculino":"Feminino");
		p.setMat(btnMatutino.getSelection()?true:false);
		p.setVesp(btnVespertino.getSelection()?true:false);
		p.setNot(btnNoturno.getSelection()?true:false);
		lista.add(p);
	}
	
	private void lista(){
		table.setItemCount(0);
		for (Pessoa p : lista) {
			TableItem it = new TableItem(table, SWT.NONE);
			it.setText(p.toArray());
		}
	}
	
	
	
	
	
	
}

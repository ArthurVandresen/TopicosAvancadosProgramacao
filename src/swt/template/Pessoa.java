package swt.template;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class Pessoa extends Composite {
	private Button btnInativar;
	private Button btnSalvar;
	private Table table;
	private TableColumn tblclmnNome;
	private TableColumn tblclmnSexo;
	private TableColumn tblclmnCidade;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Pessoa(Composite parent, int style) {
		super(parent, style);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(10, -10, 713, 459);
		
		Label lblNome = new Label(composite, SWT.NONE);
		lblNome.setBounds(10, 10, 70, 20);
		lblNome.setText("Nome");
		
		Text txtNome = new Text(composite, SWT.BORDER);
		txtNome.setBounds(86, 10, 261, 26);
		
		Label lblCidade = new Label(composite, SWT.NONE);
		lblCidade.setBounds(10, 54, 70, 20);
		lblCidade.setText("Cidade");
		
		Text txtCidade = new Text(composite, SWT.BORDER);
		txtCidade.setBounds(85, 51, 262, 26);
		
		btnInativar = new Button(composite, SWT.CHECK);
		btnInativar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnInativar.setBounds(129, 94, 111, 20);
		btnInativar.setText("Inativar");
		
		btnSalvar = new Button(composite, SWT.NONE);
		btnSalvar.setBounds(129, 137, 90, 30);
		btnSalvar.setText("Salvar");
		
		Label lblFiltro = new Label(composite, SWT.NONE);
		lblFiltro.setBounds(10, 198, 70, 20);
		lblFiltro.setText("Filtro");
		
		Text txtFiltro = new Text(composite, SWT.BORDER);
		txtFiltro.setBounds(89, 195, 407, 26);
		
		Group grpSexo = new Group(composite, SWT.NONE);
		grpSexo.setText("Sexo");
		grpSexo.setBounds(10, 80, 113, 87);
		
		Button btnMasculino = new Button(grpSexo, SWT.RADIO);
		btnMasculino.setBounds(0, 31, 111, 20);
		btnMasculino.setText("Masculino");
		
		Button btnFeminino = new Button(grpSexo, SWT.RADIO);
		btnFeminino.setBounds(0, 57, 111, 20);
		btnFeminino.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnFeminino.setText("Feminino");
		
		table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 240, 667, 192);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		tblclmnNome = new TableColumn(table, SWT.NONE);
		tblclmnNome.setWidth(314);
		tblclmnNome.setText("Nome");
		
		tblclmnSexo = new TableColumn(table, SWT.NONE);
		tblclmnSexo.setWidth(100);
		tblclmnSexo.setText("Sexo");
		
		tblclmnCidade = new TableColumn(table, SWT.NONE);
		tblclmnCidade.setWidth(243);
		tblclmnCidade.setText("Cidade");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

package swt.template;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class TelaCidade extends Composite {
	private Text txtUF;
	private Button btnSalvar;
	private Text txtNome;
	private Text txtFiltro;
	private TableColumn tblclmnNome;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaCidade(Composite parent, int style) {
		super(parent, style);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(0, 0, 450, 300);
		
		Label lblNome = new Label(composite, SWT.NONE);
		lblNome.setBounds(10, 10, 70, 20);
		lblNome.setText("Nome");
		
		Label lblUf = new Label(composite, SWT.NONE);
		lblUf.setBounds(10, 47, 70, 20);
		lblUf.setText("UF");
		
		txtNome = new Text(composite, SWT.BORDER);
		txtNome.setBounds(103, 10, 191, 26);
		
		txtUF = new Text(composite, SWT.BORDER);
		txtUF.setBounds(103, 41, 78, 26);
		
		btnSalvar = new Button(composite, SWT.NONE);
		btnSalvar.setBounds(190, 37, 90, 30);
		btnSalvar.setText("Salvar");
		
		Label lblFiltro = new Label(composite, SWT.NONE);
		lblFiltro.setBounds(10, 124, 70, 20);
		lblFiltro.setText("Filtro");
		
		txtFiltro = new Text(composite, SWT.BORDER);
		txtFiltro.setBounds(103, 124, 337, 26);
		
		Table table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 172, 430, 118);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		tblclmnNome = new TableColumn(table, SWT.NONE);
		tblclmnNome.setWidth(171);
		tblclmnNome.setText("Nome");
		
		TableColumn tblclmnUf = new TableColumn(table, SWT.NONE);
		tblclmnUf.setWidth(100);
		tblclmnUf.setText("UF");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

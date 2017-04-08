package estudoProva1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class TelaPrincipal extends Shell {
	private Label lblProduto;
	private Text txtProduto;
	private Text txtValor;
	private Text txtQt;
	private Table table;
	private Text txtTotal;

	private ArrayList<Produto> lista = new ArrayList<Produto>();
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			TelaPrincipal shell = new TelaPrincipal(display);
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
	public TelaPrincipal(Display display) {
		super(display, SWT.SHELL_TRIM);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		setImage(SWTResourceManager.getImage(TelaPrincipal.class, "/img/motocross Timb\u00E9 20.jpg"));
		
		lblProduto = new Label(this, SWT.NONE);
		lblProduto.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblProduto.setBounds(10, 20, 70, 20);
		lblProduto.setText("Produto:");
		
		txtProduto = new Text(this, SWT.BORDER);
		txtProduto.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		txtProduto.setBounds(84, 17, 202, 26);
		
		Label lblValor = new Label(this, SWT.NONE);
		lblValor.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblValor.setBounds(10, 60, 70, 20);
		lblValor.setText("Valor:");
		
		txtValor = new Text(this, SWT.BORDER);
		txtValor.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		txtValor.setBounds(84, 60, 99, 26);
		
		Label lblQuantidade = new Label(this, SWT.NONE);
		lblQuantidade.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblQuantidade.setBounds(10, 100, 88, 20);
		lblQuantidade.setText("Quantidade:");
		
		txtQt = new Text(this, SWT.BORDER);
		txtQt.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		txtQt.setBounds(105, 100, 78, 26);
		
		Button btnAdicionar = new Button(this, SWT.NONE);
		btnAdicionar.setBounds(189, 60, 99, 66);
		btnAdicionar.setText("Adicionar");
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		table.setBounds(10, 144, 416, 221);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnProduto = new TableColumn(table, SWT.NONE);
		tblclmnProduto.setWidth(125);
		tblclmnProduto.setText("Produto");
		
		TableColumn tblclmnValorUnitrio = new TableColumn(table, SWT.NONE);
		tblclmnValorUnitrio.setWidth(120);
		tblclmnValorUnitrio.setText("Valor unit\u00E1rio");
		
		TableColumn tblclmnValorTotal = new TableColumn(table, SWT.NONE);
		tblclmnValorTotal.setWidth(167);
		tblclmnValorTotal.setText("Valor Total");
		
		Label lblTotal = new Label(this, SWT.NONE);
		lblTotal.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblTotal.setBounds(189, 381, 70, 20);
		lblTotal.setText("Total:");
		
		txtTotal = new Text(this, SWT.BORDER);
		txtTotal.setBounds(265, 381, 161, 26);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Janela Principal");
		setSize(490, 594);
	}

	public void cadastra(){
		Produto p = new Produto();
		p.setNome(txtProduto.getText());
		p.setQt(Integer.parseInt(txtQt.getText()));
		p.setValor(Double.parseDouble(txtValor.getText()));
		lista.add(p);
		
	}
	
	
	
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	
	public static void main(String[] args) {
		
	}
}

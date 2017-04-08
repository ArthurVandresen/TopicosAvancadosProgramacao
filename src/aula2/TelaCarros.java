package aula2;

import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.PortableServer.ServantRetentionPolicyValue;

@SuppressWarnings("serial")
public class TelaCarros extends JFrame {

	public static JComboBox<String> cbMarca;
	public static JTextField txtAno, txtCor;
	public static JButton btCad, btLimpar;
	public static JTextArea area;
	
	public TelaCarros(){
		super("Cadastro de Carros");
		 
		JPanel painel = new JPanel(new GridLayout(4, 2));
		JPanel painel1 = new JPanel(new GridLayout(2, 1));
		
		JLabel lblMarca = new JLabel("Marca: ");
		JLabel lblAno = new JLabel("Ano: ");
		JLabel lblCor = new JLabel("Cor: ");
		
		txtAno = new JTextField(4);
		txtCor = new JTextField(10);
		
		cbMarca = new JComboBox<String>(new String[]{"Ford","Chevrolet","Volkswagen","Nissan","Mitsubishi"});
		
		
		area = new JTextArea(5,20);
		
		JScrollPane scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		btCad = new JButton("Cadastrar");
		btLimpar = new JButton("Limpar");
		
		area = new JTextArea(10,10);
		JScrollPane br = new JScrollPane(area);
		
		BackCarros back = new BackCarros();
		btCad.addActionListener(back);
		btLimpar.addActionListener(back);
		
	
		painel.add(lblMarca);
		painel.add(cbMarca);
		painel.add(lblAno);
		painel.add(txtAno);
		painel.add(lblCor);
		painel.add(txtCor);
		painel.add(btCad);
		painel.add(btLimpar);
		
		painel1.add(area);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(painel);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaCarros();
		
		
		
	}
}

package swing;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;



public class Janela1 extends JFrame{

	private String[] ufs = new String[] {"SC","RS","PR","MS","SP","RJ"};
	
	private JLabel label1, label2;
	private JTextField txt;
	private JPasswordField pass;
	private JButton button;
	private JToggleButton tbt;
	private ButtonGroup grSexo = new ButtonGroup();
	private JRadioButton rdM, rdF;
	private JCheckBox ckm, ckv, ckn;
	private JComboBox<String> combo;
	private JTextArea texto;
	
	
	public Janela1(){
		setTitle("Janela 1");
		JPanel painel = new JPanel();
		setContentPane(painel);
		
		label1 = new JLabel("Label texto");
		label1.setForeground(new Color(0, 174, 235));
		label1.setFont(new Font("arial",Font.BOLD+Font.ITALIC,18));
		
		label2 = new JLabel(new ImageIcon("src/img/motocross Timbé 17.jpg"));
		label2.setText("Germano");
		label2.setBorder(BorderFactory.createLineBorder(Color .BLACK, 4));;
		
		txt = new JTextField(10);
		txt.setBackground(Color .YELLOW);
		
		pass = new JPasswordField(10);
		
		button = new JButton("Sair");
		button.setIcon(new ImageIcon("src/img/motocross Timbé 18.jpg"));
		
		tbt  = new JToggleButton("Ligar");
		
		rdM = new JRadioButton("Masculino");
		rdF = new JRadioButton("Feminino");
		grSexo.add(rdM);
		grSexo.add(rdM);
		
		ckm = new JCheckBox("Matutino");
		ckv = new JCheckBox("Vespertino");
		ckn = new JCheckBox("Noturno");
		
		combo = new JComboBox<String>(ufs);
		combo.setMaximumRowCount(3);
		combo.setToolTipText("Selecione a UF");
		
		texto = new JTextArea(10, 5);
		//texto.setLineWrap(true);
		
		JScrollPane barraRolagem = new JScrollPane(texto);
		barraRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		barraRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		painel.add(label1);
		painel.add(label2);
		painel.add(txt);
		painel.add(pass);	
		painel.add(button);
		painel.add(tbt);
		painel.add(rdM);
		painel.add(rdF);
		painel.add(ckm);
		painel.add(ckv);
		painel.add(ckn);
		painel.add(combo);
		painel.add(barraRolagem);
		
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Janela1();
	}
	
}

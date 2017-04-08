package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	
	private JLabel lblN1, lblN2;
	private JTextField txtN1, txtN2;
	private JButton btSoma, btSub, btMult, btDiv;
	
	
	public Calculadora(){
		super("Calculadora");
		JPanel painel = new JPanel();
		
		//setAlwaysOnTop(true); // PARA QUEM SE ACHA TIPO O CARA DO SISTEMA DO POSTO
		//setResizable(false);
		setContentPane(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
	}
	
	
	public static void main(String[] args) {
		new Calculadora();
	}
}

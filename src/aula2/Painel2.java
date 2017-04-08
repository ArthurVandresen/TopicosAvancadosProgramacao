package aula2;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import swing.Janela1;

public class Painel2 extends JFrame{
	
	private String[] marcas = new String[] {"Audi","Ford","Nissan","Mitsubishi","Volkswagen"};
	
	private JTextField txt;
	private JComboBox<String> combo;
	
	
	
	public void Janela1(){
		setTitle("Sistema");
		JPanel painel = new JPanel();
		setContentPane(painel);
		
		combo = new JComboBox<String>(marcas);
		combo.setMaximumRowCount(3);
		combo.setToolTipText("Selecione a marca");
		
		txt = new JTextField(10);
			
		
		
		painel.add(txt);
		painel.add(combo);
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Janela1();
	}
}

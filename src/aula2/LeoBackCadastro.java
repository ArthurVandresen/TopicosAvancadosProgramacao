package aula2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class LeoBackCadastro implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		double ano = 0;
	try{
		 ano = Double.parseDouble(Cadastro.txtAno.getText());
		 if(ano <= 1980 )
			 throw new NumberFormatException("Ano deve ser maior que 1980.");
		 
	}catch(NumberFormatException err) {
		JOptionPane.showMessageDialog(Cadastro.txtAno, "Número Inválido : "+err.getMessage());
	}catch(Exception err){
		JOptionPane.showMessageDialog(Cadastro.txtAno, "Erro desconhecido "+err.toString());
	}
	
	String cor = ""; 
}
}
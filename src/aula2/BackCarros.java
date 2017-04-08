package aula2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BackCarros implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==TelaCarros.btCad){
			//cadastro
		}else{
			//limpa tela
			new TelaCarros();
		}
	}
	
	private void cadastra(){
		try{
			String marca = (String)TelaCarros.cbMarca.getSelectedItem().toString();
			String cor = TelaCarros.txtCor.getText();				
			int ano = Integer.parseInt(TelaCarros.txtAno.getText());
				if(ano < 1980)
					throw new NumberFormatException("Ano inferior a 1980");
				if (cor.length() < 4)
					throw new Exception("Cor inválida");
		
			String conteudo = TelaCarros.area.getText();
			String linha = marca+"-"+cor+"-"+ano+"\n";
			TelaCarros.area.setText(conteudo+(linha));
		}catch (NumberFormatException e){
			JOptionPane.showMessageDialog(TelaCarros.btCad, "Número inválido"+e.toString());
		
		}catch (Exception e){
			JOptionPane.showMessageDialog(TelaCarros.btCad, "Erro: "+e.toString());
		}
	}
	
	
	private void LimpaTela(){
		TelaCarros.cbMarca.setSelectedIndex(-1);
		TelaCarros.txtAno.setText("");		
		TelaCarros.txtCor.setText("");
		TelaCarros.area.setText("");
	}
	
}

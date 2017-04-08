package aula2;

public class CadastroCarro {

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

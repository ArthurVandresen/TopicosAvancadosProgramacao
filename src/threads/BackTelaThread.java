package threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackTelaThread implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent e) {
		int qtF1 = Integer.parseInt(TelaThread.txtQtF1.getText());
		int qtF2 = Integer.parseInt(TelaThread.txtQtF2.getText());
		int tpF1 = Integer.parseInt(TelaThread.txtTempoF1.getText());
		int tpF2 = Integer.parseInt(TelaThread.txtTempoF2.getText());
		
		Funcionario f1 = new Funcionario(qtF1, tpF1, TelaThread.barF1);
		Funcionario f2 = new Funcionario(qtF2, tpF2, TelaThread.barF2);
		
		f1.start();
		f2.start();
		
	}

}

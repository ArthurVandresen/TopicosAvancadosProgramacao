package avaliacaoPratica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import threads.TelaThread;

public class BackTelaAvaliacaoPratica implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int tpMaxM1 = Integer.parseInt(TelaAvaliacaoPratica.Maq1_TempoMax.getText());
		int pcMinM1 = Integer.parseInt(TelaAvaliacaoPratica.Maq1_PecasMin.getText());
		int tpTrabM1 = Integer.parseInt(TelaAvaliacaoPratica.Maq1_TempoTrabalho.getText());
		
		
		int tpMaxM2 = Integer.parseInt(TelaAvaliacaoPratica.Maq2_TempoTrabalho.getText());
		int tpMinM2 = Integer.parseInt(TelaAvaliacaoPratica.Maq2_TempoTrabalho.getText());
		int tpTrabM2 = Integer.parseInt(TelaAvaliacaoPratica.Maq2_TempoTrabalho.getText());
		
		
	}

	
		
}

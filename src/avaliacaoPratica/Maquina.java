package avaliacaoPratica;

import javax.swing.JProgressBar;

public class Maquina {

	private int tpMax, pcMin;
	private JProgressBar tpTrabalho;
	
	public Maquina(int tpMax, int pcMin, JProgressBar tpTrabalho) {
		this.tpMax = tpMax;
		this.pcMin = pcMin;
		this.tpTrabalho = tpTrabalho;
	
		this.tpTrabalho.setMaximum(tpMax);
		this.tpTrabalho.setMinimum(0);
		this.tpTrabalho.setValue(0);
	}
	
	public void run(){
		try{
			for(int i=0; i<tpMax; i++){
				Thread.sleep(pcMin);
				tpTrabalho.setValue(i+1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

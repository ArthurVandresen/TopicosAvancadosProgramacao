package threads;

import javax.swing.JProgressBar;

public class Funcionario extends Thread{
	
	private int qt, tempo;
	private JProgressBar barra;
	
	public Funcionario(int qt, int tempo, JProgressBar barra) {
		this.qt = qt;
		this.tempo = tempo;
		this.barra = barra;
	
		this.barra.setMaximum(qt);
		this.barra.setMinimum(0);
		this.barra.setValue(0);
	}
	
	public void run(){
		try{
			for(int i=0; i<qt; i++){
				Thread.sleep(tempo);
				barra.setValue(i+1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
	
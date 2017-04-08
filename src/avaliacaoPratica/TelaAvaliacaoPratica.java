package avaliacaoPratica;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class TelaAvaliacaoPratica extends JFrame{

	 //M�quina 1
    public static JTextField Maq1_TempoMax, Maq1_PecasMin, Maq1_TempoTrabalho;
    
    //M�quina 2
    public static JTextField Maq2_TempoMax, Maq2_PecasMin, Maq2_TempoTrabalho;
	
    //Componentes da interface
    public static JButton btIniciarProducao, btLimpar;
   	public static JProgressBar Maq1_barra, Maq2_barra, Maq1_producao_barra, Maq2_producao_barra;
    
    
    public TelaAvaliacaoPratica(){
	
    	JPanel painel = new JPanel(new GridLayout(7, 2, 10, 10));
        
        //define conte�do de labels
        JLabel Maq1_lbl_TempoMax = new JLabel("Tempo m�ximo uso (horas)");
        JLabel Maq2_lbl_TempoMax = new JLabel("Tempo m�ximo uso (horas)");
        
        JLabel Maq1_lbl_PecasMin = new JLabel("Pe�as por minuto");
        JLabel Maq2_lbl_PecasMin = new JLabel("Pe�as por minuto");
        
        JLabel Maq1_lbl_TempoTrabalho = new JLabel("Tempo de trabalho (em minutos)");
        JLabel Maq2_lbl_TempoTrabalho = new JLabel("Tempo de trabalho (em minutos)");
        
        JLabel lbl_restricoes_maq1 = new JLabel("Restri��es Di�rias da M�quina 1");
        JLabel lbl_restricoes_maq2 = new JLabel("Restri��es Di�rias da M�quina 2");
        
        JLabel lbl_producao_maq1 = new JLabel("Produ��o");
        JLabel lbl_producao_maq2 = new JLabel("Produ��o");
        
        Maq1_TempoMax = new JTextField(10);
        Maq2_TempoMax = new JTextField(10);
        
        Maq1_PecasMin = new JTextField(10);
        Maq2_PecasMin = new JTextField(10);
        
        Maq1_TempoTrabalho = new JTextField(10);
        Maq2_TempoTrabalho = new JTextField(10);
        
        Maq1_barra = new JProgressBar();
        Maq1_producao_barra = new JProgressBar();
        
        Maq2_barra = new JProgressBar();
        Maq2_producao_barra = new JProgressBar();
        
        btIniciarProducao = new JButton("Iniciar a produ��o");
        btLimpar = new JButton("Limpar campos");
        
        JPanel painel_Maq1_restricoes = new JPanel(new GridLayout(3,2));
        JPanel painel_Maq2_restricoes = new JPanel(new GridLayout(3,2));
        
        JPanel painel_Maq1_producao = new JPanel(new GridLayout(1, 2));
        JPanel painel_Maq2_producao = new JPanel(new GridLayout(1, 2));
        
        //painel restri��es M�QUINA 1
        painel_Maq1_restricoes.add(Maq1_lbl_TempoMax);
        painel_Maq1_restricoes.add(Maq1_TempoMax);
        painel_Maq1_restricoes.add(Maq1_lbl_PecasMin);
        painel_Maq1_restricoes.add(Maq1_PecasMin);
        
        //painel produ��o M�QUINA 1
        painel_Maq1_producao.add(Maq1_lbl_TempoTrabalho);
        painel_Maq1_producao.add(Maq1_TempoTrabalho);
        
        
        //painel restri��es M�QUINA 2
        painel_Maq2_restricoes.add(Maq2_lbl_TempoMax);
        painel_Maq2_restricoes.add(Maq2_TempoMax);
        painel_Maq2_restricoes.add(Maq2_lbl_PecasMin);
        painel_Maq2_restricoes.add(Maq2_PecasMin);
        
        //painel produ��o M�QUINA 2
        painel_Maq2_producao.add(Maq2_lbl_TempoTrabalho);
        painel_Maq2_producao.add(Maq2_TempoTrabalho);
        
        
        //PAINEL PRINCIPAL
        painel.add(lbl_restricoes_maq1);
        painel.add(lbl_restricoes_maq2);
        
        painel.add(painel_Maq1_restricoes);
        painel.add(painel_Maq2_restricoes);
        
        painel.add(Maq1_barra);
        painel.add(Maq2_barra);
        
        painel.add(lbl_producao_maq1);
        painel.add(lbl_producao_maq2);
        
        painel.add(painel_Maq1_producao);
        painel.add(painel_Maq2_producao);
        
        painel.add(Maq1_producao_barra);
        painel.add(Maq2_producao_barra);
        
        painel.add(btIniciarProducao);
        painel.add(btLimpar);
        
        
        //arquivo back fun��es
        
        setContentPane(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        
}
    
    public static void main(String[] args) {
		new TelaAvaliacaoPratica();

    }
}

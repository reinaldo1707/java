package exercicio02;

import javax.swing.JOptionPane;

public class Jogador {

    String nome = "";
    double altura = 0;
    double peso = 0;
    int idade = 0;
    double maisalto = 0;
    int maisvelho = 0;
    double maispesado = 0;
    String nomemaisvelho = "";
    String nomemaispesado = "";
    String nomemaisalto = "";
    int jogadores = 0;
    double media = 0;
    double somadealturas = 0;
    double mediaaltura = 0;
    
    public void ObterDados(){
    	nome = JOptionPane.showInputDialog("Qual seu nome?");
    	altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura"));
    	peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso"));
    	idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
    	
    }
    
    public void laco(){
    	
    	int continuar = 0;
    	
    	do{
    		
    	
    	ObterDados();
    	contabilizarJogadores();
    	contabilizarMaisAlto();
    	contabilizarMaisVelho();
    	contabilizarMaisPesado();
    	contabilizarMediaAltura();
    
    	
    	continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
    	}while(continuar == 0);
    		exibirDados();
    }
    public void contabilizarJogadores(){
    	jogadores++;
    }
    
    public void contabilizarMaisAlto(){
    	
    	if(altura > maisalto){
    		maisalto = altura;
    		nomemaisalto = nome;
    		
    	}
    }
    	
    public void contabilizarMaisVelho(){
    	
    	if(idade > maisvelho){
    		maisvelho = idade;
    		nomemaisvelho = nome;
    	}
    	
    }
    public void contabilizarMaisPesado(){
    	
    	if(peso > maispesado){
    		maispesado = peso;
    		nomemaispesado = nome;
    	}
    }
    public double contabilizarMediaAltura(){
    	
    	somadealturas += altura;
    	
    	
    	mediaaltura = somadealturas / jogadores;
    	
    	return mediaaltura;
    }
    	
    public void exibirDados(){
    	
    	String msg = "__________________________\n";
    		   msg+= "A quantidade de jogadores cadastrados é "+jogadores+".\n";
    		   msg+= "O jogador mais alto é "+nomemaisalto+" e sua altura é "+maisalto+".\n";
    		   msg+= "O jogador mais velho é "+nomemaisvelho+" e sua idade é "+maisvelho+".\n";
    		   msg+= "O jogador mais pesado é "+nomemaispesado+" e seu peso é "+maispesado+".\n";
    		   msg+= "A media de altura dos jogadores cadastrados é "+mediaaltura+".\n";
    		   
    		   
    		   JOptionPane.showMessageDialog(null, msg);
    }
    
    }

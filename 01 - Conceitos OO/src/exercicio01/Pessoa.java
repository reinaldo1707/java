package exercicio01;

import javax.swing.JOptionPane;

public class Pessoa {
    String nome;
    String sexo;
    String cargo;
    int idade;
    int masculino = 0;
    int feminino = 0;
    int maioridade = 0;
    int menoridade = 0;
    int gerente = 0;
    int atendente = 0;
    int acougueiro = 0;
    int secretaria = 0;
    int almoxarife = 0;
    int padeiro = 0;
    int estagiario = 0;
    
    public void ObterDados(){
    nome = JOptionPane.showInputDialog("Qual seu nome?");
    sexo = JOptionPane.showInputDialog("Qual seu sexo?(Primeira letra é obrigatoriamente Maiuscula)");
    cargo = JOptionPane.showInputDialog("Qual seu cargo?(Primeira letra é obrigatoriamente Maiuscula)");
    
    idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
    	
    }
    
public void laco(){
		
		//Variavel continuar
		int continuar = 0;
		
		do{
			
			ObterDados();
			contabilizarSexo();
			contabilizarCargo();
			contabilizarIdade();
			exibirDados();
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
		}while(continuar == 0);
		
	}
    

    public void contabilizarSexo(){
    if(sexo.equals("Masculino")){
    	masculino++;
    }
    if(sexo.equals("Feminino")){
    	feminino++;
    }

    }
    
    
    public void contabilizarCargo(){
    if(cargo.equals("Gerente")){
    	gerente++;
    }
    if(cargo.equals("Atendente")){
    atendente++;
    }
    if(cargo.equals("Açougueiro")){
    	acougueiro++;
    }
    if(cargo.equals("Secretaria")){
    	secretaria++;
    }
    if(cargo.equals("Almoxarife")){
    almoxarife++;
    }
    if(cargo.equals("Padeiro")){
    padeiro++;
    }
    if(cargo.equals("estagiario")){
    estagiario++;
    }

    
    }
    
    public void contabilizarIdade(){
    	
    if(idade >= 18){
    	maioridade++;
    }
    if(idade < 17){
    	menoridade++;
    }

    }
    
    //Exibir quantidade de cada cargo
    public void exibirDados(){
    	
    	String msg = "____________________________________\n";
    		   msg+= "O seu nome é "+nome+".\n";
    		   msg+= "O seu sexo é "+sexo+".\n";
    		   msg+= "O seu cargo é "+cargo+".\n";
    		   msg+= "A sua idade é "+idade+".\n";
    		   msg+= "A quantidade de Gerentes é "+gerente+".\nA quantidade de Atendentes é "+atendente+".\nA quantidade de Açougueiros é "+acougueiro+".\nA quantidade de Secretarias é "+secretaria+".\nA quantidade de Almoxarifes é "+almoxarife+".\nA quantidade de Padeiros é "+padeiro+".\nA quantidade de Estagiarios é "+estagiario+".\n";
    		   msg+= "A quantidade de Homens é "+masculino+".\n";
    		   msg+= "A quantidade de Mulheres é "+feminino+".\n";
    		   msg+= "____________________________________";
    		   
    		   JOptionPane.showMessageDialog(null, msg);
    		   
    }
    
}
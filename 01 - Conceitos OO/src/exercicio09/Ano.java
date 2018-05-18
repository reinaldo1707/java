package exercicio09;
import javax.swing.*;
public class Ano {

        int ano = 0; 
        int continuar = 0;


    	
    	public void DadosGerados(){
        ano = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o ano por favor"));
    	}
    	
    	public void laço(){
    	
    		do{
    		DadosGerados();
    		ExibirDados();
    		continuar = JOptionPane.showConfirmDialog(null,"Deseja continuar?");
    	    }while (continuar != 1);
    	
    	}
    	public void ExibirDados(){
    	if(ano % 4 == 0){
    		JOptionPane.showMessageDialog(null,"Ano bissexto");
    	}else{
    		JOptionPane.showMessageDialog(null,"Não é bissexto");
    	}
    	}
}
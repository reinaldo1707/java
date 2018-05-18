package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovado = 0, reprovado = 0;
	
	//M�todo para realizar perguntas
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1� nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2� nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3� nota"));
		
		
	}
	
	//M�todo para o la�o de repeti��o
	public void laco(){
		
		//Variavel continuar
		int continuar = 0;
		
		do{
			
			obterDados();
			exibirDados();
			contabilizarSituacao();
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
		}while(continuar == 0);
		
	}
	
	//M�todo para retornar a m�dia
	public double calculoMedia(){
		
		double media = (nota1+nota2+nota3)/3;
		
		return media;
	}
	
	//M�todo para retornar a situa��o do aluno
	public String situacaoAluno(){
		
		String situacao = calculoMedia() >= 7 ? "Aprovado" : "Reprovado";
		
		return situacao;
		
	}
	
	//M�todo para contabilizar aprovados e reprovados
	public void contabilizarSituacao(){
		
		if(calculoMedia() >= 7){
			aprovado++;
		}else{
			reprovado++;
		}
	}
	
	//M�todo para exibir a m�dia e a situa��o do aluno
	public void exibirDados(){
		
		String msg = "O aluno "+nome;
			   msg+= "\nObteve m�dia: "+String.format("%.2f", calculoMedia());
			   msg+= "\nSua situa��o �: "+situacaoAluno();
			   msg+= "\nH� "+aprovado+" aprovados.";
			   msg+= "\nH� "+reprovado+" reprovados.";
			   
			JOptionPane.showMessageDialog(null, msg);
	}
}

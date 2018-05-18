package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	/*
	 	Encapsulamento -> Visibilidade de atributos e m�todos
	 	DEFAULT 	-> Visivel apenas nas classes no mesmo pacote
	 	PUBLIC 		-> Visivel por qualquer classe (Em qualquer projeto)
	 	PRIVATE 	-> Visivel apenas na classe onde s�o criados
	 	PROTECTED 	-> Visivel na classe onde sao criados ou herdados
	 */
	
	//Atributos da classe
	private String nome;
	private double nota1, nota2;


	
	//M�todo para obter os dados
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Qual � seu nome?");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 01"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 02"));
		
		exibirFrase();
	}
	
	//M�todo para retornar a m�dia
	private double calculoMedia(){
		
		return (nota1+nota2) / 2;
	}
	
	
	//M�todo para exibir uma frase
	private void exibirFrase(){
		JOptionPane.showMessageDialog(null, nome+" obteve m�dia "+calculoMedia());
		
	}
}

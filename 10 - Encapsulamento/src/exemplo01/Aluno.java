package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	/*
	 	Encapsulamento -> Visibilidade de atributos e métodos
	 	DEFAULT 	-> Visivel apenas nas classes no mesmo pacote
	 	PUBLIC 		-> Visivel por qualquer classe (Em qualquer projeto)
	 	PRIVATE 	-> Visivel apenas na classe onde são criados
	 	PROTECTED 	-> Visivel na classe onde sao criados ou herdados
	 */
	
	//Atributos da classe
	private String nome;
	private double nota1, nota2;


	
	//Método para obter os dados
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Qual é seu nome?");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 01"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 02"));
		
		exibirFrase();
	}
	
	//Método para retornar a média
	private double calculoMedia(){
		
		return (nota1+nota2) / 2;
	}
	
	
	//Método para exibir uma frase
	private void exibirFrase(){
		JOptionPane.showMessageDialog(null, nome+" obteve média "+calculoMedia());
		
	}
}

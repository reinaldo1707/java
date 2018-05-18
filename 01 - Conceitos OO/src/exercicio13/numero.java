package exercicio13;

import javax.swing.*;

public class numero {

	int numeros;
	int numerosv;
	int calculo;
	int resultado;
	int contador;
	
	public void DadosGerais(){
	numeros = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	
	}
	public void laço(){
		
		DadosGerais();
		Calculos();
	}
	
	public void Calculos(){
		
		
		
		do{
			numerosv = numeros-1;
			contador = numerosv;
			calculo = numeros * numerosv;
			resultado = calculo * numerosv;
			System.out.println(resultado);
			contador--;
		}while(contador == 1);
		
		
		}
		
	}

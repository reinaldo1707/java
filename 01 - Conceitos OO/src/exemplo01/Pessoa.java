//Classe = Molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

		//Atributos (caracteristicas)
	String nome;
	int idade;
	double peso, altura;
	
	//M�todo de apresenta��o
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Boa tarde! Meu nome � "+nome);
		
	}
	
	//M�todo para calcular o IMC
	public double calculoIMC(){
		
		double imc = peso/ Math.pow(altura, 2);
		
		return imc;
		
	}

	//M�todo para retornar a condi��o do IMC
	public String condicaoIMC(){
		
		//Obter o valor do imc
		double imc = calculoIMC();
		
		//Variavel contendo a condi��o
		String condicao;
		
		//Condicional
		if(imc < 17){
			condicao = "Muito abaixo do peso.";
		}else if(imc <  18.5){
			condicao = "Abaixo do peso.";
		}else if(imc < 25){
			condicao = "Peso normal.";
		}else if(imc < 30){
				condicao = "Acima do peso.";
		}else if(imc <  35){
				condicao = "Obesidade I.";
		}else if(imc < 40){
				condicao = "Obesidade II.";
		}else{
			condicao = "Obesidade III";
			
			
		}
		
		//Retorno
		return condicao;
	}
	
	//M�todo para exibir o IMC
	public void exibirIMC(){
		
		String msg = "*****IMC*****\n";
			   msg+= "Seu imc � de: "+String.format("%.2f", calculoIMC())+".\n";
			   msg+= "Sua condi��o � "+condicaoIMC();
			   
			   JOptionPane.showMessageDialog(null, msg);
	}
	
}

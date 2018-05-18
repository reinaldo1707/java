package exercicio05;

import javax.swing.*;

public class Papelaria {

    String produto = "", tabela = "";
    double valor = 0;
    int indice = 0;
    String valorUnitario, valorTotal;
    double porcento = 0.05;
    
    public void DadosGerais(){

    produto = JOptionPane.showInputDialog("Insira um produto");
    valor = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto"));

    }
    
    public void laço(){
     
    	DadosGerais(); 
    	do{
    	ContabilizarPreço();
    	ExibirValores();
    	}while(indice <= 10);	
    }
    public void ContabilizarPreço(){
    	
    	   valorUnitario = String.format("%.2f",valor-(valor * porcento));
           valorTotal = String.format("%.2f", (valor-(valor * porcento))*indice);
    	
    }
    public void ExibirValores(){
    	
    tabela += "\n"+indice+" "+ produto+" custa "+valorUnitario+" cada, em quantidade custará "+valorTotal;
    indice++;
    porcento+=0.05;
    
    	JOptionPane.showMessageDialog(null, tabela);

    } 
    
   
}
package exercicio12;

import javax.swing.JOptionPane;

public class Sistema {

	double ValorInicial;
	int mes;
	double GanhoPorMes;
	int contador = 0;
	double calculo;
	double ValorPoupan�a;
	double ValorCDBPorAno;
	double ValorInicial2;
	double calculo2;
	double GanhoPorMes2;
	int contador2 = 0;
	
	
	public void DadosGerais(){
		ValorInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor inicial"));
		ValorInicial2 = ValorInicial;
		do{
		mes = Integer.parseInt(JOptionPane.showInputDialog("Quanto m�s voc� investiu ?"));
		}while((mes < 1) || (mes > 48));
		
	}
	
	public void laco(){
		DadosGerais();
		ContabilizarPoupan�a();
		ContabilizarCDB();
	}


	public void ContabilizarPoupan�a(){
		ValorPoupan�a = ValorInicial;
		calculo = ValorPoupan�a * 0.0037;
		do{
		
		GanhoPorMes = ValorPoupan�a + calculo;
		ValorPoupan�a = GanhoPorMes;
		contador++;
		System.out.println(String.format("%.2f",ValorPoupan�a));
		}while(contador <= mes);
		
	}
	
	public void ContabilizarCDB(){
		ValorCDBPorAno = ValorInicial2;
		calculo2 = ValorCDBPorAno * 0.0053;
		do{
		GanhoPorMes2 = ValorCDBPorAno + calculo2;
		ValorCDBPorAno = GanhoPorMes2;
		contador2++;
		System.out.println(String.format("%.2f",ValorCDBPorAno));
		}while(contador2 <= mes);
		
		if(mes >= 6){
			
		}
	}

}


package ex03;

import javax.swing.JOptionPane;

public class Cliente {

	
		
		String tabela;
		int quantidades;
		String compras;
		double total = 0;
		double valorPago = 0;
		int continuar = 0;
		double valorReceber = 0;
		
		public void  DadosGerais() {
				   tabela = "C�digo 1 :Hamb�rguer + Suco de Laranja com o valor de R$ 5,00 \nC�digo 2 :Sandu�che natural + Suco de Uva com o valor de R$ 4,50\nC�digo 3 :Prato do dia com o valor de R$ 8,00\nC�digo 4 :Pizza com o valor de R$12,00\nC�digo 5 :Lasanha com o valor de R$ 16,50\nC�digo 6 :P�o de queijo com o valor de R$ 1,00\nC�digo 7: Bolo com o valor de R$ 2,50";
				   compras =  JOptionPane.showInputDialog(tabela + "\nInsira seu c�digo por favor");
				   quantidades = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade ?"));
				   
				   
		}
		public void laco() {
		do {
			DadosGerais();
			ContabilizarCompras();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");	
			}while(continuar == 0);
			ContabilizarTroco();
			ExibirDados();
			
		
		}
			
		
		
		public double ContabilizarCompras() {
			if(compras.equals("1")) {
			total += quantidades *5;
			}
			if(compras.equals("2")) {
			total += quantidades*4.5;
			}
			if(compras.equals("3")) {
			total += quantidades * 8;
			}
			if(compras.equals("4")) {
			total += quantidades * 12;
			}
			if(compras.equals("5")) {
			total += quantidades * 16.50;
			}
			if(compras.equals("6")) {
			total += quantidades * 1;
			}
			if(compras.equals("7")) {
			total += quantidades * 2.50;
			}
			return total;
		}
		
		public double ContabilizarTroco() {
	         valorPago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago pelo cliente"));
	        if(valorPago < total){
	            JOptionPane.showMessageDialog(null, "Invalido");
	        }else{
	        	valorReceber = valorPago - total;
	        }
			
	        return valorReceber;
		}
		
		public void ExibirDados() {
			String msg = "Voc� escolheu o c�digo "+compras;
				   msg += "\nVoce escolheu a quantidade de "+quantidades;
				   msg += "\nVoc� ter� que pagar "+total;
				   msg += "\nVoc� ir� receber o troco de "+valorReceber;
				   JOptionPane.showMessageDialog(null,msg);
		}
	}

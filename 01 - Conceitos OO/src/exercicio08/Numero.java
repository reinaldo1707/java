package exercicio08;

import javax.swing.*;

public class Numero {

  
	int numero;
    int antecessor1 = numero-1;
    int antecessor2 = numero-2;
    int antecessor3 = numero-3;
    int antecessor4 = numero-4;
    int antecessor5 = numero-5;
    int antecessor6 = numero-6;
    int antecessor7 = numero-7;
    int antecessor8 = numero-8;
    int antecessor9 = numero-9;
    int antecessor10 = numero-10;
    int sucessor1 = numero+1;
    int sucessor2 = numero+2;
    int sucessor3 = numero+3;
    int sucessor4 = numero+4;
    int sucessor5 = numero+5;
    int sucessor6 = numero+6;
    int sucessor7 = numero+7;
    int sucessor8 = numero+8;
    int sucessor9 = numero+9;
    int sucessor10 = numero+10;
    
    public void DadosGerados(){
 numero = Integer.parseInt(JOptionPane.showInputDialog("Informe seu numero"));
    }
 
    public void laço(){
    	DadosGerados();
    	ExibirDados();
    }
    public void ExibirDados(){
    JOptionPane.showMessageDialog(null,"O primeiro sucessor é "+sucessor1+" e o primeiro antecessor é "+antecessor1+".\nO segundo sucessor é "+sucessor2+" e o segundo antecessor é "+antecessor2+".\nO terceiro sucessor é "+sucessor3+" e o terceiro antecessor é "+antecessor3+".\nO quarto sucessor é "+sucessor4+" e o quarto antecessor é "+antecessor4+".\nO quinto sucessor é "+sucessor5+" e o quinto antecessor é "+antecessor5+".\nO sexto sucessor é "+sucessor6+" e o sexto antecessor é "+antecessor6+".\nO setimo sucessor é "+sucessor7+" e o setimo antecessor é "+antecessor7+".\nO oitavo sucessor é "+sucessor8+" e o oitavo antecessor é "+antecessor8+".\nO nono sucessor é "+sucessor9+" e o nono antecessor é "+antecessor9+".\nO decimo sucessor é "+sucessor10+" e o decimo antecessor é "+antecessor10+".");
    }
        } 
        
    

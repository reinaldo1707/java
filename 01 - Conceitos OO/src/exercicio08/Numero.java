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
 
    public void la�o(){
    	DadosGerados();
    	ExibirDados();
    }
    public void ExibirDados(){
    JOptionPane.showMessageDialog(null,"O primeiro sucessor � "+sucessor1+" e o primeiro antecessor � "+antecessor1+".\nO segundo sucessor � "+sucessor2+" e o segundo antecessor � "+antecessor2+".\nO terceiro sucessor � "+sucessor3+" e o terceiro antecessor � "+antecessor3+".\nO quarto sucessor � "+sucessor4+" e o quarto antecessor � "+antecessor4+".\nO quinto sucessor � "+sucessor5+" e o quinto antecessor � "+antecessor5+".\nO sexto sucessor � "+sucessor6+" e o sexto antecessor � "+antecessor6+".\nO setimo sucessor � "+sucessor7+" e o setimo antecessor � "+antecessor7+".\nO oitavo sucessor � "+sucessor8+" e o oitavo antecessor � "+antecessor8+".\nO nono sucessor � "+sucessor9+" e o nono antecessor � "+antecessor9+".\nO decimo sucessor � "+sucessor10+" e o decimo antecessor � "+antecessor10+".");
    }
        } 
        
    

package exercicio06;

import javax.swing.*;

public class Aluno {

	String nome = "";
    int masculino = 0;
    int feminino = 0;
    int nota1;
    int nota2;
    int nota3;
    int nota4;
    double media;
    int continuar;
    int total = 0;
    int parabens = 0;
	int otimo = 0;
	int bom = 0;
	int satisfatorio = 0;
   	int recuperacao = 0;
	int reprovado = 0;
	
    Object[] sexo = {"masculino", "feminino"};
    
    public void DadosGerais(){
    	
    	 nome = JOptionPane.showInputDialog(null, "Informe um nome ou SAIR para finalizar");

    	 while(nome.equals("sair"));
    total++;
  

    
    }
    
    public void laço(){
    	do{
    	DadosGerais();
    	ContabilizarSexos();
    	ContabilizarNotas();
        continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

        }while(continuar != 1);
    	
    	ExibirDados();
    }
    	
   public void ContabilizarSexos(){
	   
	    Object escolha = JOptionPane.showInputDialog(null, "Qual seu sexo", "Título", JOptionPane. PLAIN_MESSAGE,null,sexo,"");
	    
	     if(escolha.equals("masculino")){

             masculino++;

         }else if(escolha.equals("feminino")){

             feminino++;
         }
   }
   
    public void ContabilizarNotas(){
    	
    nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua primeira nota?"));
    nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua segunda nota?"));
    nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua terceira nota?"));
    nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua quarta nota?"));
    
    media = (nota1+nota2+nota3+nota4)/4;
    
          if(media == 10){
		parabens++;
    }else if(media >= 9){
		otimo++;
    }else if(media >= 8){
		bom++;
    }else if(media >= 7){
		satisfatorio++;
    }else if(media >= 5){
		recuperacao++;
    }else if(media < 5){
		reprovado++;
}
      
    JOptionPane.showMessageDialog(null, "Sua media é "+media);
}
    
    public void ExibirDados(){
    	
    	

      JOptionPane.showMessageDialog(null, "São "+masculino+" ou "+(100/total*masculino)+"% Homens.\nSão "+feminino+" ou "+(100/total*feminino)+"% Mulheres.\n"+parabens+" ou "+(100/total*parabens)+"% Alunos tiraram 10.\n"+otimo+" ou "+(100/total*otimo)+"% Alunos tiraram 9.\n"+bom+" ou "+(100/total*bom)+"% Alunos tiraram 8.\n"+satisfatorio+" ou "+(100/total*satisfatorio)+"% Alunos tiraram 7.\n"+recuperacao+" ou "+(100/total*recuperacao)+"% Alunos tiraram 5.\n"+reprovado+" ou "+(100/total*reprovado)+"% Alunos foram reprovados.");
    }
}

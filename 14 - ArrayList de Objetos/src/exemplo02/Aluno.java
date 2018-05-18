package exemplo02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos da classe
	private String nome;
	private double nota1, nota2, media;
	
	//ArrayList
	ArrayList<Aluno> dados = new ArrayList<>();
	
	//Metodo para cadastrar no ArrayList
	private void cadastrar(){
		
		//Instanciar um objeto
		Aluno a = new Aluno();
		
		//Obter os dados do aluno
		a.nome = JOptionPane.showInputDialog("Nome");
		a.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		a.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		
		//Realizar a media
		a.media = (a.nota1 + a.nota2) / 2;
	
		//Adicionar o aluno ao vetor
		dados.add(a);
		
		//Mensagem
		JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
		
		}
	
		//Metodo para listar os alunos cadastrados
		private void listar(){
			
			//Agrupar
			String Agrupar = "Alunos cadastrados:\n\n";
			
			//Laço
			for(int i = 0;i < dados.size(); i++){
				Agrupar += "nome: "+dados.get(i).nome + "\n";
				Agrupar += "Média: "+dados.get(i).media + "\n\n";
				
			}
			
			//Exibir mensagem
			JOptionPane.showMessageDialog(null, Agrupar);
		
	}
		
		//Metodo menu
		public void menu(){
			
			//Menu
			String menu = "***MENU***\n\n";
			menu+= "1) Cadastrar aluno \n";
			menu+= "2) Alterar aluno\n";
			menu+= "3) Sair";
			
			//Obter Opção selecinada
			int opcao = 0;
					
			//Laço
			do{
				
				opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				switch(opcao){
				case 1:
				cadastrar();
				break;
				
				case 2:
				listar();
				break;
				
				case 3:
				JOptionPane.showMessageDialog(null, "Bye :D");
				break;

			}
				
			}while(opcao != 3);
			
		}
   }

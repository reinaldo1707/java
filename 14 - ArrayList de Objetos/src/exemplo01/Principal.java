package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Criar ArrayList
      ArrayList<String> cursos = new ArrayList<>();
      
      //Cadastrar cursos
      cursos.add("Java SE");
      cursos.add("Java - WEB");
      cursos.add("Java - Android");
      cursos.add("HTML");
      cursos.add("CSS");
      cursos.add("Oracle");
      
      //Exibir a quantidade de cursos cadastrados
      System.out.println("H� "+cursos.size()+" cadastros");
      
      //Exibir o segundo curso do ArrayList
      System.out.println(cursos.get(1));
      
	}

}

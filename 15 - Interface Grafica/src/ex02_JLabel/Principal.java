package ex02_JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Ultilizando JFrame");
		formulario.setLayout(null);
		
		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Ol� Mundo!");
		rotulo.setBounds(0, 50, 300, 20);
		
		//Adicionar Componente
		formulario.add(rotulo);
	}

}

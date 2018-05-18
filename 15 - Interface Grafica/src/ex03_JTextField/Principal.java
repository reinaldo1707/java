package ex03_JTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar JFrame
		JFrame formulario = new JFrame();
		
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Ultilizando JFrame");
		formulario.setLayout(null);
		
		//JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10, 10, 150, 20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(120, 10, 150, 20);
		
		//Adicionar elemento ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		
		//Exibir o formulario
		formulario.setVisible(true);
	}

}

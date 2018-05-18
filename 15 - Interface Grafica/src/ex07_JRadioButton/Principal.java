package ex07_JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.LimitExceededException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

		public static void main(String[] args) {
		
			//Instanciar JFrame
			JFrame formulario = new JFrame();
			formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			formulario.setSize(500,300);
			formulario.setLocationRelativeTo(null);
			formulario.setTitle("Utilizando JRadioButton");
			formulario.setLayout(null);

			//JCheckBox
			JRadioButton cbtMasculino = new JRadioButton("Masculino");
			cbtMasculino.setBounds(10, 10, 100, 20);
			
			JRadioButton cbtFeminino = new JRadioButton("Feminino");
			cbtFeminino.setBounds(110, 10, 100, 20);
			
			//JButton
			JButton botao = new JButton("Clique aqui");
			botao.setBounds(40, 50, 150, 20);
			
			//A��o
			botao.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if((cbtMasculino.isSelected()) && (cbtFeminino.isSelected())){
						JOptionPane.showMessageDialog(null, "Ambos est�o selecionados");
					}else if(cbtMasculino.isSelected()){
						JOptionPane.showMessageDialog(null, "Masculino selecionado");
					}else if(cbtFeminino.isSelected()){
						JOptionPane.showMessageDialog(null, "Feminino selecionado");
					}else{
						JOptionPane.showMessageDialog(null, "Nenhum selecionado");
					}
					
					
				}
			});

			//Adicionar componentes ao JFrame
			formulario.add(cbtMasculino);
			formulario.add(cbtFeminino);
			formulario.add(botao);
			
			//Exibir toda a estrutura
			formulario.setVisible(true);
			
		}

	}

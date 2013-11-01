package br.senai.cs.projetojava.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField cpUsuario;
	private JPasswordField cpSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setBounds(93, 84, 46, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(93, 124, 46, 14);
		contentPane.add(lblSenha);
		
		cpUsuario = new JTextField();
		cpUsuario.setBounds(149, 81, 176, 20);
		contentPane.add(cpUsuario);
		cpUsuario.setColumns(10);
		
		cpSenha = new JPasswordField();
		cpSenha.setBounds(149, 121, 176, 20);
		contentPane.add(cpSenha);
		cpSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(verificar()== false) return;
				if(validarUsuario()== false) return;
				if(validarSenha()== false) return;
				
			}
		});
		btnEntrar.setBounds(149, 205, 91, 23);
		contentPane.add(btnEntrar);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(299, 205, 91, 23);
		contentPane.add(btnCancelar);
	}
	private boolean verificar() {
		if (cpUsuario.getText().equals("")) {
			JOptionPane.showMessageDialog(this, 
					"Informe o Usuário!!", 
					"Erro", 
					JOptionPane.ERROR_MESSAGE);
			cpUsuario.requestFocus();
			return false;
		}

		if (cpSenha.getText().equals("")) {
			JOptionPane.showMessageDialog(this, 
					"Informe a Senha!!", 
					"Erro", 
					JOptionPane.ERROR_MESSAGE);
			cpSenha.requestFocus();
			return false;
		}
		return true;
}
	private boolean validarUsuario(){
		if (cpUsuario.getText().equals("Fabio")) {
			cpUsuario.requestFocus();
			
		}
		else{
			JOptionPane.showMessageDialog(null,"Usuário Invalido"); 
			return false;
		}	
		return true;
	}
	private boolean validarSenha(){
		if (cpSenha.getText().equals("123")) {
			JOptionPane.showMessageDialog(this, 
					"Seja Bem Vindo", 
					"Bem Vindo", 
					JOptionPane.ERROR_MESSAGE);
			cpSenha.requestFocus();
			return false;
		}
		else{
			JOptionPane.showMessageDialog(null, "Senha Invalida");
			
		}		
		return true;
	}
	
	}


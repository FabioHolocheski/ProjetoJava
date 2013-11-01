package br.senai.cs.projetojava.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class MDI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDI frame = new MDI();
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
	public MDI() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu cpCadastro = new JMenu("Cadastro");
		cpCadastro.setForeground(new Color(255, 255, 0));
		menuBar.add(cpCadastro);
		
		JMenuItem cpFuncionario = new JMenuItem("Funcionario");
		cpFuncionario.setForeground(Color.YELLOW);
		cpCadastro.add(cpFuncionario);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.setForeground(Color.YELLOW);
		cpCadastro.add(mntmProduto);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.setForeground(Color.YELLOW);
		cpCadastro.add(mntmCliente);
		
		JMenu mnMovimentao = new JMenu("Movimenta\u00E7\u00E3o");
		mnMovimentao.setForeground(Color.GREEN);
		menuBar.add(mnMovimentao);
		
		JMenuItem mntmPeriodoDeVenda = new JMenuItem("Periodo de Venda");
		mntmPeriodoDeVenda.setForeground(Color.GREEN);
		mnMovimentao.add(mntmPeriodoDeVenda);
		
		JMenuItem mntmPeriodoDeCompra = new JMenuItem("Periodo de Compra");
		mntmPeriodoDeCompra.setForeground(Color.GREEN);
		mnMovimentao.add(mntmPeriodoDeCompra);
		
		JMenu mnEstoque = new JMenu("Estoque");
		mnEstoque.setForeground(Color.MAGENTA);
		menuBar.add(mnEstoque);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.setForeground(Color.MAGENTA);
		mnEstoque.add(mntmConsulta);
		
		JMenuItem mntmRelatorio = new JMenuItem("Relatorio");
		mntmRelatorio.setForeground(Color.MAGENTA);
		mnEstoque.add(mntmRelatorio);
		
		JMenu mnUltilitarios = new JMenu("Ultilitarios");
		mnUltilitarios.setForeground(Color.DARK_GRAY);
		menuBar.add(mnUltilitarios);
		
		JMenuItem mntmUsurios = new JMenuItem("Usu\u00E1rios");
		mntmUsurios.setForeground(Color.CYAN);
		mnUltilitarios.add(mntmUsurios);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar Senha");
		mntmAlterarSenha.setForeground(Color.CYAN);
		mnUltilitarios.add(mntmAlterarSenha);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setForeground(Color.BLUE);
		menuBar.add(mnSair);
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

}

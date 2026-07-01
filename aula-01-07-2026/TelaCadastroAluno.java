package interfaceGrafica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class TelaCadastroAluno extends JFrame {
	//componentes
	private JTextField txtNome; //inputs
	private JTextField txtCurso; //inputs
	private JTable table; //tabela onde os dados serão exibidos
	private DefaultTableModel modelo; //controlar os dados da tabela
	private int linhaSelecionada = -1; //indica que nenhuma linha está selecionada
	
	//construtor quando a tela for criada
	public TelaCadastroAluno() {
		setTitle("Cadastro de alunos"); //título da janela
		setSize(650, 450); //tamanho da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null); //posicionar os elementos manualmente
		setLocationRelativeTo(null); //centralizar a janela
		
		//rotulo
		JLabel lblNome = new JLabel("Nome: "); //nome do rótulo
		lblNome.setBounds(20, 20, 80, 25); //posição
		getContentPane().add(lblNome); //adiciona a janela
		
		txtNome = new JTextField(); //campo de texto (input)
		txtNome.setBounds(90, 20, 220, 25); //posição
		getContentPane().add(txtNome);
		
		JLabel lblCurso = new JLabel("Curso: "); //nome do rótulo
		lblCurso.setBounds(20, 60, 80, 25); //posição
		//x=20, y=60, largura=80, altura=25
		getContentPane().add(lblCurso); //adiciona a janela
		
		txtCurso = new JTextField(); //campo de texto (input)
		txtCurso.setBounds(90, 60, 220, 25); //posição
		getContentPane().add(txtCurso);
		
		//botões
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(319, 18, 120, 30);
		getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(322, 59, 117, 29);
		getContentPane().add(btnEditar);
		
		modelo = new DefaultTableModel(); //criar o modelo que vai armazenar os dados
		modelo.addColumn("Nome");
		modelo.addColumn("Curso");
		
		table = new JTable(modelo);
		table.setBounds(44, 125, 575, 209);
		getContentPane().add(table);
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(20, 120, 500, 250);
		getContentPane().add(scroll);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(451, 19, 117, 29);
		getContentPane().add(btnExcluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(451, 59, 117, 29);
		getContentPane().add(btnLimpar);
		
		JLabel lblNewLabel = new JLabel("UnDF - Engenharia de Software - POO");
		lblNewLabel.setBounds(201, 382, 257, 16);
		getContentPane().add(lblNewLabel);
		
        
		//ações quando os botões são clicados
		btnSalvar.addActionListener(e -> salvarAluno());
		btnEditar.addActionListener(e -> editarAluno());
		btnExcluir.addActionListener(e -> excluirAluno());
		btnLimpar.addActionListener(e -> limparCampos());
		
	}
	
	//metodo para salvar aluno com validação
	private void salvarAluno() {
		//JOptionPane.showMessageDialog(null, "Teste");
		String nome = txtNome.getText(); //pega o texto digitado em nome
		String curso = txtCurso.getText();
		
		//validação para que o usuário preencha todos os campos
		if(nome.isEmpty() || curso.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
			return;
		}
		Aluno aluno = new Aluno(nome, curso); //instanciando o objeto

		//verificar se o cadastro é novo
		if(linhaSelecionada == -1) {
			modelo.addRow(new Object[] { //adicionar os itens na tabela
					aluno.getNome(), //pega os itens digitados
					aluno.getCurso()
			});
			JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
		} else {
			modelo.setValueAt(aluno.getNome(), linhaSelecionada, 0);
			modelo.setValueAt(aluno.getCurso(), linhaSelecionada, 1);
			JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");
			linhaSelecionada = -1; //voltando para o modo de cadastro
		}
		limparCampos();
	}
	
	//método para editar um aluno com validação
	private void editarAluno() {
		//JOptionPane.showMessageDialog(null, "Teste");
		linhaSelecionada = table.getSelectedRow();
		
		//validação para verificar se tem algum aluno selecionado
		if (linhaSelecionada == -1) {
			JOptionPane.showMessageDialog(this, "Selecione um aluno.");
            return;
		}
		
		txtNome.setText(modelo.getValueAt(linhaSelecionada, 0).toString());
		txtCurso.setText(modelo.getValueAt(linhaSelecionada, 1).toString());
	}
	
	//metodo para limpar os dados
	private void limparCampos() {

        txtNome.setText(""); 
        txtCurso.setText(""); 

        txtNome.requestFocus(); //fazer o curso voltar ao ponto de origem do campo
    }
	
	//metodo de exclusão
	private void excluirAluno() {
		int linha = table.getSelectedRow();
		if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um aluno.");
            return;
        }
		
		int opcao = JOptionPane.showConfirmDialog(this,"Deseja excluir este aluno?", "Confirmação", JOptionPane.YES_NO_OPTION);
		if (opcao == JOptionPane.YES_OPTION) {
			modelo.removeRow(linha);
			limparCampos();
			linhaSelecionada = -1;
		}
	}
}

package chatWeb;

import java.util.ArrayList;

public class Sala {
	private String nome;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Mensagem> mensagens;

	public Sala(String nome) {// Cria e Inicializa objetos
		this.nome = nome;
		usuarios  = new ArrayList<Usuario>();
		mensagens = new ArrayList<Mensagem>();
	}

	public void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
		System.out.println("Adicionou usuario.");
	}
	
	public void enviarMSG(Mensagem msg) {
		mensagens.add(msg);
		System.out.println("Enviou Mensagem");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Mensagem> obterMensagens(){
		return mensagens;
	}

}
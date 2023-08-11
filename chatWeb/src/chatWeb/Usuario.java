package chatWeb;

public class Usuario {
	private String nome;
	private String nick;
	private String genero;
	private String email;
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public Usuario() {
		
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
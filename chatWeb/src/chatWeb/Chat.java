package chatWeb;

import java.util.ArrayList;
import java.util.Scanner;

public class Chat {

	public static void main(String[] args) {

		System.out.println("Opções");
		System.out.println("1-Cadastrar Sala");
		System.out.println("2-Enviar Mensagem");
		System.out.println("3-Exibir Conversas da Sala");
		System.out.println("4-Sair");

		int opcao;
		Scanner teclado = new Scanner(System.in);
		Sala sala = null;
		Usuario usuario =null;
		Mensagem msg =null;

		do {
			System.out.println("Qual a opção desejada?");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:// cadastrar sala
				System.out.println("Qual o nome da sala?");
				String nome = teclado.next();

				sala = new Sala(nome);// criei a sala com os dados lidos

				System.out.println("Sala criada !! " + sala.getNome());

				break;
			case 2:
				//Criar uma usuariook
				System.out.println("Qual o nome do usuário?");
				String nomeUsuario = teclado.next();
				usuario = new Usuario(nomeUsuario);		

				//Criar uma mensagem ok
				msg = new Mensagem();
				
				//colocar a usuario na mensagem ok
				msg.setUsuario(usuario);
				
				//Escrever a mensagem
				System.out.println("Qual a mensagem?");
				String texto = teclado.next();
				
				//adiciona o texto a mensagem
				msg.setTexto(texto);

				//enviar a mensagem para sala
				sala.enviarMSG(msg);
				
				
				
				break;
			case 3:// exibir mensagens
				System.out.println("Lista de mensagens da sala");

				if (sala != null) {// se a sala existe
					
					for (Mensagem m : sala.obterMensagens()) {
						System.out.println("Mensagem : " + m.getTexto());
					}	
				}else 
					System.out.println("É preciso criar uma sala primeiro.(Opcao 1)");
				
				break;
			}
			
		} while (opcao > 0 && opcao < 4);

		teclado.close();

	}

}
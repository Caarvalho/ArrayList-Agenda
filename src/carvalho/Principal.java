package carvalho;

import java.util.Scanner;
import carvalho.Contato;
import carvalho.Lista;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		while (true) {

			System.out.println("Bem vindo a agenda.");
			System.out.println("Escolha a sua ação.");
			System.out.println("1 - ADICIONAR NA LISTA.");
			System.out.println("2 - LISTAR A LISTA.");
			System.out.println("3 - DELETAR DA LISTA.");
			System.out.println("4 - CONSULTAR NA LISTA.");
			System.out.println("5 - SAIR.");
			int op = ler.nextInt();
			switch (op) {
			case 1:
				Contato aux = new Contato();
				System.out.println("Insira o nome do contato.");
				aux.nome = ler.next();
				System.out.println("Insira o email do contato.");
				aux.email = ler.next();
				System.out.println("Insira o telefone do contato.");
				aux.telefone = ler.next();
				Lista.inserir_lista(aux);
				break;
			case 2:
				Lista.listar_lista();
				break;
			case 3:
				System.out.println("Qual nome você quer deletar?");
				String a = ler.next();
				Lista.deletar_lista(a);
				break;
			case 4:
				System.out.println("Qual nome você quer consultar?");
				String b = ler.next();
				Lista.consultar_lista(b);
				break;
			case 5:
				System.out.println("Obrigado por me usar, essa frase ficou estranha.");
				System.exit(0);

			}
		}
	}
}
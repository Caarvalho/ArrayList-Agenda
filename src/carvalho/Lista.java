package carvalho;

import java.util.Scanner;
import java.util.ArrayList;
import carvalho.Contato;

 public class Lista {
	private static ArrayList<Contato> contatos = new ArrayList<Contato>();

	public static void inserir_lista(Contato a) {
		contatos.add(a);
		System.out.println("Contato adicionado. ");
	}

	public static void listar_lista() {
		if (contatos.isEmpty())
			System.out.println("Lista vazia.");
		else {
			for (int i = 0; i < (contatos.size()); i++) {
				Contato a = contatos.get(i);
				System.out.println("nome : " + a.nome);
				System.out.println("email : " + a.email);
				System.out.println("telefone : " + a.telefone);
				System.out.println("===============================================");
			}
		}
	}

	public static void deletar_lista(String a) {
		boolean suporte = false;
		if (contatos.isEmpty())
			System.out.println("Lista vazia.");
		else {
			for (int i = 0; i < (contatos.size()); i++) {
				Contato aux = contatos.get(i);
				if ((aux.nome).equals(a)) {
					System.out.println("============================");
					System.out.println("nome: " + aux.nome);
					System.out.println("email: " + aux.email);
					System.out.println("telefone: " + aux.telefone);
					contatos.remove(i);
					System.out.println("Contato deletado.");
					System.out.println("============================");
					suporte = true;
				}
			}
			if (suporte == false)
				System.out.println("Contato não encontrado.");
		}
	}

	public static void consultar_lista(String a) {
		boolean suporte = false;
		if (contatos.isEmpty())
			System.out.println("Lista vazia.");
		else {
			for (int i = 0; i < (contatos.size()); i++) {
				Contato aux = contatos.get(i);
				if ((aux.nome).equals(a)) {
					System.out.println("============================");
					System.out.println("nome = " + aux.nome);
					System.out.println("email = " + aux.email);
					System.out.println("telefone = " + aux.telefone);
					System.out.println("============================");
					suporte = true;
				}

			}

			if (suporte == false)
				System.out.println("Contato não encontrado");
		}

	}
}

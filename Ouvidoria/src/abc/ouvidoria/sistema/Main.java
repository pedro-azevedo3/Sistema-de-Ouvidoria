package abc.ouvidoria.sistema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
		
		Manifestacao m = new Manifestacao(001,"Esta faltando papel nos banheiros","Esta faltando papel higienico no banheiro masculino","Reclamacao","Aberta");
		
		Conta c = new Conta("Pedro","pedroazte","pedro","pedro123");
		
		System.out.println("Esta e a sua manifestacao: ");
		System.out.println(m);
		System.out.println("Requerente: ");
		System.out.println(c);
	}
}

//  Teste com um main que, cria ao menos 3 usuários e cada um dos usuários com ao menos 10 manifestações (faltando)
package abc.ouvidoria.sistema;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
		
		Manifestacao m1 = new Manifestacao(1,"Esta faltando papel nos banheiros","Esta faltando papel higienico no banheiro masculino","Reclamacao","Aberta");
		Manifestacao m2 = new Manifestacao(2,"Tem uma rachadura no teto da sala de Odonto!","Existe uma rachadura no teto da sala de odontologia que está pingando em cima da maca!","Reclamacao","Aberta");
		Manifestacao m3 = new Manifestacao(3,"Pouca agilidade nas catracas","Ontem passei mais de 20 minutos para ser liberado nas catracas tanto na entrada quanto na saída...","Reclamacao","Aberta");
		Manifestacao m4 = new Manifestacao(4,"Boa limpeza do corredor de arquitetura!","Ontem a noite alguns alunos sujaram o corredor e com isso ele ficou muito sujo, hoje ele esta limpo como perolas","Elogio","Fechado");
		Manifestacao m5 = new Manifestacao(5,"Seria interessante ter mais filtros d'agua nos corredores","As vezes quando estou com cede tenho que andar até o final do corredor para beber agua :/","Sujestão","Em andamento");
		Manifestacao m6 = new Manifestacao(6,"Mesas quebradas no foodpark","Temos 6 mesas quebradas e inutilizaveis no foodpark","Reclamacao","Aberta");
		Manifestacao m7 = new Manifestacao(7,"Estamos sem internet na ala de Engenharia Civil","Wi-fi está sem funcionar na sala 45 de Engenharia Civil","Reclamacao","Aberta");
		Manifestacao m8 = new Manifestacao(8,"Update no software das catracas","Vi na internet que as nossas catracas podem ser atualizadas para liberar os estudantes mais rapido, voces deveriam ir atras dessa atualizacao","Sujestao","Em andamento");
		Manifestacao m9 = new Manifestacao(9,"Urinaram na parede do banheiro feminino","O cheiro de urina está muito forte no banheiro!","Reclamacao","Resolvido");
		Manifestacao m10 = new Manifestacao(10,"Boa disposição de lixeiras no lado de fora da faculdade","Queria elogiar a grande quantidade de lixeiras no ambiente de fora da faculdade, oque nos ajuda a manter o ambiente limpo!","Elogio","Fechado");
		
		Conta c1 = new Conta("Pedro","pedroazte","pedro","pedro123");
		Conta c2 = new Conta("Daniel","danielabella","abella34","abella123");
		Conta c3 = new Conta("Guilherme","guilhermeazte","guilherme120","guilherme123");
		
		System.out.println("Esta e a sua manifestacao: ");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		System.out.println(m7);
		System.out.println(m8);
		System.out.println(m9);
		System.out.println(m10);
		
		
		System.out.println("Requerente: ");
		System.out.println(c1);
	}
}

//  Pela falta de conhecimento em Funções de Listas, o programa não ficou totalmentefuncional

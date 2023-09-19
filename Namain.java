package vendaCachorroquente;

import java.util.Scanner;

public class Namain {

	static Scanner leitor = new Scanner(System.in);
	public static Aluno novoAluno() {
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		System.out.println("Digite sua matricula: ");
		int matricula = leitor.nextInt();
		leitor.nextLine();
		return new Aluno(nome, matricula);
	}
	public static boolean EscolherAdicional(String complemento) {
		
		System.out.println("Voce deseja adicionar " + complemento + "? Reponda com s ou n");
		String resposta;
		do {
			resposta = leitor.nextLine().toLowerCase();
		}while(!resposta.equals("s")&& !resposta.equals("n"));
		return resposta.equals("s");
	}
	public static Adicionais Adicional() {
		boolean maionese = EscolherAdicional("maionese");
		boolean ketchup = EscolherAdicional("ketchup");
		boolean batatafrita = EscolherAdicional("batata frita");
		boolean ovo = EscolherAdicional("ovo");
		return new Adicionais(null, maionese,ketchup, batatafrita, ovo);
		
	}
	
	public static CachorroQuente novoCachorroQuente() {
		System.out.println("Qual proteina voce deseja: Salsicha, Linguiça, Frango, Bacon");
		String proteina = leitor.nextLine();
		System.out.println("Qual queijo voce deseja: Mussarela, Prato, Parmesão, Coalho");
		String queijo = leitor.nextLine();
		System.out.println("Qual a bebida que voce deseja: Coca cola, Suco do chaves, Del Rio");
		String bebida = leitor.nextLine();
	return new CachorroQuente(proteina, queijo,bebida);
	}
	public static void comandaPedido(Pedido pedido) {
		System.out.println("Nome: "+ pedido.getAluno().getNome());
		System.out.println("matricula: "+pedido.getAluno().getMatricula());
		
		for(int i = 0; i < pedido.getCachorroQuente().length;i++) {
		System.out.println("\nCachorro Quente numero: "+(i+1));
		System.out.println("Proteina "+ pedido.getCachorroQuente()[i].getProteina());
		System.out.println("Queijo"+ pedido.getCachorroQuente()[i].getQueijo());
		System.out.println("Bebida: "+ pedido.getCachorroQuente()[i].getBebida());
		}
		System.out.println("Agora os complementos: ");
		if(pedido.getAdicional().isMaionese()) {
			System.out.println("Maionese; ");
		}if(pedido.getAdicional().isKetchup()) {
			System.out.println("Ketchup");
		}if(pedido.getAdicional().isOvo()) {
			System.out.println("Ovo; ");
		}if(pedido.getAdicional().isBatatafrita()) {
			System.out.println("Batata Frita");
		}
	}
	public static void main(String[] args) {
		Aluno aluno = novoAluno();
		System.out.println("Quantos cachorros quentes deseja comprar? ");
		int quantidade = leitor.nextInt();
		leitor.nextLine();
		CachorroQuente CachorroQuente[] = new CachorroQuente[quantidade];
		for(int i = 0; i < quantidade; i++) {
			CachorroQuente[i] = novoCachorroQuente();
		}
		Adicionais Adicionais = Adicional();
		Pedido pedido = new Pedido(aluno,CachorroQuente,Adicionais);
	comandaPedido(pedido);
	}
}
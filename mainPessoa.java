import java.util.Scanner;

public class mainPessoa {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String nome;
		int idade;
		double altura;
		
		System.out.print("Qual é o seu nome: ");
			nome = in.next();
			
		System.out.print("Qual ano você nasceu? ");
			idade = in.nextInt();
			
		System.out.print("Qual sua altura ");
			altura = in.nextDouble();
			
		System.out.println("");
		
		Pessoa Pessoa = new Pessoa(nome, idade, altura);
		Pessoa.calcIdade(idade);
		
		Pessoa.apresentarPessoa();
		
		

	}

}

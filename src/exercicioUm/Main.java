package exercicioUm;

/**
* Classe principal dos exercicios da Aula 1 de Metodos
*/


public class Main {

	public static void main(String[] args) {
												
	//Calculadora
	System.out.println("Exercicio Calculadora");
	Calculadora.soma(3, 6);
	Calculadora.subtracao(9, 1.8);
	Calculadora.multiplicacao(7, 8);
	Calculadora.divisao(5, 2.5);
				
	//Mensagens

	System.out.println("Exercicio mensagem");
	Mensagem.obterMensagem(9);
	Mensagem.obterMensagem(14);
	Mensagem.obterMensagem(1);
	
	//Emprestimo
	System.out.println("Exercicio empréstimo");
	Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
	Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
	Emprestimo.calcular(1000, 5);
		
	}



}
		
		
		
		

package metodosJava;

public class main {
	
	public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);

        // MensagemDoDia
        System.out.println("Exercício mensagem");
        mensagemDoDia.obterMensagem(9);
        mensagemDoDia.obterMensagem(14);
        mensagemDoDia.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);

    }

}

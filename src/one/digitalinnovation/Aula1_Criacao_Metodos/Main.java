package one.digitalinnovation.Aula1_Criacao_Metodos;

/*
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class Main {

    public static void main(String[] args) {
        
        // Calculadora
        System.out.println("Exercício da Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        
        // Mensagem
        System.out.println("\nExercício da Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        
        
        /* Empréstimo
        System.out.println("Exercício de Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        */
    }
}

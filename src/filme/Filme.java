package filme;

import java.util.Scanner;

public class Filme {

    //Atributos
    String nome;
    String classificacao;
    String genero;
    boolean incluidoNoPlano;
    int duracaoEmMinutos;


        //Metodo imprimir dados do filme.Filme sem retorno void
    public void imprimirDados(){
        //Imprimir todos os dados do filme

        System.out.println("\n***********************\n" + "\n*** Dados do filme.Filme ***");

        System.out.println("\nfilme.Filme: " + nome +
                "\nClassificação: " + classificacao +
                "\nDuração em minutos: " + duracaoEmMinutos + " min" +
                "\nGênero: " + genero +
                "\nIncluido no filme.Filme: " + incluidoNoPlano);
    }
    public void EditarDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n---------------------------\n");
        System.out.println("Digite o nome do filme: ");
        nome = ler.nextLine();
        System.out.println("\n----------------------\n");
        System.out.println("Informe a classificação do filme: ");
        classificacao = ler.nextLine();
        System.out.println("\n----------------------\n");
        System.out.println("Informe o gênero do filme: ");
        genero = ler.nextLine();
        System.out.println("\n----------------------\n");
        System.out.println("O filme está incluso no plano?(true ou false): ");
        incluidoNoPlano = ler.nextBoolean();
        System.out.println("\n----------------------\n");
        System.out.println("Informe a duração do filme: ");
        duracaoEmMinutos = ler.nextInt();
        System.out.println("\n----------------------\n");
    }
}

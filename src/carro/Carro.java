package carro;

import java.util.Scanner;

public class Carro {

    //Criar os atributos da classe carro
    String nome;
    String marca;
    String modelo;
    int ano;

    //Funções da classe carro.Carro, ações do carro

    public void ligarCarro(){
        System.out.println("carro.Carro ligado!!");
    }

    public void imprimirCarro(){
        System.out.println("\nDados do Carro\n" + "\n" + "Nome: " + nome + "\n"
        + "Marca: " + marca + "\n"
        + "Modelo: " + modelo + "\n"
        + "Ano: " + ano);
    }

    public void editarCarro(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n---------------------------\n");
        System.out.println("Digite o nome do carro: ");
        nome = ler.nextLine();
        System.out.println("\n----------------------\n");
        System.out.println("Informe a marca carro: ");
        marca = ler.nextLine();
        System.out.println("\n----------------------\n");
        System.out.println("Informe o modelo do carro: ");
        modelo = ler.nextLine();
        System.out.println("\n----------------------\n");
        System.out.println("Informe o ano do filme: ");
        ano = ler.nextInt();
        System.out.println("\n----------------------\n");
    }
}

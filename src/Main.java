import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero = 10;
        //Tipo nome;
        //criar um objeto filme
        Filme meuFilme = new Filme();
        //Mostra o endereço de memoria do meuFilme
        System.out.println(meuFilme);
        //Atribuindo valores ao meuFilme
        
        //Editar Dados do filme
       meuFilme.EditarDados();

       meuFilme.imprimirDados();
    }
}
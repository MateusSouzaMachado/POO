package geteset.livro;

public class Main {
    public static void main(String[] args) {


        Livro l1 = new Livro();

        l1.setAutor("João");
        l1.setTitulo("Pelotas");
        System.out.println(l1.exibirDetalhes());
    }
}

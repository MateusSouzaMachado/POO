package geteset.produto;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setPreco(500);
        p1.setNome("Manga");
        System.out.println("Preço: " + p1.getPreco());

        p1.aplicarDesconto(30);
        System.out.println("Preço: " + p1.getPreco());
    }
}

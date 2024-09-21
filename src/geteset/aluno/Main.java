package geteset.aluno;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.setNotas(10.0, 9.5, 10.0, 8.7);
        System.out.println("Media: " + a1.calcularMedia(4));

    }
}

package correcao.exerc6prova;

public class Aluno {

    String nome;
    long matricula;
    int nota1;
    int nota2;

    public double calcularMedia(){
        double media;
        media = (nota1 + nota2) / 2;

        return media;
    }
}

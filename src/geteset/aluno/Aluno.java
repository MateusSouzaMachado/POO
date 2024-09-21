package geteset.aluno;

public class Aluno {

    private String nome;
    private double notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double n1, double n2, double n3, double n4) {
        this.notas = n1 + n2 + n3 + n4;
    }

    public double calcularMedia(int veses){
        double media = this.notas / veses;
        return media;
    }
}

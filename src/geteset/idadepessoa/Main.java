package geteset.idadepessoa;

public class Main {

    private String nome;
    private int idade;
    private int MAIORIDADE = 18;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (this.idade >= MAIORIDADE){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você não é mair de idade");
        }
    }
}

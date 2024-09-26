package geteset.livro;

public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String exibirDetalhes(){
        return String.format("Autor: %s \n Titulo: %s",this.autor, this.titulo);
    }
}

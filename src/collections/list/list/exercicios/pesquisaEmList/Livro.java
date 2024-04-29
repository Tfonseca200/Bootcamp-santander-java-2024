package collections.list.list.exercicios.pesquisaEmList;

public class Livro {

    private String titulo;
    private String autor;
    private int anoDePuclicacao;

    public Livro(String titulo, String autor, int anoDePuclicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePuclicacao = anoDePuclicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nome) {
        this.titulo = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePuclicacao() {
        return anoDePuclicacao;
    }

    public void setAnoDePuclicacao(int anoDePuclicacao) {
        this.anoDePuclicacao = anoDePuclicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePuclicacao=" + anoDePuclicacao +
                '}';
    }
}

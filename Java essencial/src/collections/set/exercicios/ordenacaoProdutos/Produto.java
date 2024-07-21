package collections.set.exercicios.ordenacaoProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long idProd;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long idProd, String nome, double preco, int quantidade){
        this.idProd = idProd;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{" +
                "," + idProd +
                "," + nome +
                "," + preco +
                "," + quantidade + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getIdProd() == produto.getIdProd();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdProd());
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(),produto2.getPreco());
    }
}

package collections.set.exercicios.ordenacaoProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos(){
        produtosSet = new HashSet<>();
    }

    public void adicionarContato(int idProd, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(idProd,nome,preco,quantidade));
    }

    // Ordenado produto por nome //
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }


    // Ordenado produto por preço //
    public Set<Produto> exibitPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarContato(1,"produto1", 22.0,5);
        cadastroProdutos.adicionarContato(2,"produto2", 45.0,5);
        cadastroProdutos.adicionarContato(3,"produto3", 10.0,5);
        cadastroProdutos.adicionarContato(4,"produto4", 5.0,5);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibitPorPreco());


    }
}

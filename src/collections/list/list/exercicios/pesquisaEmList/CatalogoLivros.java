package collections.list.list.exercicios.pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,String autor,int anoDePulicacao){

        livroList.add(new Livro(titulo,autor,anoDePulicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }


    public List<Livro> pesquisarPorIntevalosAnos (int anoInicial, int anoFinal){
        List<Livro> livrosPorIntavalosAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro: livroList){
                if (livro.getAnoDePuclicacao() >= anoInicial && livro.getAnoDePuclicacao() <= anoFinal){
                    livrosPorIntavalosAnos.add(livro);
                }
            }
        }

        return livrosPorIntavalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo =  null;
        if(!livroList.isEmpty()){
            for (Livro livro : livroList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1","autor 1",2020);
        catalogoLivros.adicionarLivro("Livro 1","autor 2",2021);
        catalogoLivros.adicionarLivro("Livro 3","autor 3",2022);
        catalogoLivros.adicionarLivro("Livro 4","autor 4",2023);
        catalogoLivros.adicionarLivro("Livro 5","autor 5",1994);
        catalogoLivros.adicionarLivro("Livro 6","autor 6",1892);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 4"));

        System.out.println("---------------------------------------------------------------------\n");

        System.out.println(catalogoLivros.pesquisarPorIntevalosAnos(1900,2020));

        System.out.println(catalogoLivros.pesquisarPorTitulo("LIVRO 1"));
    }
}

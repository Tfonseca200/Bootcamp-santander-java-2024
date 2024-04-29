package collections.list.list.exercicios.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public CarrinhoDeCompras(){

    }

    private List<Item> listaDeItens = new ArrayList<>();

    public void adicionarItem (String nome, double preco, int quantidade){

        listaDeItens.add(new Item(nome,preco,quantidade));

    }

    public void removeItem(String nome){

        List<Item> listaPraRemover = new ArrayList<>();

        for(Item itens : listaDeItens){
            if(itens.getNome().equalsIgnoreCase(nome)) {
                listaPraRemover.add(itens);
            }
        }

        listaDeItens.removeAll(listaPraRemover);
    }

    public double calcularValorTotalDoCarrinho(){

        double valorTotal = 0.0;

        for(Item itensPraCalcular : listaDeItens){

            valorTotal += itensPraCalcular.getPreco() * itensPraCalcular.getQuantidade();
        }

        System.out.println(valorTotal);

        return valorTotal;
    }

    public void exibirItens(){


        for(Item itens : listaDeItens){



            System.out.println("nome: " + itens.getNome());
            System.out.println("preço: " + itens.getPreco());
            System.out.println("quantidade: " + itens.getQuantidade());
            System.out.println("preço total desse item: " + (itens.getPreco()) * itens.getQuantidade());

            System.out.println("====================================================");
        }
    }


}

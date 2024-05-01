package collections.list.exercicios.ordenacao;

import java.util.*;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade,double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }


    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        // usando o metódo sort que implenta o comparable pra ordenar pro idade;
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

        // usando o metódo sort que implemta o comparator pra ordenar pro idade;
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Barac obama",58,1.72);
        ordenacaoPessoa.adicionarPessoa("Thiago",22,1.65);
        ordenacaoPessoa.adicionarPessoa("Curry",30,1.91);
        ordenacaoPessoa.adicionarPessoa("Neymar",31,1.77);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("================================================================");

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }



}





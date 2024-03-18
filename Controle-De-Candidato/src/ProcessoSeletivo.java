public class ProcessoSeletivo {
    public static void main(String[] args) {

        analisarCanditado(1900.0);
        analisarCanditado(2200.0);
        analisarCanditado(2000.0);
        
    }

    static void analisarCanditado (double salarioPrentedido ){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPrentedido){
            System.out.println("LIGAR PARA O CANDITADO");
        }
        else if ( salarioBase == salarioPrentedido){
            System.out.println("LIGAR PARA O CANDITADO COM A CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO OS DEMAIS CANDIDADOS");
        }

    }
}

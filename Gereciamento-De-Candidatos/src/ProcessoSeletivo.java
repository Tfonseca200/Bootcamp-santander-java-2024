import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        String [] candidatos = {"Felipe" , "Eduardo" , "Monica" , "Lais" , "Larissa" };
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
;
        selecaoCanditados();
        
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean contunuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            contunuarTentando =!atendeu;
            if(contunuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

            if(atendeu){
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas");
            }else{
                System.out.println("não conseguimos contato com " + candidato + ", número maximo de tentativas " + tentativasRealizadas);
            }

            System.out.println("================================================================================================");

        }while(contunuarTentando && tentativasRealizadas < 3);

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void selecaoCanditados(){
        String [] candidatos = {"Felipe" , "Eduardo" , "Monica" , "Lais" , "Larissa" , "Raphael" , "Matheus" , "Gustavo" , "Laura" ,"Fernanda" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length ){
            String candidato = candidatos[candidatosAtual];
            double salarioPrentedido = valorPretendido();

            System.out.printf("O canditato " + candidato + " solicicitou este valor de sálario %n " + salarioPrentedido);
            if(salarioBase >= salarioPrentedido){
                System.out.println("O canditato " + candidato + " foi selecionado para a vaga \n" );
                candidatosSelecionados++;
            }
            candidatosAtual++;
            
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
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

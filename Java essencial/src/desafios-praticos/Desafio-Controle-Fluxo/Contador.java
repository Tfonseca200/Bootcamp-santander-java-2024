import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametro_1 = input.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametro_2 = input.nextInt();

        try{
            contar(parametro_1, parametro_2);
        }catch(ExceptionIncorrectParameter e){
            e.printStackTrace();
        }

        input.close();
    }


static void contar(int parametro_1 , int parametro_2) throws ExceptionIncorrectParameter{

    if( parametro_1 > parametro_2){
        throw new ExceptionIncorrectParameter();
    }else{
        int count = parametro_2 - parametro_1;

        for(int i = 1; i <= count; i++){
            System.out.println("Imprimindo numero: " + i);
            
            }
        }

        
    }
}   


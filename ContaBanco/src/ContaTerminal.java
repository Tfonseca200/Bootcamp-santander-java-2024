import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        

        Scanner input = new Scanner (System.in);
        boolean loop = true;

        do{

            System.out.println("Bem, vindo ao banco noroest");
            System.out.println("Deseja criar a conta ? S/N");
            String criaConta = input.nextLine();

            criaConta = criaConta.toUpperCase();
            System.out.println(criaConta);

            switch (criaConta) {
                case "S":
                    

                System.out.println("Digite o numero da conta:");
                int numero = input.nextInt();
                input.nextLine();

                System.out.println("Digite o numero da agencia");
                String agencia = input.nextLine();

                System.out.println("Digite o seu nome: ");
                String nome = input.nextLine();

                System.out.println("digite seu o saldo: ");
                Double saldo = input.nextDouble();

                ContaGeral contaGeral = new ContaGeral(numero, agencia ,nome, saldo);
                contaGeral.criarConta(contaGeral);
             
                break;
            
                case "N":
                    System.out.println("Não criado");
                    loop = false;


                default:
                    break;
            }

           

        }while(loop);

    }
}

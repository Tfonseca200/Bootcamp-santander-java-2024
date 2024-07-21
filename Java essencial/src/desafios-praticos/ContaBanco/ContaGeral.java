public class ContaGeral {
    
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;



    public ContaGeral(){

    }


    public ContaGeral(int numero, String agencia , String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this. nomeCliente = nomeCliente;
        this. saldo = saldo;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getAgencia() {
        return agencia;
    }


    public void setTexto(String agencia) {
        this.agencia = agencia;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    };



    public void criarConta(ContaGeral contaGeral){

        
        int numero = contaGeral.getNumero();
        String agencia = contaGeral.getAgencia();
        String nomeCliente = contaGeral.getNomeCliente();
        double saldo = contaGeral.getSaldo();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
    

} 
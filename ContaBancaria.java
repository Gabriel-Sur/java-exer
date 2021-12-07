public class ContaBancaria {

    String cpf;
    double saldo;
    String nome;
    String agencia = "Sicredi";
    double limiteConta;
    char tipoConta;
    String senha;

    public ContaBancaria(String nome, String cpf, String senha, char tipoConta){
        System.out.println("Criando a conta do(a): " + nome);
        if(tipoConta == 'U'){
            this.limiteConta = 1000;
        } else{
            this.limiteConta = 1000000;
        }
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;

    }
    void mostrarSaldo(){
        if(tipoConta == 'U' && this.saldo > 1000){
            System.out.println(this.nome + " excedeu o limite de sua conta! Para mudar o tipo da conta, contate a agência.");
        }
        else {
            System.out.println(this.nome + " saldo: " + this.saldo);
        }
    }

    void saque(double valor){
        this.saldo = this.saldo - valor;
        if(saldo == 0){
            System.out.println("Seu saldo chegou a 0. Bloqueando serviços!!");
        }
    }

    void debitar(double valor){
        if(this.saldo >= valor){
            double valorSaldo = this.saldo - valor;
            this.saldo = valorSaldo;
            if(saldo == 0){
                System.out.println("Seu saldo chegou a 0. Bloqueando serviços!!");
            }
        }
    }
    double creditar(double valor){
        double valorSaldo = this.saldo + valor;
        this.saldo = valorSaldo;
        return this.saldo;
    }
    void tranferencia(ContaBancaria cliente, double valor){
        this.saldo = this.saldo - valor;
        cliente.saldo += valor;
        System.out.println("Transferindo R$=" +valor + "!");
        if(saldo == 0){
            System.out.println("Seu saldo chegou a 0. Bloqueando serviços!!");
        }
    }
    void encerramento(){
        System.out.println("Obrigado! O Banco " + agencia + "agradece.");
    }

}



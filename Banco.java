public class Banco {

    public static void main(String[] args) {
        ContaBancaria Cleiton = new ContaBancaria("Cleiton"," 04058639751"," 123abcadmin",  'U');

        System.out.println(Cleiton.nome + "" + Cleiton.cpf + "" + Cleiton.senha + "");
        Cleiton.tipoConta = 'U';
        Cleiton.saldo = 1000;
        Cleiton.mostrarSaldo();
        Cleiton.debitar(100);
        Cleiton.mostrarSaldo();

        ContaBancaria Reginaldo = new ContaBancaria("Reginaldo", " 04078965253", " 123abcreginaldinho", 'N');

        System.out.println(Reginaldo.nome + "" + Reginaldo.cpf + "" + Reginaldo.senha + "");
        Reginaldo.tipoConta = 'N';
        Reginaldo.saldo = 345000;
        Reginaldo.mostrarSaldo();
        Reginaldo.tranferencia(Cleiton, 10000);

        Cleiton.mostrarSaldo();

        Reginaldo.mostrarSaldo();
        Reginaldo.saque(335000);
        Reginaldo.mostrarSaldo();







    }
}

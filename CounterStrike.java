public class CounterStrike {
    public static void main(String[] args) {
        Player jogador1 = new Player();
        Armas armasj1 = new Armas();

        jogador1.nome = "Pedro";
        jogador1.time = "CT";
        jogador1.dinheiro = 6000;
        jogador1.vida = 100;
        jogador1.vivoMorto = true;
        armasj1.time = "CT";
        armasj1.dinheiro = 6000;
        armasj1.nome = "Pedro";

        Player jogador2 = new Player();
        Armas armasj2 = new Armas();

        armasj2.nome ="Cleiton";
        armasj2.dinheiro = 4800;
        armasj2.time = "TR";
        jogador2.nome = "Cleiton";
        jogador2.time = "TR";
        jogador2.dinheiro = 4800;
        jogador2.vida = 100;
        jogador2.vivoMorto = true;

        System.out.println(armasj1.periodoCompra());

        armasj1.comprarM4a4();
        jogador1.dinheiro = armasj1.dinheiro;
        System.out.println(armasj1.muniçãoM4a4());
        jogador1.comprarFlashbang();
        jogador1.comprarColete2();
        jogador1.comprarDefuseKit();


        armasj2.comprarAwp();
        System.out.println(armasj2.muniçãoAwp());
        System.out.println(jogador2.c4());


        jogador1.jogarFlashbang();

        jogador2.virado = false; // Foi pego desprevinido.
        System.out.println(jogador2.flashbang());
        jogador1.recarregar();
        jogador2.vivoMorto = false;
        System.out.println(jogador2.microfone());

    }

}

public class Player {

    String nome;
    String time;
    int dinheiro;
    int vida;
    boolean virado = true; //se está virado para a flashbang ficará cego...
    boolean vivoMorto = true;
    int defuseKit = 500;
    int colete1 = 600;
    int colete2 = 1000;
    int Flashbang = 200;

    String microfone(){
        if(vivoMorto == false){
            return nome + " morreu! Pode começar a xingar o time!!!!";
        }
        else{
            return "";
        }
    }
    String c4(){
        if(time == "TR"){
            return nome + " possui a C4! Plante-a no Bomb A ou B";
        }
        else{
            return "";
        }
    }
    void jogarFlashbang(){

        System.out.println( nome + ": JOGANDO UMA FLASHBANG!");
    }

    String flashbang(){
        if(virado == false){
            return  nome+ " está cego!";
        }
        else{
            return "";
        }
    }
    void recarregar(){
        System.out.println( nome + ": Atirou, agora está recarregando!");
    }
    void comprarFlashbang(){
        if(dinheiro < Flashbang){
            System.out.println("DINHEIRO INSUFICIENTE!");
        }
        else {
            dinheiro = dinheiro - Flashbang;
            System.out.println( nome + " COMPROU FLASHBANG! DINHEIRO RESTANTE: " + dinheiro);
        }
    }
    void comprarColete1(){
        if(dinheiro < colete1){
            System.out.println("DINHEIRO INSUFICIENTE!");
        }
        else {
            dinheiro = dinheiro - colete1;
            System.out.println( nome + " COMPROU COLETE1! DINHEIRO RESTANTE: " + dinheiro);
        }
    }
    void comprarColete2(){
        if(dinheiro < colete2){
            System.out.println("DINHEIRO INSUFICIENTE!");
        }
        else {
            dinheiro = dinheiro - colete2;
            System.out.println( nome + " COMPROU COLETE2! DINHEIRO RESTANTE: " + dinheiro);
        }
    }
    void comprarDefuseKit(){
        if(time == "CT"){
            if(dinheiro < defuseKit){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - defuseKit;
                System.out.println( nome + " COMPROU DEFUSE KIT! DINHEIRO RESTANTE: " + dinheiro);
            }

        }else{
            System.out.println("APENAS CT PODDEM COMRPAR DEFUSE KIT");
        }
    }








}

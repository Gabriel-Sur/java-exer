public class Armas {
    String nome;
    String time;
    int dinheiro;
    int ak47 = 2700; // somente terroristas
    int awp = 4700;
    int ssg = 1700;
    int galil = 2000; // somente terroristas
    int m4a4 = 3100; // somente ct
    int g3sg1 = 5000; // somente terroristas
    int sg553 = 3300; // somente terroristas
    int famas = 2000; // somente ct
    int aug = 3300; // somente ct
    int scar20 = 5000; // somente ct



    void comprarAk47(){
        if(time == "TR") {
            if(dinheiro < ak47){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - ak47;
                System.out.println( nome +" COMPROU AK47! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE TERRORISTAS PODEM COMPRAR AK47!");
        }
    }
    void comprarGalil(){
        if(time == "TR") {
            if(dinheiro < galil){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - galil;
                System.out.println( nome +" COMPROU GALIL AR! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE TERRORISTAS PODEM COMPRAR GALIL AR!");
        }
    }
    void comprarSg553(){
        if(time == "TR") {
            if(dinheiro < sg553){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - sg553;
                System.out.println( nome + " COMPROU SG553! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE TERRORISTAS PODEM COMPRAR SG553!");
        }
    }

    void comprarG3sg1(){
        if(time == "TR") {
            if(dinheiro < g3sg1){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - g3sg1;
                System.out.println( nome + " COMPROU G3SG1! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE TERRORISTAS PODEM COMPRAR G3SG1!");
        }
    }
    void comprarM4a4(){
        if(time == "CT") {
            if(dinheiro < m4a4){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - m4a4;
                System.out.println( nome + " COMPROU M4A4! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE CONTRA TERRORISTAS PODEM COMPRAR M4A4!");
        }
    }
    void comprarFamas(){
        if(time == "CT") {
            if(dinheiro < famas){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - famas;
                System.out.println( nome + " COMPROU FAMAS! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE CONTRA TERRORISTAS PODEM COMPRAR FAMAS!");
        }
    }
    void comprarAug(){
        if(time == "CT") {
            if(dinheiro < aug){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - aug;
                System.out.println(nome + " COMPROU AUG! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE CONTRA TERRORISTAS PODEM COMPRAR AUG!");
        }
    }
    void comprarScar20(){
        if(time == "CT") {
            if(dinheiro < scar20){
                System.out.println("DINHEIRO INSUFICIENTE!");
            }
            else {
                dinheiro = dinheiro - scar20;
                System.out.println(nome + " COMPROU SCAR 20! DINHEIRO RESTANTE: " + dinheiro);
            }
        }
        else{
            System.out.println("SOMENTE CONTRA TERRORISTAS PODEM COMPRAR SCAR 20!");
        }
    }

    void comprarSsg(){
        if(dinheiro < ssg){
            System.out.println("DINHEIRO INSUFICIENTE!");
        }
        else {
            dinheiro = dinheiro - ssg;
            System.out.println( nome + " COMPROU SSG! DINHEIRO RESTANTE: " + dinheiro);
        }
    }
    void comprarAwp(){
        if(dinheiro < awp){
            System.out.println("DINHEIRO INSUFICIENTE!");
        }
        else {
            dinheiro = dinheiro - awp;
            System.out.println( nome + " COMPROU AWP! DINHEIRO RESTANTE: " + dinheiro);
        }
    }
    String muniçãoM4a4(){
        return "30 balas + 3 pentes.";
    }
    String muniçãoAwp(){
        return "10 balas + 3 pentes.";
    }

    String periodoCompra(){
        return "APENAS MAIS 40 SEGUNDOS PARA PODER COMPRAR SEUS ITENS!";
    }

}

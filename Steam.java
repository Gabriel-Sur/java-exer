public class Steam {
    public static void main(String[] args) {
        Usuario gabriel = new Usuario("Gabriel", 18);
        Usuario fernando = new Usuario("Fernando", 25);
        Usuario marco = new Usuario("Marco", 22);


        Usuario usuarios[] = new Usuario[3];
        usuarios[0] = fernando;
        usuarios[1] = gabriel;
        usuarios[2] = marco;

       Marcador zumbi = new Marcador("Zumbi");
        Marcador terror = new Marcador("Terror");
        Marcador fps = new Marcador("FPS");
        Marcador sobrevivência = new Marcador("Sobrevivência");
        Marcador indie = new Marcador("Indie");

        Distribuidora capcom = new Distribuidora("Capcom","10/10/1010", "0001" );
        Distribuidora iceberg = new Distribuidora("Iceberg", "10/10/1010", "0001");

        Desenvolvedora zoetrope = new Desenvolvedora("Zoetrope", "5/5/5", "2002");
        Desenvolvedora cyanide = new Desenvolvedora("Cyanide", "6/6/6", "2003");

        Jogo callOf = new Jogo("Call Of Cuthullu", "jOGO MTO DOIDO", 100, terror, zoetrope, iceberg, 18, 2015);
        Jogo re2 = new Jogo("Resident Evil 2", "Remake mto foda", 200, zumbi, zoetrope, capcom, 18, 2019);

        Jogo jogos[] = new Jogo[2];
        jogos[0] = callOf;
        jogos[1] = re2;

        for (Jogo jogo : jogos){
            if(jogo.getMarcador().getNome()  == "Terror"){
                System.out.println("Terror: " + jogo.getNome());

            }
        }

        Desejos gtav = new Desejos("Fly simulator", zoetrope, iceberg,80, 18);
    }
}

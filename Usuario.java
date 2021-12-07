public class Usuario {

    private String nome;
    private String sobrenome;
    private int idade;
    private int level = 0;

    public Usuario(String nome, int idade){
    this.nome = nome;
   // setNome(nome);
    }


    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

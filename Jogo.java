public class Jogo {

    private String nome;
    private String descricao;
    private double valor;
    private Marcador marcador;
    private Desenvolvedora desenvolvedora;
    private Distribuidora distribuidora;
    private int idadeMinima;
    private int anoLancamento;

    public Jogo(String nome, String descricao, double valor, Marcador marcador, Desenvolvedora desenvolvedora, Distribuidora distribuidora, int idadeMinima, int anoLancamento){
        this.nome = nome;
        this. descricao = descricao;
        this.valor = valor;
        this.marcador = marcador;
        this.desenvolvedora = desenvolvedora;
        this.distribuidora = distribuidora;
        this.idadeMinima = idadeMinima;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Marcador getMarcador() {
        return marcador;
    }

    public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }

    public Desenvolvedora getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(Desenvolvedora desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}

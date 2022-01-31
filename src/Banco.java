public abstract class Banco {
    private static int SEQUENCIAL = 1;
    private String nome;
    private int numeroBanco;


    public Banco(String nome) {
        this.nome = nome;
        this.numeroBanco = SEQUENCIAL++;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    @Override
    public String toString() {
        return "*** Informações do Banco ***" + '\n' +
                "Nome = " + nome + '\n' +
                "Numero do Banco = " + numeroBanco;
    }
}

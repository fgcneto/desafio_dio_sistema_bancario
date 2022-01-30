public class AgenciaBancaria extends Banco{

    protected static int SEQUENCIAL_AGENCIA = 0001;
    protected int numeroAgencia;
    private String bairroAgencia;

    public AgenciaBancaria(String nome, String bairroAgencia) {
        super(nome);
        this.bairroAgencia = bairroAgencia;
        this.numeroAgencia = SEQUENCIAL_AGENCIA++;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getBairroAgencia() {
        return bairroAgencia;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "*** Informações da Agência ***" + '\n' +
                "Agência - Número = " + numeroAgencia + '\n' +
                "Bairro = " + bairroAgencia + '\'';
    }
}

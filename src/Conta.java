public abstract class Conta implements InterfaceConta{
    protected int numero;
    protected double saldo;
    private int SEQUENCIAL_CONTA = 1;
    protected Banco AgenciaBancaria;

    public Conta(double saldo, Banco agenciaBancaria) {
        this.numero = SEQUENCIAL_CONTA++;
        this.saldo = saldo;
        AgenciaBancaria = agenciaBancaria;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Banco getAgenciaBancaria() {
        return AgenciaBancaria;
    }

}

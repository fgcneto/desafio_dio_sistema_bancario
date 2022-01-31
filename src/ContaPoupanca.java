public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo, Banco agenciaBancaria) {
        super(saldo, agenciaBancaria);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", AgenciaBancaria=" + AgenciaBancaria +
                "} " + super.toString();
    }
}

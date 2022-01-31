public class ContaCorrente extends Conta {

    protected double chequeEspecial;

    public ContaCorrente(double saldo, Banco agenciaBancaria) {
        super(saldo, agenciaBancaria);
        this.chequeEspecial = 1200;
    }

    @Override
    public String toString() {
        return "*** Informações - ContaCorrente ***" + '\n' +
                "Número = " + numero + '\n' +
                "Saldo = " + saldo + '\n' +
                AgenciaBancaria + '\n' +
                "Limite - Cheque Especial = " + chequeEspecial + '\n' +
                "**************" + '\n';
    }
}

public class main {
    public static void main(String[] args) {
        Banco agencia = new AgenciaBancaria("Banco do Brasil", "Lagoa Nova");
        Conta cc = new ContaCorrente(1000, agencia);
        System.out.println(cc);
        Conta cp = new ContaPoupanca(100, agencia);
        System.out.println("Informações iniciais da conta Poupança");

        cc.depositar(200);
        System.out.println("Depois do deposito: "+ '\n' + cc);
        cc.sacar(300);
        System.out.println("Depois do saque: "+ '\n' + cc);
        cc.transferir(400, cp);
        System.out.println("Conta Poupança depois do deposito" + cp);
    }
}

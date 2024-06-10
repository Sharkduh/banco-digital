public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc1 = new ContaCorrente("123", "Alice");
        ContaPoupanca cp1 = new ContaPoupanca("456", "Bob");

        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);

        cc1.depositar(500);
        cp1.depositar(1000);

        cc1.sacar(200);
        
        banco.transferir("123", "456", 100);
        
        cc1.sacar(500);
    }
}

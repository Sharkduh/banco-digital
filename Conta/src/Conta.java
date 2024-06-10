class Conta {
    protected String numero;
    protected double saldo;
    protected String titular;

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado na conta de " + titular + ". Saldo atual: " + saldo);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta de " + titular + ". Saldo atual: " + saldo);
            return true;
        } else {
            System.out.println("Saque de " + valor + " falhou na conta de " + titular + ". Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada da conta de " + this.titular + " para a conta de " + destino.titular);
            return true;
        } else {
            System.out.println("Transferência de " + valor + " falhou da conta de " + this.titular + " para a conta de " + destino.titular);
            return false;
        }
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

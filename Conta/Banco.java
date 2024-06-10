import java.util.ArrayList;
import java.util.List;

class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada: " + conta.getTitular());
    }

    public Conta buscarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public boolean transferir(String numeroOrigem, String numeroDestino, double valor) {
        Conta contaOrigem = buscarConta(numeroOrigem);
        Conta contaDestino = buscarConta(numeroDestino);

        if (contaOrigem != null && contaDestino != null) {
            return contaOrigem.transferir(contaDestino, valor);
        }
        System.out.println("Transferência falhou. Conta não encontrada.");
        return false;
    }
}

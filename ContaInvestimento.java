public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;
    public ContaInvestimento (double taxa, int prazo) {
        this.taxa = taxa ;
        this.prazo = prazo ;
    }
    public boolean sacar(double valor) {
        if (this.taxa >= valor) {
            this.taxa = this.taxa - valor;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (this.taxa >= 0) {
            this.taxa = this.taxa + valor;
            return true;
        }
        else {
            return false;
        }
    }

    public void aplicaRendimentos(double taxa) {
        setSaldo(getSaldo() + (1 * taxa));
    }
}

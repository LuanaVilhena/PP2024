public class ContaInvestimento extends Conta {
    double taxa;
    int prazo;
    boolean sacar(double valor) {
        if (this.taxa >= valor) {
            this.taxa = this.taxa - valor;
            return true;
        }
        else {
            return false;
        }
    }

    boolean depositar(double valor) {
        if (this.taxa >= 0) {
            this.taxa = this.taxa + valor;
            return true;
        }
        else {
            return false;
        }
    }

    public void aplicaRendimentos(double taxa) {
        if (this.taxa >= 0) {
            this.taxa = this.taxa * taxa;
        }
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}

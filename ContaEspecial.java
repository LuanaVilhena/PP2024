public class ContaEspecial extends Conta{
    double limite;
    boolean sacarEspecial(double valor) {
        if (this.limite >= valor) {
            this.limite = this.limite + valor;
            return true;
        }
        else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

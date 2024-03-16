public class Conta {
    int numero;
    double saldo;
    boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = valor - this.saldo;
            return true;
        }
        else {
            return false;}
    }
    boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo = this.saldo + valor;
            return true;
        }
        else {
            return false;}
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

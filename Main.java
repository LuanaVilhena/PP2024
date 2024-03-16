public class Main {

    public static void main(String[] args) {

        Conta c = new Conta();
        Conta c2 = new ContaEspecial();
        Conta c3 = new ContaInvestimento();

        c.numero = 1;
        c.saldo = 10000;

        c2.numero = 2;
        c2.saldo = 50000;

        c3.numero = 3;
        c3.saldo = 30000;

        System.out.println("Número da conta 1: " + c.numero);
        System.out.println("Saldo da conta 1: " + c.saldo);
        System.out.println("Número da conta especial: " + c2.numero);
        System.out.println("Saldo da conta especial: " + c2.saldo);
        System.out.println("Número da conta investimento: " + c3.numero);
        System.out.println("Saldo da conta investimento: " + c3.saldo);

    }
}

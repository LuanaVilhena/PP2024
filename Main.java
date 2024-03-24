public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta contaespecial = new Conta();
        Conta containvestimento = new Conta();
        conta1.setNumero(1000);
        conta1.setSaldo(1000);
        conta1.depositar(1000);
        conta2.setNumero(2000);
        conta2.setSaldo(5000);
        conta2.depositar(2000);
        contaespecial.setNumero(3000);
        contaespecial.setSaldo(3000);
        contaespecial.depositar(3000);
        containvestimento.setNumero(4000);
        containvestimento.setSaldo(4000);
        containvestimento.depositar(4000);

        System.out.println("Numero da conta 1:" + conta1.getNumero());
        System.out.println("Saldo do saldo 1:" + conta1.getSaldo());
        System.out.println("Numero da conta 2:" + conta2.getNumero());
        System.out.println("Saldo do saldo 2:" + conta2.getSaldo());
        System.out.println("Numero da contaEspecial:" + contaespecial.getNumero());
        System.out.println("Saldo da contaEspecial:" + contaespecial.getSaldo());
        System.out.println("Numero da contaInvestimento:" + containvestimento.getNumero());
        System.out.println("Saldo da contaInvestimento:" + containvestimento.getSaldo());
    }
}

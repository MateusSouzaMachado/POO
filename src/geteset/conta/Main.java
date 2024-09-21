package geteset.conta;

public class Main {
    public static void main(String[] args) {


        Conta c1 = new Conta();
        c1.setSaldo(300);
        c1.sacar(100);
        System.out.println("Saldo = " + c1.getSaldo());


    }
}

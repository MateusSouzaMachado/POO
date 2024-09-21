package geteset.conta;

public class Conta {
    private double saldo;
    private int numeroConta;
    public String titular;

    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public double getSaldo(){
        return this.saldo;

    }

    public void sacar(double valor) {
        if (valor < this.saldo){
           this.saldo = this.saldo - valor;

        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}

package entities;

public class ContaBancaria {

//    ATRIBUTOS
    private int numeroDaConta;
    private String nomeUsuario;
    private double saldo;

//    CONSTRUTORES
    public ContaBancaria(int numeroDaConta, String nomeUsuario, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeUsuario = nomeUsuario;
        deposito(saldo);
    }
    public ContaBancaria(int numeroDaConta, String nomeUsuario) {
        this.numeroDaConta = numeroDaConta;
        this.nomeUsuario = nomeUsuario;
    }

//    GETTERS AND SETTERS
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }


//    METODOS
    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 5.00;
    }


//    TO STRING
    @Override
    public String toString() {
        return "Account " + numeroDaConta +
                ", Holder: " + nomeUsuario + ", Balance: $" + String.format("%.2f%n", saldo);
    }
}

package Conta;

public abstract class Conta {
	private String numeroDaConta;
	private String titular;
	private double saldo;
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(String numeroDaConta, String titular, double saldo) {
		//optei pela possibilidade de iniciar a conta com valor inicial
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void transferir(Conta conta, double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	public void depositar(double valor) {
		setSaldo(getSaldo()+valor);
	}
	
	public void sacar(double valor) {
		setSaldo(getSaldo()-valor);
		//recurso de conta negativada
	}
	

}

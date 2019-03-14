package Conta;

public class ContaCorrente extends Conta {
	private double limiteChequeEspecial;
	private static double taxaDeJurosDoChequeEspecial;
	
	public ContaCorrente(String numeroDaConta, String titular, double saldo, double limiteChequeEspecial, double taxaDeJurosDoChequeEspecial) {
		super(numeroDaConta, titular, saldo);
		setLimiteChequeEspecial((limiteChequeEspecial));
		setTaxaDeJurosDoChequeEspecial(taxaDeJurosDoChequeEspecial);
		// TODO Auto-generated constructor stub
	}
	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public double getTaxaDeJurosDoChequeEspecial() {
		return taxaDeJurosDoChequeEspecial;
	}

	public void setTaxaDeJurosDoChequeEspecial(double taxaDeJurosDoChequeEspecial) {
		this.taxaDeJurosDoChequeEspecial = taxaDeJurosDoChequeEspecial;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		if(getLimiteChequeEspecial()*-1 < getSaldo() - (valor*1.01)){
			super.sacar(valor*1.01);
		}else {
			System.out.println("Voce não pode sacar esse valor pois ultrapassará o limite do cheque especial.");
		}
	}
	
	public void debitarJuros() {
		double total = (getSaldo()*-1) * getTaxaDeJurosDoChequeEspecial();
		super.sacar(total);
	}
    
	    @Override
    public void transferir(Conta conta, double valor) {
		// TODO Auto-generated method stub
	    if(getLimiteChequeEspecial()*-1 < getSaldo() - (valor*1.01)){
			conta.setSaldo(conta.getSaldo()+valor);
		    this.setSaldo(this.getSaldo()-valor);
		}else {
			System.out.println("Voce não pode sacar esse valor pois ultrapassará o limite do cheque especial.");
		}	
	}

}

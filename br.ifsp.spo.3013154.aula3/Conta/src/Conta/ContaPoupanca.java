package Conta;

public class ContaPoupanca extends Conta {
	private static double taxaRendimento;

	public static double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}
	
	public ContaPoupanca(String numeroDaConta, String titular, double saldo,double taxaRendimento) {
		super(numeroDaConta, titular, saldo);
		setTaxaRendimento(taxaRendimento);
		// TODO Auto-generated constructor stub
	}

	public void aplicarRendimento() {
		setSaldo(getSaldo() * getTaxaRendimento());
	}

	@Override
	public void transferir(Conta conta, double valor) {
		// TODO Auto-generated method stub
		super.transferir(conta, valor);
	}

}

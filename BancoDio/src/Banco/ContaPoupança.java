package Banco;

public class ContaPoupanša {
	
	public void ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanša ===");
		super.imprimirInfosComuns();
	}

}

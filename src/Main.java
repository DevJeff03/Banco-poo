
public class Main {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		cl1.setNome("Cliente1");
		Cliente cl2 = new Cliente();
		cl2.setNome("Cliente2");
		Conta cc = new ContaCorrente(cl1);
		Conta cp = new ContaPoupanca(cl2);
		cc.depositar(100);
		cc.transferir(125, cp);

		cc.imprimirExtrato();
		System.out.println();
		cp.imprimirExtrato();
		
	}
}

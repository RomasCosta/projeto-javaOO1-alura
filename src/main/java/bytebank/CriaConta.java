package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		//primeira inst�ncia do objeto conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		//segunda inst�ncia do objeto conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println(segundaConta.saldo);
		
		

	}

}

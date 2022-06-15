package bytebank;

public class testaMetodo {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		conta1.deposita(50);
		System.out.println(conta1.saldo);
		
		conta1.saca(20);
		System.out.println(conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		conta2.transfere(300, conta1);
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo);
		
		conta1.titular = "romario";
		System.out.println(conta1.titular);

	}

}

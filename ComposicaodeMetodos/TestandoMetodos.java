package ComposicaodeMetodos;

import java.util.Scanner;

public class TestandoMetodos {
	
	private static Scanner dados;

	public static void main(String[] arg) {
		
		dados = new Scanner (System.in);
		
		Clientes clientes = new Clientes();
		Contas contas = new Contas();
		Contas contas2 = new Contas();
		
		double deposito=0; 
		double saque=0; double transferir=0;
		String Nome=""; String cpf ="";
		String profissao="";
						
		contas.titular = clientes;
		
		System.out.println("Nome: ");
		Nome = dados.nextLine();
		clientes.nome = Nome;
				
		System.out.println("CPF: ");
		cpf = dados.next();
		clientes.cpf= cpf;
		
		System.out.println("Profissao: ");
		profissao= dados.next();
		clientes.Profissao=profissao;
		
		contas.saldo+=(100);
		
		System.out.println("Efetua o valor de um deposito:");
		deposito = dados.nextDouble();
		contas.deposito(deposito);
		
		System.out.println("Seu Saldo Atual é de: R$"+contas.saldo);
		
		System.out.println("Agora saque um valor: ");
		saque = dados.nextDouble();
		contas.saque(saque);
		
		System.out.println("Seu Saldo Atual é de: R$"+contas.saldo);
		
		System.out.println("Fassa uma trasnferencia: ");
		transferir = dados.nextDouble();
		
		contas.transferir(transferir, contas2);
		
		System.out.println("Seu Saldo Atual é de: R$"+contas.saldo);
		System.out.println("Seu Saldo Atual da conta destinataria é de: R$"+contas2.saldo);
		
		
		
		
		
	}

}

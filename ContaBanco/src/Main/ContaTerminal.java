package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Banco;

public class ContaTerminal {
	public static void main(String[] args) {
		List<Banco> banco = new ArrayList<>();
		Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
		for (int i = 0; i < 3; i++) {
			Banco p1 = new Banco();

			System.out.println("Qual numero do banco?");
			p1.setNumero(scanner.nextInt());

			System.out.println("Qual o nome do cliente?");
			p1.setNomeCliente(scanner.next());

			System.out.println("Qual a agencia do Banco? ");
			p1.setAgencia(scanner.next());

			System.out.println("Qual o saldo da conta?");
			p1.setSaldo(scanner.nextDouble());
			
			banco.add(p1);

	      if(i!=2) {
	    	  System.out.println("próximo cadastro");
	      }
	      else {
	    	  System.out.println("Cadastro Concluido");
	      }
		}
		if(!banco.isEmpty()) {
		  for(Banco bancos : banco){
				System.out.println("Olá " + bancos.getNomeCliente() +", obrigado por criar uma conta "
						+ "em nosso banco, sua agência é "
						+ bancos.getAgencia() + ", conta " + bancos.getNumero() + " e seu saldo "
						+ bancos.getSaldo() + " já está disponível para saque");
		   }
		} else {
		    System.out.println("Dados no banco vazio.");
		}
	}
 
}

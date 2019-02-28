import java.util.Date;
import java.util.Scanner;

public class BankAccount {
	
		int balance;
		int previousTransaction;
		String customerName;
		String customerId;
		Password usuario;
		
		Date myDate = new Date();
		
		BankAccount(String cname,String cid)
		{
			customerName = cname;
			customerId = cid;
		}
			
		void deposit(int amount) {
			if(amount !=0) {
				balance = balance + amount;
				previousTransaction = amount;
				
			}
		}
		void withdraw(int amount) {
			if(amount !=0) {
				balance = balance - amount;
				previousTransaction = -amount;
			}
		}
		void getPreviousTransaction() {
			if(previousTransaction > 0) {
				System.out.println("Despositado: "+previousTransaction);
			}
			else if(previousTransaction < 0){	
			}
			else 
			{
				System.out.println("No se Puede Procesar esta Transaccion");
			}
		}
		void showMenu() {
			
			char option = '\0';
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Fecha de Hoy: "+ myDate);
			System.out.println("\nBienvenido a el Banco XYZ");
			System.out.println("Tu ID es "+usuario.usuario);
			System.out.println("\n");
			System.out.println("A. Ver Estado de Cuenta");
			System.out.println("B. Depositar");
			System.out.println("C. Retiro");
			System.out.println("D. Transacción Anterior");
			System.out.println("E. Salir");
			
			do {
				System.out.println("\n=============================================================================================================================");
				System.out.println("Seleccione su Opcion");
				System.out.println("\n=============================================================================================================================");
				option = scanner.next().charAt(0);
				System.out.println("\n");
				
				switch(option) {
				
				case 'A':
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Estado = "+balance);
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					break;
					
				case 'B':
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Recuerde que Valor minimo a Depositar es 1500$");
					System.out.println("Valor a Depositar? : ");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
				case 'C':
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Valor a retirar: ");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					getPreviousTransaction();
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					break;
				case 'E':
					System.out.println("**********************************************************************************************************************************");
					System.exit(0);
					break;
					
				default:
					System.out.println("Opcion Invalida!!.Porfavor Intente Nuevamente");
					break;
					
				}
			}while(option != 'E');
			
			System.out.println("Gracias por Preferirnos");
			System.out.println("La Fecha de Hoy es: "+ myDate);
}
		
}
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Password {
	
	BankAccount obj2 = new BankAccount("XYZ", "BA0001");
	CrearArchivo obj3 = new CrearArchivo ();
	
	
	String usuario;
	String usuario2;
	String contra;
	String contra2;
	Date myDate = new Date();
	Scanner teclado = new Scanner(System.in);
	
	void Menu1(String c1name, String c1pass, String c2name, String c2pass) {
		
		usuario = c1name;
		usuario2 = c2name;
		contra = c1pass;
		contra2 = c2pass;
		
		
		char option = '\1';
		Scanner scanner = new Scanner (System.in);
		System.out.println("Bienvenidos a el Banco XYZ");
		System.out.println("Z. Crear ID");
		System.out.println("X. Ingresar ID");
		System.out.println("F. Salir");
		do {
			System.out.println("\n=============================================================================================================================");
			System.out.println("Seleccione su Opcion");
			option = scanner.next().charAt(0);
				
			
			switch(option) {
			
			case 'Z':
				System.out.println("Bienvenido a el Creador de ID");
				System.out.println("Ingrese Nuevo ID: ");
				usuario2 = teclado.nextLine();
				System.out.println("Ingrese Nueva Contraseña: ");
				contra2 = teclado.nextLine();
				obj3.Archivo(usuario2 +" "+ contra2);
				System.out.println("\n");
				System.out.println("Bienvenido "+usuario2 + " su contraseña es: "+contra2);
				System.out.println("Ingrese a el ID");
				break;
				
			case 'X':
				System.out.println("Ingrese su ID: ");
				usuario = teclado.nextLine();
				System.out.println("Ingrese su Contraseña: ");
				contra = teclado.nextLine();
				String leero1 = readText(0);
				int count = 0;
				String[] arrOfStr = leero1.split(" ", 2);
				while (leero1 != null) {
					leero1 = readText(count);
					String[] arrOfStr1 = leero1.split(" ", 2);
				if (arrOfStr1 [0].equals(usuario) && arrOfStr1 [1].equals(contra)) 
					{
						obj2.usuario = this;
						obj2.showMenu();
					}
					else 
					{
						System.out.println("Intente Nuevamente");
					}
				break;
				}
				break;
			}
	}
		while(option != 'F');
}

	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContra() {
		return contra;
	}

	
	public void setContra(String contra) {
		this.contra = contra;
	}
	
	public String readText(int n){
		 BufferedReader reader;
		 String line = null;
		 int count = 0;
	        try {
	            reader = new BufferedReader(new FileReader("C:\\Users\\Roy\\Documents\\filename.txt"));
	            line = reader.readLine();
	            while (line != null && count != n) {
	                System.out.println(line);
	                count ++;
	                // read next line
	                line = reader.readLine();
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return line;

    }
	
}



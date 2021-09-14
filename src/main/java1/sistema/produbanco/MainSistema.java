package sistema.produbanco;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	
	int opcion = 0;
	String clave = "85AB";
	
	System.out.println("Ingrese Clave");
	clave = in.nextLine();
	
	while(opcion!=3) {
		
		if(clave=="85AB") {
		
		System.out.println("***********************************");
		System.out.println("BANCO PRODUBANCO, elija una opción:");
		System.out.println("1. Realizar transferencia");
		System.out.println("2. Consultar transacciones");
		System.out.println("3. SALIR");
		System.out.println("***********************************");
		
		}else {
			System.out.println("Clave Incorrecta, Ingrese su clave");
			
		if(opcion==1) {
			System.out.println("Ingresar cuenta de destino:");
			int cuenta = in.nextInt();
			System.out.println("Ingrese el monto");
			String monto = in.nextLine();
			
		}else{ 
		}
			
//
//			A partir del monto ingresado se debe realizar una resta del saldo disponible (se debe asumir que el saldo disponible es $1000), y presentará un mensaje indicando el nuevo saldo luego de la resta:
//
//			“Su nuevo saldo es:” +saldo (saldo es variable)
//
//			Nota: asuma que el monto ingresado para la transferencia siempre va a ser menor a $1000.
//
//			2. Cuando seleccione la opción 2, el sistema presentará directamente el siguiente mensaje:
//
//			“En este momento se están procesando las transacciones, intente más tarde”

		

		
		
	}
	}
	}
	}


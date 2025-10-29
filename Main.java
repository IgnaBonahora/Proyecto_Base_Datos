import java.util.Scanner;

public class Main{

	public static void main(String [] args){
		Scanner lector = new Scanner(System.in);
		Sistema sistema = new Sistema();
		boolean termina = true;
		while(termina){
			
			sistema.pantallaPrincipal();
			
			String entrada = lector.nextLine();
			char opcion = entrada.charAt(0);
			if ( opcion >= '1' && opcion <= '3'){
				if(opcion == '1'){
					sistema.ingresarUsuario();
				}else if(opcion == '2'){
					sistema.eliminarReclamo();
				}else {
					sistema.listarReclamos();
				}
			}else{
				System.out.println();
				System.out.println("---Cerrando Sistema---");
				System.out.println();
				termina = false;
			}

		}

		lector.close();
	}
}

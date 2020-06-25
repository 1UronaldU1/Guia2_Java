import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese una nota1 [0-20]: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese una nota2 [0-20]: ");
		int n2 = sc.nextInt();
		
		System.out.println("Ingrese una Asistencia[0 - 12 ] : ");
		int n3 = sc.nextInt();
		
		String estado= "";
		
		float prom = n1 * 0.3f + n2 * 0.7f;
		float porce = n3 * 100/12;
		
		if (prom >= 13 && porce >= 70 )
			estado = "Aprobado";
		else
			estado = "Desaprobado";
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Promedio: " + prom);
		System.out.println("Asistencia: " + porce);
		System.out.println("Estado: " + estado);
		
		
		

	}

}

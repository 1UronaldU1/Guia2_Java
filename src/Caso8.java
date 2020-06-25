import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una nota: ");
		int n1 = sc.nextInt();
		
		String mensaje= "";
		
		if (n1 <= 7)
			mensaje = "Sin palabras";
		else if (n1 <=10)
			mensaje = "Malo";
		else if (n1 <=14)
			mensaje = "Regular";
		else if (n1 <=17)
			mensaje = "Notable";
		else if (n1<=20)
			mensaje = "Excelente";
		else 
			mensaje = "Nota invalida";
		
		System.out.println("Respuesta: " + mensaje);
	}

}

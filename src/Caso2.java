import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		String mensaje = "";
		
		if (n % 2 ==0)
			mensaje = "Número es par";
		else
			mensaje = "Número es impar";
		
		System.out.println("Respuesta: " + mensaje);
			

	}

}

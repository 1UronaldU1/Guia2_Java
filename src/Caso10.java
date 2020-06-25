import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese las horas de Trabajo: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Ingrese la tarifa por horas: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Ingrese los minutos de Tardanza : ");
		float n3 = sc.nextFloat();
		
		
		float importe = n1 * n2;
		float bono = 0;
		float descuento = 0;
		
		if (n1 > 60 )
			bono = importe*0.13f;
		else if (n1 < 60)
			bono = importe * 0.04f;
		else if (n3 > 15 )
			descuento = importe * 0.03f;
		else if (n1 < 15)
			descuento = descuento;
		float total = ((n1*100)/70);
			
		System.out.println("Nombre: " + nombre);
		System.out.println("Importe: " + importe);
		System.out.println("Bono: " + bono);
		System.out.println("Descuento: " + descuento);
		System.out.println("Total: " + total);
		
		
		

	}

}
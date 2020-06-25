import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio: ");
		float precio = sc.nextFloat();
				
		System.out.println("cantidad: ");
		int cantidad = sc.nextInt();
		
		float parcial = precio * cantidad;
		float dscto = 0 ;
		
		if (cantidad > 8)
			dscto = 0.1f * parcial;
		
		float total = parcial - dscto;
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Precio...: " + precio);
		System.out.println("Descuento.: " + dscto);
		System.out.println("Total....: " + total);		
	}

}

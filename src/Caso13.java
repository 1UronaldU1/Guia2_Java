import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 double n1 = 0;
		 double n2 = 0;
		 int operacion = 0;
		 
		 System.out.println("Número 1 : ");
		 n1 = sc.nextDouble();
		 
		 System.out.println("Número 2 : ");
		 n2 = sc.nextDouble();
		 	 
		 System.out.println("Operación [1-6]: ");
		 operacion = sc.nextInt();
		 
		 double ope=0;
		 String opera = "";
		 
		 switch (operacion) {
		 	case 1 :
		 		ope=n1 + n2;
			 break;
		 	case 2 :
		 		ope = n1 - n2;
			 break;
		 	case 3 :
		 		ope = n1 * n2;
			 break;
		 	case 4 :
		 		if (n2>0) {
		 			ope = n1 / n2;}
		 		else {
		 			opera = ("No se puede dividir");}
		 		
		 	case 5 :
		 		if (n2>0) {
		 		ope = n1 % n2;}
		 		else {
		 			opera = ("No es posible hallar el resto entero");
		 		}
			 break;
		 	case 6 :
		 		if (operacion == 6) {
		 			opera = ("Promedio");
		 	
		 			ope = ((n1 + n2)/2);}
		 			else {
		 				opera = ("Promedio"); 
		 			}
		 		

			 break;
		 default :
			 ope = 0;
		 }
		 System.out.println("Número 1: " + n1);
		 System.out.println("Número 2: " + n2);
		 System.out.println("Operación: " + opera);
		 System.out.println("Resultado: " + ope);

	}

}
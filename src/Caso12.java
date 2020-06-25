import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 String empleado = "";
		 int nivel = 0;
		 double sueldo = 0;
		 
		 System.out.println("Nombre de empleado : ");
		 empleado = sc.nextLine();
		 
		 System.out.println("Nivel [1-4]: ");
		 nivel = sc.nextInt();
		 
		 System.out.println("Sueldo : ");
		 sueldo = sc.nextDouble();
		 
		 double inc = 0;
		 
		 switch (nivel) {
		 	case 1 :
			 inc = 0.045f;
			 break;
		 	case 2 :
		 		inc = 0.06f;
			 break;
		 	case 3 :
		 		inc = 0.085f;
			 break;
		 	case 4 :
		 		inc = 0.011f;
		 default :
			 inc = 0;
		 }
		 double total = sueldo + sueldo * inc;
		 System.out.println("Nombre del Empleado: " + empleado);
		 System.out.println("Nivel: " + nivel);
		 System.out.println("Sueldo: " + sueldo);
		 System.out.println("Incremento: " + inc);
		 System.out.println("Nuevo sueldo: " + total);
	}

}

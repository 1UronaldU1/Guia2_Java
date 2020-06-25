import java.util.Scanner;

public class Caso14{
 public static void main(String args[]){

   Scanner sc = new Scanner(System.in);

String alumno = "",turno = "", carrera="",nc = "", nt = "";
double monto = 0;
double des = 0;
double tp = 0, tpd = 0;

System.out.println("Alumno : ");
alumno = sc.nextLine();

System.out.println("Carrera : ");
carrera = sc.nextLine();


System.out.println("Turno : ");
turno = sc.nextLine();


if(carrera.equalsIgnoreCase("DS")){
	monto = 1500;
	nc = "Desarrollo de Software";
} else if(carrera.equalsIgnoreCase("RC")){
	monto = 1400;
	nc = "Redes y Conectividad";
} else if(carrera.equalsIgnoreCase("DG")){
	monto = 1300;
	nc = "Diseño Gráfico";
} else {
	monto = 0;
}

if(turno.equalsIgnoreCase("M")){
	des = monto * 0.10;
	nt = "Mañana";
} else if(turno.equalsIgnoreCase("T")){
	des = monto * 0.20;
	nt = "Tarde";
} else if(turno.equalsIgnoreCase("N")){
	des = monto * 0.15;
	nt = "Noche";
} else {
	des = 0;
}


tp = monto - des;
tpd = tp * 3.33;

System.out.println("El monto es: " + monto);
System.out.println("El nombre del turno es: " + nt);
System.out.println("Descuento: " + des);
System.out.println("Total a Pagar en Dolares: " + tpd);

}
}
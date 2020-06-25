import java.util.Scanner;

public class Caso15{
 public static void main(String args[]){

   Scanner sc = new Scanner(System.in);

String cliente = "",producto = "", forpa= "",mensaje = "", np="";
double pago = 0;
int cantidad = 0;
double descuento = 0;
double pagototal= 0;
double importe = 0;
double descuentototal = 0;
double aumento = 0;

System.out.println("Cliente : ");
cliente = sc.nextLine();

System.out.println("Producto[TB/LT//MN/IM] : ");
producto = sc.nextLine();

System.out.println("Forma de pago [C1/C2] : ");
forpa = sc.nextLine();

System.out.println("Cantidad : ");
cantidad = sc.nextInt();

if(producto.equalsIgnoreCase("TB")){
	pago = 350;
	np = "Tablet";
} else if(producto.equalsIgnoreCase("LT")){
	pago = 2300;
	np = "Lapto";
} else if(producto.equalsIgnoreCase("MN")){
	pago = 850;
	np = "Monitor ";
} else if(producto.equalsIgnoreCase("IM")){
	pago = 680;
	np = "Impresora ";
} else {
	pago = 0;
}

importe = pago * cantidad;

if(forpa.equalsIgnoreCase("C1")){
	descuento = importe * 0.05;
	forpa = "Contado";
	mensaje= "Descuento: " + descuento;
} else if(forpa.equalsIgnoreCase("C2")){
	aumento =importe *0.12;
	forpa = "Crédito";
	mensaje = "Aumento: " + aumento;

}


pagototal = (importe + aumento) - descuento;

System.out.println("El nombre del Cliente: " + cliente);
System.out.println("Producto: " + producto);
System.out.println("Precio: " + pago);
System.out.println("Cantidad: " + cantidad);
System.out.println("Importe: " + importe);
System.out.println("Forama de Pago: " + forpa);
System.out.println(mensaje);
System.out.println("Pago total: " + pagototal);

}
}
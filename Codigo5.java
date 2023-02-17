
public class Codigo5 {

	import java.util.Scanner;

	public static void name() {
		// TODO Auto-generated method stub
		// Lo que se realizo en el codigo fue:
		/**
		 * primeramente se realizo el metodo void main
		 * se exporto el scanner
		 * se cambio el tipo de dato de la variable ni de string a int, para recibir un numero
		 * se agregan brakes en la impresion de consola dentro del untimo if else del while
		 * para que no realiza un ciclo infinito
		 * se modifica el codigo en la linea s impresion de texto "introduzco el codigo" las comillas sencillas por dobles
		 */
		
		 Scanner s = new Scanner(System.in);
		 System.out.print("Introduzca un número: ");
		 int ni = s.nextInt();
		 int c = ni;
 
		 int afo = 0;
		 int noAfo = 0;
 
		 while (ni > 0) {
			 int digito = (int) (ni % 10);
			 if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				 afo++;
			 } else {
				 noAfo++;
 
				 ni /= 10;
			 }
 
			 if (afo > noAfo) {
				 System.out.println("El " + c + " es un número afortunado.");
				 break;
			 } else {
				 System.out.println("El " + c + " no es un número afortunado.");
				 break;
			 }
 
		 }
		
	}

}
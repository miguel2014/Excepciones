package diapositivas;

import java.util.Scanner;

public class NoDeclarativas3 {
	public static void main(String[] args) {
		//Queremos dar la oportunidad de volver a  introducir la posicion
		int[] numeros={0,1,2,3,4,5,6,7,8,9};
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce un numero ");
		//Vamos a producir una posicion no existente en el array
		int posicion=in.nextInt();
		//Deberiamos hacer una expresion regular para controlar que es un int
		if(posicion>=numeros.length  |posicion<0 ){
			System.out.println("Accediendo a posicion inexistente");
			//Volvemos a solicitar la posicion
			System.out.println("Introduce un numero: ");
			posicion=in.nextInt();
			if(posicion>=numeros.length  |posicion<0 ){
			System.out.println("Posicion inexistente");
			System.exit(1);
			in.close();
			}
			else
			System.out.println("El valor de esa posicion es: "+numeros[posicion]);
			
		}
		else{
			System.out.println("El valor de esa posicion es: "+numeros[posicion]);
			
		}
		in.close();
	
		
	}
}

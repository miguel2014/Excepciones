package diapositivas;

import java.util.Scanner;

public class NoDeclarativas1 {
	public static void main(String[] args) {
		//Vamos a definir un array (tamaño fijo)
		//Usamos la clase Scanner para solicitar una posicion
		int[] numeros={0,1,2,3,4,5,6,7,8,9};
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce un numero ");
		//Vamos a producir una posicion no existente en el array
		int posicion=in.nextInt();
		//Deberiamos hacer una expresion regular para controlar que es un int
		if(posicion>=numeros.length  |posicion<0 ){
			System.out.println("Accediendo a posicion inexistente");
			//Salimos con codigo de error 1
			System.exit(1);
			in.close();
		}
		else{
		System.out.println("El valor de esa posicion es: "+numeros[posicion]);
		}
		//Resto de codigo
		in.close();
		//lo que no se debe hacer
		//Las excepciones no declarativas no deben convertirse en declarativas
		/*
		 try {
			posicion=in.nextInt();
			System.out.println("El valor de esa posicion es: "+numeros[posicion]);
			
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Esa posicion no existe");
			e.printStackTrace();
		}
		*/
		
	}
}

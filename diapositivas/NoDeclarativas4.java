package diapositivas;

import java.util.Scanner;

public class NoDeclarativas4 {
	public static int[] numeros={0,1,2,3,4,5,6,7,8,9};
	public static Scanner in=new Scanner(System.in);
	public static int posicion;
	public static boolean flag=false;
	public static void main(String[] args) {
		while (!flag){// not flag cambia el valor boolean del flag
			posicion=getPosicion();//Se repite haste que flag sea true
		
		}
			System.out.println("Posicion del array "+numeros[posicion]);
			in.close();
			//break;
		
	}
	public static int getPosicion(){
		System.out.println("Indica posicion array ");
		int posicion=in.nextInt();
		if (posicion>=numeros.length |posicion<0)
			flag=false;
		else
			flag=true;
		
		return posicion;
	}
}

package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas2 {
	public static void main(String[] args)  {
		//Llamo el metodo
		
		try {
			manejarFicheros();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//throws relanza la excepcion lo manda hacia arriba
		//lo manda al metodo que hace la llamada
	}
	public static void manejarFicheros() throws IOException{
		//Vamos a leer un fichero de texto y lo vamos a mostrar en pantalla
		//La clase Scanner es la mejor
		File inFile=new File("/home/matinal/nombres_mujer.txt");
		//Vamos a escribir a un fichero de salida
		File outFile=new File("/home/matinal/nombres_back.txt");
		//Usamos PrintWritter
		BufferedWriter out=new BufferedWriter(new PrintWriter(outFile));
		
		Scanner in=new Scanner(inFile);
		//Leemos palabra a palabra next()
		String palabra="";
		while(in.hasNext()){
			palabra=in.next();
			System.out.println(palabra.toUpperCase());
			out.write(palabra.toUpperCase()+"\n");
		}
		if (in!=null) in.close();
		if (out!=null) out.close();
	}
	
}

package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas1 {
	public static void main(String[] args) throws IOException {
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

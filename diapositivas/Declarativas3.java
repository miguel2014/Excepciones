package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas3 {
	public static void main(String[] args)  {
		//Llamo el metodo
		
		manejarFicheros();
	}
	public static void manejarFicheros(){
		//Vamos a leer un fichero de texto y lo vamos a mostrar en pantalla
		//La clase Scanner es la mejor
		File inFile=new File("/home/matinal/nombres_mujer.txt");
		//Vamos a escribir a un fichero de salida
		File outFile=new File("/home/matinal/nombres_back.txt");
		Scanner in=null;
		BufferedWriter out=null;
		//Usamos PrintWritter
		try {
			in=new Scanner(inFile);
			out=new BufferedWriter(new PrintWriter(outFile));
			String palabra="";
			while(in.hasNext()){
				palabra=in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase()+"\n");
				
		}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally{
		System.out.println("Se ejecuta siempre finally");
		if(in!=null) in.close();
		if(out!=null)
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}}
package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Declarativas4 {
	public static void main(String[] args) {
		File inFile=new File("/home/matinal/nombres_mujer.txt");
		//Vamos a escribir a un fichero de salida
		File outFile=new File("/home/matinal/nombres_back.txt");
		//Con jdk 7 
		//Declaramos stream fuera del try
		//No hace falta finally para cerrar ,se cierra solo
		try (Scanner in=new Scanner(inFile);BufferedWriter out=new BufferedWriter(new FileWriter(outFile))
				) {
			String palabra;
			while(in.hasNext()){
				palabra=in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase()+"\n");
			}
		}  catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

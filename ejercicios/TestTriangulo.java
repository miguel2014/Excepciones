package ejercicios;

public class TestTriangulo {
	public static void main(String[] args) {
		Triangulo t;
		try {
			t = new Triangulo(0, 1, 1);
			System.out.println(t.Perimetro());
		} catch (TrianguloMalFormadoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
@SuppressWarnings("serial")
class TrianguloMalFormadoExcepcion extends Exception{
	
}
class Triangulo {
	//Atributos o variables de instancia

	private int lado1;
	private int lado2;
	private int lado3;
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @throws TrianguloMalFormadoExcepcion
	 */
	public Triangulo(int lado1, int lado2, int lado3) throws TrianguloMalFormadoExcepcion {
		//Se podra construir un triangulo siempre y cuando se cumpla la desigualdad triangular
		//Trabajo con lado no con this.lado 
		//lado tiene los valores de la llamada para crear el objeto 
		//this.lado no se ha inicializado a su valor todavia
		if(lado1+lado2>lado3 & lado2+lado3>lado1 & lado3+lado1>lado2)
		{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		}
		else{
			//No se puede construir el triangulo
			try {
				throw new TrianguloMalFormadoExcepcion();
			} catch (TrianguloMalFormadoExcepcion e) {
				// TODO Auto-generated catch block
				System.out.println("Con esos valores no se puede");
				}
			
		}
	}
	public int Perimetro(){
		return lado1+lado2+lado3;
	}
	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3="
				+ lado3 + "]";
	}
}

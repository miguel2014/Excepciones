package ejercicios;

public class TestConversion {
	public static void main(String[] args) {
		Binario b;
		try {
			b = new Binario("1111100");
			System.out.println(b.getValorDecimal());
		} catch (BinarioMalFormadoExcepcion e) {
			e.printStackTrace();
		}
		try {
			Hexadecimal h=new Hexadecimal("012Aa34");
			System.out.println(h.HextoDecimal());
		} catch (HexadecimalMalFormadoExcepcion e) {
			
			e.printStackTrace();
		}
	}
	
}

class Binario{
	private String valor;

	/**
	 * @param valor
	 */
	public Binario(String valor) throws BinarioMalFormadoExcepcion {
		if(esBinario(valor))
		this.valor = valor;
		else{
			try {
						throw new BinarioMalFormadoExcepcion();
						
					} catch (BinarioMalFormadoExcepcion e) {
						System.out.println("No es binario");
					}
			
				}
			}
	
	private boolean esBinario(String valor){
		return valor.matches("[01]+"); //+ =1-muchos
	}
	public int getValorDecimal(){
		int suma=0;
		StringBuilder sbuilder=new StringBuilder(this.valor);
		String vuelta=sbuilder.reverse().toString();
		for (int i = 0; i < vuelta.length(); i++) {
			//charAt(i) devuelve un char
			//Character.toString convierte el String a int
			//suma+=Integer.parseInt(Character.toString(vuelta.charAt(i)))*Math.pow(2, i);
			if (vuelta.charAt(i)=='1') {
				suma+=Math.pow(2, i);
			}
		}
		return suma;
		
	}
	@Override
	public String toString() {
		return "TestConversion [valor=" + valor + "]";
	}
	
}
@SuppressWarnings("serial")
class BinarioMalFormadoExcepcion extends Exception{}
@SuppressWarnings("serial")
class HexadecimalMalFormadoExcepcion extends Exception{
}


class Hexadecimal{
	private String valor;

	/**
	 * @param valor
	 */
	public Hexadecimal(String valor) throws HexadecimalMalFormadoExcepcion {
		if(esHexadecimal(valor)) //Creo el objeto
		this.valor = valor;
		else{
			try {
				throw new HexadecimalMalFormadoExcepcion();
			} catch (HexadecimalMalFormadoExcepcion e) {
				System.out.println("No es hexadecimal");
			}
			

		}
	}

	private boolean esHexadecimal(String valor){
		return valor.matches("[0-9a-fA-F]+");
	}
	public int HextoDecimal(){
		int suma=0;
		StringBuilder sbuilder=new StringBuilder(this.valor);
		String vuelta=sbuilder.reverse().toString().toUpperCase();
		for (int i = 0; i < vuelta.length(); i++) {
			//Obtenemos cada char de la cadena vuelta hexadecimal al reves
			char aux=vuelta.charAt(i);
			switch (aux) {
			case 'A':
				suma+=10*Math.pow(16, i);
				break;
			case 'B':
				suma+=11*Math.pow(16, i);
				break;
			case 'C':
				suma+=12*Math.pow(16, i);
				break;
			case 'D':
				suma+=13*Math.pow(16, i);
				break;
			case 'E':
				suma+=14*Math.pow(16, i);
				break;
			case 'F':
				suma+=15*Math.pow(16, i);
				break;
			default:
				suma+=Integer.parseInt(Character.toString(aux))*Math.pow(16, i);
				break;
			}
		}
		
		return suma;
	}
	@Override
	public String toString() {
		return "Hexadecimal [valor=" + valor + "]";
	}
	
	
	
}

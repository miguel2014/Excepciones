package diapositivas;

public class EjemploExcepcionPropia {
	public static void main(String[] args) {
		try {
			EcuacionSegundoGrado e=new EcuacionSegundoGrado(0,1, 3);
			System.out.println(e);
		} catch (NoEcuacionSegundoGradoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//Vamos a crear nuestra propia excepcion
class NoEcuacionSegundoGradoExcepcion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
//Vamos a crear la clase ecuacion segundo grado
class EcuacionSegundoGrado{
	//ax²+bx+c=0
	//No es ecuacion de segundo grado si a=0
	private int a;
	private int b;
	private int c;
	public EcuacionSegundoGrado(int a, int b, int c) throws NoEcuacionSegundoGradoExcepcion {
		if (a==0) throw new NoEcuacionSegundoGradoExcepcion();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//Resto de metodos
	@Override
	public String toString() {
		return "EcuacionSegundoGrado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
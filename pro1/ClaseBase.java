
public class ClaseBase {

	public static void main(String[] args) {
		System.out.println("construyendo la superclase"); 
		metodoReescribible();
		
		
		/*el metodo metodoReescribible(), queda oculto por el metodo del mismo nombre definido en la clase derivada*/
		void metodoreescribible();
		System.out.println("soy la supercalse");
	}

}

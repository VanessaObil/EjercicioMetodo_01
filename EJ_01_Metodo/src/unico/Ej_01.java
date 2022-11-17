package unico;

public class Ej_01 {

	public static void main(String[] args) {
		// Implementar un método llamado eco() a la que se le pasa como parámetro un número n, 
		//y muestra por pantalla n veces el mensaje "Eco..."

		int numVeces;
		numVeces = Util.leerInt("Cuantas veces hacemos eco?: ");
		eco(numVeces);
		
	}
	public static void eco(int n) {
		for(int i=1; i<=n ; i++) {
			System.out.print("Eco...");
		}
		
	}

}
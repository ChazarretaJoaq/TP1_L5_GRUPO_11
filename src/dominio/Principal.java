package dominio;

/**
 * @author
 *  Esteban <a href="https://github.com/JEOrellano">JEOrellano</a>
 * @author
 *  Carlos <a href="https://github.com/Silva-Carlos-Andres">Silva-Carlos-Andres</a>
 * @author
 *  Gast�n <a href="https://github.com/gaston5050">gaston5050</a>
 * @author
 *  Gustavo <a href="https://github.com/ChazarretaJoaq">ChazarretaJoaq</a>
 * @author
 *  Santiago <a href="#">(...)</a>
 * 
 * @see also
 * 	https://github.com/Silva-Carlos-Andres/TP1_L5_GRUPO_11.git
 * */
public class Principal {
	public static void main(String[] args) {
		Entrada e1Recital = new EntradaRecital(1);
		EntradaTeatro Teatro = new EntradaTeatro();
		System.out.println(e1Recital.getNombre());
		
		System.out.println( Teatro.toString(2));
		
	}
}

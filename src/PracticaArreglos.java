public class PracticaArreglos{
	
	/**
	 * Método que devuelve una representación en cadena de un arreglo
	 * de objetos {@link Object}.
	 * @param arreglo El arreglo de elementos de tipo {@link Object}.
	 * @return Una representación en cadena del arreglo.
	 */
	public static String imprimeArreglo(Object[] arreglo){
		if (arreglo == null) {
			return "[]";
		}
		String sa = "[";

		for (Object elemento : arreglo) {
			sa = sa + elemento.toString();
			sa = sa + ",  ";
		}
		sa = sa.substring(0, sa.length() - 2);
		sa = sa + "]";
		return sa;
	}

	/**
	 * Método que devuelve una representación en cadena de un
	 * arreglo de enteros.
	 * @param arreglo El arreglo con elementos de tipo entero.
	 * @return Una representación en cadena del arreglo de enteros.
	 */
	public static String imprimeArreglo(int[] arreglo){
		if (arreglo == null) {
			return "[]";
		}
		String sa = "[";

		for (int numero : arreglo) {
			sa = sa + String.valueOf(numero);
			sa = sa + ",  ";
		}
		sa = sa.substring(0, sa.length() - 2);
		sa = sa + "]";
		return sa;
	}

	/**
	 * Método que devuelve una representación en cadena de un 
	 * arreglo de números de tipo {@code double}.
	 * @param arreglo El arreglo con números de tipo {@code double}.
	 * @return Una representación en cadena del arreglo de números de tipo {@code double}.
	 */
	public static String imprimeArreglo(double[] arreglo){
		if (arreglo == null) {
			return "[]";
		}
		String sa = "[";

		for (double flotante : arreglo) {
			sa = sa + String.valueOf(flotante);
			sa = sa + ",  ";
		}
		sa = sa.substring(0, sa.length() - 2);
		sa = sa + "]";
		return sa;
	}

	/**
	 * Método que recibe un arreglo A de tipo {@code int} y devuelve 
	 * un nuevo arreglo con los elementos de A en orden inverso.
	 * @param arreglo El arreglo con elementos de tipo {@code int}.
	 * @return La reversa del arreglo de tipo {@code int}.
	 */
	public static int[] reversaArreglo(int[] arreglo){
		int[] copiaArreglo = new int[arreglo.length];

		for(int c = 0; c < arreglo.length ; c++){
			copiaArreglo[arreglo.length - c - 1] = arreglo[c];
		}

		return copiaArreglo;
	} 

	/**
	 * Método que recibe un arreglo A con elementos de tipo {@link Figura}
	 * y devuelve un arreglo con las áres de los elementos de A.
	 * @param figuras El arreglo con elementos de tipo {@link Figura}.
	 * @return Un nuevo arreglo con las áreas de los elementos del arreglo
	 * de tipo {@link Figura}.
	 */
	public static double[] guardarAreas(Figura[] figuras){
		
		double[] areas = new double[figuras.length];

		for(int c  = 0; c < figuras.length; c++){
			areas[c] = figuras[c].calcularArea();
		}

		return areas;
	}

	/**
	 * Método que recibe un arreglo de tipo {@link String} y un arreglo
	 * con elementos de tipo {@code int}, ambos de misma longitud y devuelve
	 * un nuevo arreglo de tipo {@link Persona} con nombre y edad igual
	 * a la posición {@code i} de los arreglos recibidos como parámetros.
	 * @param nombres El arreglo con elementos de tipo {@link String} que son
	 * los nombres de las personas a crear.
	 * @param edades El arreglo con elementos de tipo {@code int} que son 
	 * las edades de las personas a crear.
	 * @return Un nuevo arreglo de tipo {@link Persona} que lleva los nombres
	 * y las edades  de las posiciones {@code i} de los arreglos recibidos 
	 * como parámetros.
	 */
	public static Persona[] crearPersonas(String[] nombres, int[] edades){
		Persona[] personas = new Persona[edades.length];

		for(int c  = 0; c < personas.length; c++){
			personas[c] = new Persona(nombres[c], edades[c]);
		}

		return personas;

	}

	public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2){
		int[] arreglo3 = new int[arreglo1.length + arreglo2.length];
		for (int i = 0; i < arreglo3.length; i++) {
			if(i < arreglo1.length){
				arreglo3[i] = arreglo1[i];
			} else{
				arreglo3[i] = arreglo2[i - arreglo1.length];
			}
		}

		return arreglo3;

	}

	/*Punto extra*/
	/**
	 * Método que recibe un arreglo con elementos de tipo {@link Object}
	 * y devuelve un nuevo arreglo de tipo {@link Object} con los elementos
	 * del arreglo recibido como parámetro pero sin elementos repetidos
	 * (si es que lo tiene).
	 * @param arreglo El arreglo con elementos de tipo {@link Object}-
	 * @return Un nuevo arreglo con los elementos del arreglo recibido como
	 * parámetro pero sin elementos repetidos.
	 */
	public static Object[] eliminarDuplicados(Object[] arreglo) {
		Object[] aux = new Object[arreglo.length];
		int longitud = 0;
		for(int i = 0; i < arreglo.length; i++){
			Object elemento = arreglo[i];
			boolean esDuplicado = false;

			for(int j = 0; j < longitud; j++){
				if(aux[j] == elemento){
					esDuplicado = true;
					break;
				}
			}

			if (!esDuplicado) {
				aux[longitud] = elemento;
				longitud++;
			}

		}

		Object[] nuevoArreglo = new Object[longitud];
		for(int i = 0; i < longitud; i++){
			nuevoArreglo[i] = aux[i];
		}

		return nuevoArreglo;
	}
}

public class PracticaArreglos{
	
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

	public static int[] reversaArreglo(int[] arreglo){
		int[] copiaArreglo = new int[arreglo.length];

		for(int c = 0; c < arreglo.length ; c++){
			copiaArreglo[arreglo.length - c] = arreglo[c];
		}

		return copiaArreglo;
	} 

	public static double[] guardarAreas(Figura[] figuras){
		
		double[] areas = new double[figuras.length];

		for(int c  = 0; c < figuras.length; c++){
			areas[c] = figuras[c].calcularArea();
		}

		return areas;
	}

	public static Persona[] crearPersonas(String[] nombres, int[] edades){
		Persona[] personas = new Persona[edades.length];

		for(int c  = 0; c < personas.length; c++){
			personas[c] = new Persona(nombres[c], edades[c]);
		}

		return personas;

	}

	public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2){
		/*Aquí va tu código*/
	}

	/*Punto extra*/
	public static Object[] eliminarDuplicados(Object[] arreglo) {
		return null;
	}
}

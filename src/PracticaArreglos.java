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
		sa = sa.substring(0, sa.length() - 1);
		sa = sa + "]";
		return sa;
	}

	public static String imprimeArreglo(int[] arreglo){
		/*Aquí va tu código*/
	}

	public static String imprimeArreglo(double[] arreglo){
		/*Aquí va tu código*/
	}

	public static int[] reversaArreglo(int[] arreglo){
		/*Aquí va tu código*/
	} 

	public static double[] guardarAreas(Figura[] figuras){
		/*Aquí va tu código*/
	}

	public static Persona[] crearPersonas(String[] nombres, int[] edades){
		/*Aquí va tu código*/
	}

	public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2){
		/*Aquí va tu código*/
	}

	/*Punto extra*/
	public static Object[] eliminarDuplicados(Object[] arreglo) {
		return null;
	}
}

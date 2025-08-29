
public class Persona {
   private String nombre;
   private int edad;

   public Persona(String var1, int var2) {
      this.nombre = var1;
      this.edad = var2;
   }

   public String toString() {
      return this.nombre + " : " + this.edad;
   }
}

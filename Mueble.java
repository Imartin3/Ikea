package ikea;

public class Mueble extends ProductoHogar{
	 String tipoDeMueble;

	 public Mueble(String nombre, String descripcion, double precio, String tipoDeMueble, TipoDeMaterial tipoDeMaterial) {
		  super(nombre, descripcion, precio, tipoDeMaterial);
		 this.tipoDeMueble = tipoDeMueble;
	 }

	 public String getTipoDeMueble() {
		 return tipoDeMueble;
	 }

	 public void setTipoDeMueble(String tipoDeMueble) {
		 this.tipoDeMueble = tipoDeMueble;
	 }

	 public void mostrarCaracteristicas() {
		 super.mostrarCaracteristicas();
		 System.out.println("| Tipo de mueble: " + tipoDeMueble+ "  |");
		  System.out.println("| Tipo de material: " + tipoDeMaterial+ "  |");
		  System.out.println("------------------------------------");
	 }
}

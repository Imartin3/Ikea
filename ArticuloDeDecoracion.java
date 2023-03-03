package ikea;

public class ArticuloDeDecoracion extends ProductoHogar{
	 public ArticuloDeDecoracion(String nombre, String descripcion, double precio, TipoDeMaterial tipoDeMaterial) {
		  super(nombre, descripcion, precio, tipoDeMaterial);
	 }
	 public void mostrarCaracteristicas() {
		 super.mostrarCaracteristicas();
	 }
}

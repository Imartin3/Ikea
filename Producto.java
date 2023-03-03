package ikea;

abstract class Producto {
	 String nombre;
	 String descripcion;
	 double precio;

	 public Producto(String nombre, String descripcion, double precio) {
		 this.nombre = nombre;
		 this.descripcion = descripcion;
		 this.precio = precio;
	 }

public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public String getDescripcion() {
		 return descripcion;
	 }

	 public void setDescripcion(String descripcion) {
		 this.descripcion = descripcion;
	 }

	 public double getPrecio() {
		 return precio;
	 }

	 public void setPrecio(double precio) {
		 this.precio = precio;
	 }

	 public void mostrarCaracteristicas() {
		  System.out.println("------------------------------------");
		 System.out.println("|  Nombre: " + nombre+ "  |");
		 System.out.println("|  Descripcion: " + descripcion+ "  |");
		 System.out.println("|  Precio: " + precio+ "  |");
	 }

}

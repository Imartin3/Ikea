package ikea;
enum TipoDeMaterial {
	 MADERA, METAL, PLASTICO, OTRO
}

abstract class ProductoHogar extends  Producto{
	 TipoDeMaterial tipoDeMaterial;
	 public ProductoHogar(String nombre, String descripcion, double precio, TipoDeMaterial tipoDeMaterial) {
		 super(nombre, descripcion, precio);
		 this.tipoDeMaterial = tipoDeMaterial;
	 }
	 public TipoDeMaterial getTipoDeMaterial() {
		 return tipoDeMaterial;
	 }

	 public void setTipoDeMaterial(TipoDeMaterial tipoDeMaterial) {
		 this.tipoDeMaterial = tipoDeMaterial;
	 }

	 public void mostrarCaracteristicas() {
		 super.mostrarCaracteristicas();
		 System.out.println("| Tipo de material: " + tipoDeMaterial+ "  |");
		  System.out.println("------------------------------------");
	 }

}

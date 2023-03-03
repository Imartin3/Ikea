package ikea;

public class MainIkea {

	 public static void main(String[] args) {
		 Tienda tienda = new Tienda(10);
		 Mueble estanteria = new Mueble("KALLAX", "Estanteria de madera con 6 compartimentos", 75.99, "Estanteria", TipoDeMaterial.MADERA);
		 Electrodomestico flexo= new Electrodomestico("FORSÅ", "Lampara de pie compatible con casquillo E27", 7.99, EficienciaEnergetica.A, TipoDeMaterial.METAL);

		 tienda.agregarProducto(estanteria);
		 tienda.agregarProducto(flexo);

		 tienda.mostrarProductos();
	 }
}

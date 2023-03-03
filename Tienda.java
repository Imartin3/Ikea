package ikea;

public class Tienda {
	 Producto[] productos;
	 int cantidadProductos;

	 public Tienda(int tamanoMaximo) {
		  productos = new Producto[tamanoMaximo];
		  cantidadProductos = 0;
	 }

	 public void agregarProducto(Producto producto) {
		  productos[cantidadProductos] = producto;
		  cantidadProductos++;
	 }

	 public void mostrarProductos() {
		  for (int i = 0; i < productos.length; i++) {
				if (productos[i] != null) {
					 productos[i].mostrarCaracteristicas();
					 System.out.println();
				}
		  }
	 }
}

package ikea;
enum EficienciaEnergetica {
	 A, B, C, D, E, F
}
public class Electrodomestico extends ProductoHogar {
	 EficienciaEnergetica eficienciaEnergetica;

	 public Electrodomestico(String nombre, String descripcion, double precio, EficienciaEnergetica eficienciaEnergetica, TipoDeMaterial tipoDeMaterial) {
		 super(nombre, descripcion, precio,tipoDeMaterial);
		 this.eficienciaEnergetica = eficienciaEnergetica;
	 }

	 public EficienciaEnergetica getEficienciaEnergetica() {
		 return eficienciaEnergetica;
	 }

	 public void setEficienciaEnergetica(EficienciaEnergetica eficienciaEnergetica) {
		 this.eficienciaEnergetica = eficienciaEnergetica;
	 }

	 public void mostrarCaracteristicas() {
		 super.mostrarCaracteristicas();
		 System.out.println("| Eficiencia energetica: " + eficienciaEnergetica+ "  |");
		  System.out.println("| Tipo de material: " + tipoDeMaterial+ "  |");
		  System.out.println("------------------------------------");
	 }
}

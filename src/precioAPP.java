import javax.swing.JOptionPane;
public class precioAPP {

	public static void main(String[] args) {
		
		//Declaramos constante IVA
		final double IVA=0.21;
		//Pedimos el precio
		String var1=JOptionPane.showInputDialog("Introduce un precio ");
		//Mostramos el precio pedido
		System.out.println("El precio introducido es "+var1);
		//Pasamos el String a double ya que puede tener decimales
		double num1=Double.parseDouble(var1);
		//Mostramos el IVA
		System.out.println("El IVA es "+(num1*IVA));
		//Declaramos el precio final
		double precioFinal=num1+(num1*IVA);
		System.out.println("El precio con IVA es "+precioFinal);
		
	}

}


public class Main {
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		/* Aqui se introduce la ruta del archivo con doble slash en vez de simple */
		int resultado = calc.Calcular(calc.LeerArchivo("C:\\Users\\RodolfoC\\Desktop\\prueba.txt"));
		System.out.println(String.valueOf("El resultado es: " + resultado));
	}
}
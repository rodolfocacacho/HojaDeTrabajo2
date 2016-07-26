import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Calculadora implements I_Calculadora {
	/*Atributos: */
	Pila pila = new Pila();
	String operaciones;
	
	@Override
	public int Calcular(String ops) {
		/* variables locales: */
		int resultado = 0; // resultado a devolver
		
		String[] splitedOps = ops.split(" "); //Se utiliza un arreglo con cada caracter de la instruccion
		for(int i=0; i<splitedOps.length; i++){ //Se recorre el arreglo para realizar los calculos
			try{
				pila.Push(Integer.parseInt(splitedOps[i])); //Si se puede convertir a entero entonces se manda a la pila
                                
			}
			catch(Exception e){ // si no, es porque es un operador
                            
                            try{ // Se realiza este try en caso de que el string no se alguno de los operadores
                                int b = (int)pila.Pop(); // Se sacan los dos ultimos operandos de la pila para luego operarlos
                                int a = (int)pila.Pop();
				switch(splitedOps[i]){

				case "+":
					resultado = a + b;
					pila.Push(resultado);
                                        System.out.println(String.valueOf("Se sumo "+a+" y " + b));
					break;
					
				case "*":
					resultado = a*b;
					pila.Push(resultado);
                                        System.out.println(String.valueOf("Se multiplico "+a+" por " + b));
					break;
					 
				case "x":
					resultado = a*b;
					pila.Push(resultado);
                                        System.out.println(String.valueOf("Se multiplico "+a+" por " + b));
					break;
					
				case "/":
					resultado = a/b;
					pila.Push(resultado);
                                        System.out.println(String.valueOf("Se dividio "+ a + " entre "+ b));
					break;
                                        
                                case "-":
					resultado = a-b;
					pila.Push(resultado);
                                        System.out.println(String.valueOf("Se le resto "+ b + " a "+ a));
					break;
                                default:
                                        System.out.println(String.valueOf("El codigo ingresado no es postfix"));
				}
                            }
                            catch(Exception error){
                                System.out.println(String.valueOf("El codigo ingresado no es postfix"));
                            }
			}
			}
		
		return resultado;
	}

	@Override
	public String LeerArchivo(String direccion) {
		String instrucciones = "";
		try{
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null){
				// El ciclo se realizara mientras bfRead tenga datos
				temp = temp + bfRead;				
			}
			
		instrucciones = temp;
		
		}
		catch(Exception e){
			System.err.println("No es posible leer el archivo");
		}
		return instrucciones;
		
		// El codigo anterior fue adaptado del tutorial encontrado en: https://www.youtube.com/watch?v=0ceHv2niNR4
	}

	@Override
	public String ToString() {
		return null;
	}

}
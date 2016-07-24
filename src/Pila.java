import java.util.Vector;
import java.util.Vector;

public class Pila implements I_Stack {
	/*Atributos: */
	private Vector stack = new Vector();
	
	@Override
	public void Push(Object t) {
		stack.addElement(t);
	}

	@Override
	public Object Pop() {
		return stack.remove(stack.size()-1);
                
	}

	@Override
	public boolean IsEmpty() {
		return stack.isEmpty();
	}

	@Override
	public int Size() {
		return stack.size();
	}

	@Override
	public Object get() {
		return null;
	}

}

public class OperadorIncremDecrem {

	public static void main(String[] args) {

		int x = 5;
		int z = 5;
		int var1 = 5, var2;
		
			
		x++; //x+= 1; incremento
		z--; //z-= 1; decremento
		//var2 = var1++; // asignacion de var2 a var2. Primero hace asignación y luego incrementa. 
		var2 = ++var1; // primero hace el aumento y luego asigna.
		
		
		
		System.out.println(x);
		System.out.println(z);
		System.out.println(var2);

	}

}

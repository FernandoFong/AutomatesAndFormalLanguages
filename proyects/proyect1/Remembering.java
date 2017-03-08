import java.util.Scanner;
import java.util.HashSet;

public class Remembering {

    public static void main(String [] args) {
	Scanner in= new Scanner(System.in);
	String [] edos = in.nextLine().split(" ");
	String [] alfabeto = in.nextLine().split(" ");
	String [] f = in.nextLine().split(" ");
	//Aquí va nuestra función de transición. 
	Estado [] estado = new Estado [edos.length];

	for(int i= 0; i < edos.length; i++) {
	    estado[i] = new Estado();
	    estado[i].simbolo = Integer.parseInt(edos[i]);
	}
	
	for(int i= 0; i < f.length; i++)
	    for(int j = 0; j < edos.length; j++)
		if (Integer.parseInt(f[i]) == estado[j].simbolo) {
		     estado[j].esFinal = true;
		     break;
		}

	for(Estado e : estado)
	    System.out.printf("%d %b\n", e.simbolo, e.esFinal);
    }
}

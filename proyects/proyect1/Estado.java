/**
 *Clase estado que nos permitirá imprimir un renglón completo de toda
 *la tabla del autómata.
 *@author Fernando Fong
 *@date 4/III/2017
 *@version 1.0
 */
public class Estado {

    public int simbolo; //Símbolo del estado.
    public int [] transiciones; //Contradominios de Delta.
    
    public Estado() { }

    public void tomaEstados(String [] e) {
	this.transiciones = new int[e.length];
	for(int i= 0; i < e.length; i++)
	    transiciones[i]= Integer.parseInt(e[i]);
    }

    public int procesa(char c, char [] alf) {
	for(int i = 0; i < alf.length; i++)
	    if(c == alf[i])
		return transiciones[i];
	return 0;
    }

    public String toString() {
	return Integer.toString(this.simbolo);
    }
}

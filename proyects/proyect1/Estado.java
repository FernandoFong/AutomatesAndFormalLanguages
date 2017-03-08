/**
 *Clase estado que nos permitirá imprimir un renglón completo de toda
 *la tabla del autómata.
 *@author Fernando Fong
 *@date 4/III/2017
 *@version 1.0
 */
public class Estado {

    public int simbolo;
    public int [] transiciones;
    public boolean esFinal; //Tiene sentido hacerla pública.
    
    public Estado(int i, String [][] delta, int n, int [] finales){
	this.simbolo = i;
	this.transiciones = new int [n];
	for(int j = 0; j < n; j++)
	    transiciones[j] = Integer.parseInt(delta [i][j]);
	for(int j : finales)
	    esFinal = j == this.simbolo;
    }

    public Estado() {
	this.simbolo = -1;
	this.esFinal = false;
    }

    public String toString(){
	return null;
    }

    public int getSimbolo(){
	return this.simbolo;
    }
}

import java.util.LinkedList;
/**
 *Proyecto de la materia de Autómatas y Lenguajes Formales.
 *@author Fong Baeza Luis Fernando Yang.
 *@date 28 / 02 / 2017
 *@version 1.0
 */
public class Determinista{

    private Estado [] Q;
    private char [] alfabeto;
    private Estado actual;
    
    public Determinista(String edos, String sigma, String [][] delta, int [] finales){
	this.alfabeto = sigma.toCharArray();
	this.Q = new Estado [edos.length()];
	for(int i= 0; i < this.Q.length; i++)
	    Q[i] = new Estado(i, delta, alfabeto.length, finales);
	this.actual = Q[0];
    }

    public boolean leeCadena(String cadena){
	for(char c : cadena.toCharArray()){
	    Estado aux= this.actual;
	    actual= this.hazTransicion(c, aux);
	}
	return actual.esFinal;
    }
    
    public String toString(){
	return null;
    }

    private Estado hazTransicion(char c, Estado e){
	return null;
    }
}

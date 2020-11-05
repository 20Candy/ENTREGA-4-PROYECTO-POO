//tomar en cuenta que la clase al momento de tener el ejercicio bueno debe retornar un 1
//tenemos pensado como hacer las preguntas.
//crear una lista pa las palabras.
//métodos ejercicios y conteo de buebas y malas
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

class diario2 extends madrelec{

    public diario2(){
		super();//llama al constructor de la clase madre
    }
	
    public void addop(){ //hace override sobre este metodo
		//Agregar palabras al "diccionario" de español
        esp.add("¿Cual es tu nombre?");
        esp.add("Dormitorio");
        esp.add("Sala");
        esp.add("Baño");
        esp.add("Cocina");

        //Agregar palabras al "diccionario" de k'qchiquel
        kaq.add("Achike ab'i' rat?");
        kaq.add("warab'äl");
        kaq.add("nimajay");
        kaq.add("ruxikin jay");
        kaq.add("ruchi' q'aq'");
	}
}
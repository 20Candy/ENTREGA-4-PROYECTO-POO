//tomar en cuenta que la clase al momento de tener el ejercicio bueno debe retornar un 1
//tenemos pensado como hacer las preguntas.
//crear una lista pa las palabras.
//métodos ejercicios y conteo de buebas y malas
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

class familia2 extends madrelec{

    public familia2(){
		super();//llama al constructor de la clase madre
    }

    public void addop(){ //hace override sobre este metodo
		//Agregar palabras al "diccionario" de español
        esp.add("Familia");
        esp.add("Madre");
        esp.add("Padre");
        esp.add("Hijos");
        esp.add("Nieto");

        //Agregar palabras al "diccionario" de k'qchiquel
        kaq.add("Ach'alal");
        kaq.add("Te'ej");
        kaq.add("Tata'aj");
        kaq.add("Alk'walaxela");
        kaq.add("mam");
	}
}
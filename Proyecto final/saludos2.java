//tomar en cuenta que la clase al momento de tener el ejercicio bueno debe retornar un 1
//tenemos pensado como hacer las preguntas.
//crear una lista pa las palabras.
//métodos ejercicios y conteo de buebas y malas
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class saludos2 extends madrelec{
       

    public saludos2(){
		super();
    }

    public void addop(){
		//Agregar palabras al "diccionario" de español
        esp.add("Buenos días");
        esp.add("Gracias");
        esp.add("Buenas noches");
        esp.add("¿Cómo estas?");
        esp.add("Bien gracias");

        //Agregar palabras al "diccionario" de k'qchiquel
        kaq.add("Saqer");
        kaq.add("Matyox");
        kaq.add("Xo'qa");
        kaq.add("La ütz awäch?");
        kaq.add("Ütz matyox");
	}
}
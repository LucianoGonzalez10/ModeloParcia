import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;

public class Federacion<T extends Persona> {
    private TreeSet<T> listaFederacion = new TreeSet<>();

    // Método para contar jugadores
    public int contarJugadores() {
        int i = 0;
        for (T aux : listaFederacion) {
            if (aux instanceof Jugador) {
                i++;
            }
        }
        return i;
    }

    // Método para contar entrenadores
    public int contarEntrenadores() {
        int j = 0;
        for (T aux : listaFederacion) {
            if (aux instanceof Entrenador) {
                j++;
            }
        }
        return j;
    }

    public void agregar(T e) {
        try {
            if (e instanceof Jugador) {
                if (contarJugadores() >= 23) {
                    throw new ExcepcionAdd("Límite alcanzado para jugadores");
                } else {
                    listaFederacion.add(e);
                    System.out.println("Agregado el jugador.");
                }
            } else if (e instanceof Entrenador) {
                if (contarEntrenadores() >= 1) {
                    throw new ExcepcionAdd("Solo se permite un entrenador");
                } else {
                    listaFederacion.add(e);
                    System.out.println("Agregado el entrenador.");
                }
            } else {
                listaFederacion.add(e);
                System.out.println("Agregado.");
            }
        } catch (ExcepcionAdd x) {
            System.out.println(x.getMessage());
        }
    }

    public void cargarArchivo(File f){
        ObjectMapper mapa = new ObjectMapper();
        try{
            mapa.enable(SerializationFeature.INDENT_OUTPUT);
            mapa.writeValue(f, listaFederacion);
        }
        catch(IOException x){
            System.out.println(x.getMessage());
        }
    }

    public void bajarArchivo(File f){
        ObjectMapper mapa = new ObjectMapper();
        try{
            mapa.enable(SerializationFeature.INDENT_OUTPUT);
            listaFederacion = mapa.readValue(f, new TypeReference <TreeSet<T>>() {});
            System.out.println("El archivo se bajo correctamente");
        }
        catch(IOException x){
            System.out.println(x.getMessage());
        }
    }
}

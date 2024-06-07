import java.io.File;

public class index{
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel", "Messi", 34, 10, "Delantero");
        Jugador jugador2 = new Jugador("Kun", "Aguero", 30, 11, "Defensa");
        Jugador jugador3 = new Jugador("Mateo", "Ma", 24, 5, "Mediocampista");
        Jugador jugador4 = new Jugador("Lupo", "Messi", 34, 10, "Delantero");
        Jugador jugador5 = new Jugador("Dami", "Messi", 34, 10, "Delantero");
        Jugador jugador6 = new Jugador("Lucho", "Messi", 34, 10, "Delantero");
        Jugador jugador7 = new Jugador("Enzo", "Messi", 34, 10, "Delantero");
        Jugador jugador8 = new Jugador("Diego", "Messi", 34, 10, "Delantero");
        Jugador jugador9 = new Jugador("Carlos", "Messi", 34, 10, "Delantero");
        Jugador jugador10 = new Jugador("Andres", "Messi", 34, 10, "Delantero");
        Jugador jugador11 = new Jugador("Luchito", "Messi", 34, 10, "Delantero");
        Jugador jugador12 = new Jugador("Maranga", "Messi", 34, 10, "Delantero");
        Jugador jugador13 = new Jugador("Marangoni", "Messi", 34, 10, "Delantero");
        Jugador jugador14 = new Jugador("Romi", "Messi", 34, 10, "Delantero");
        Jugador jugador15 = new Jugador("Sofi", "Messi", 34, 10, "Delantero");
        Jugador jugador16 = new Jugador("Andru", "Messi", 34, 10, "Delantero");
        Jugador jugador17 = new Jugador("Vegeta", "Messi", 34, 10, "Delantero");
        Jugador jugador18 = new Jugador("Goku", "Messi", 34, 10, "Delantero");
        Jugador jugador19 = new Jugador("Jose", "Messi", 34, 10, "Delantero");
        Jugador jugador20 = new Jugador("Seba", "Messi", 34, 10, "Delantero");
        Jugador jugador21 = new Jugador("Vale", "Messi", 34, 10, "Delantero");
        Jugador jugador22 = new Jugador("Valen", "Messi", 34, 10, "Delantero");
        Jugador jugador23 = new Jugador("Vanoli", "Messi", 34, 10, "Delantero");
        Jugador jugador24 = new Jugador("Veron", "Messi", 34, 10, "Delantero");

        Entrenador entrenador = new Entrenador("Lionel", "Scaloni", 40, "Ofensivo", "Agresivo");
        Entrenador entrenador2 = new Entrenador("Diego", "Maradona", 50, "Defensivo", "Tranquilo");

        Masajista masajista1 = new Masajista("Jose", "Luis", 30, "Masajista", 10);
        Masajista masajista2 = new Masajista("Testa", "Luis", 30, "Masajista", 10);
        Masajista masajista3 = new Masajista("Juan", "Luis", 30, "Masajista", 10);

        Ayudante ayudante1 = new Ayudante("Hugo", "Cayetano", 12);
        Ayudante ayudante2 = new Ayudante("Pedro", "Cayetano", 12);
        Ayudante ayudante3 = new Ayudante("Roque", "Cayetano", 22);

        Federacion federacion = new Federacion();
        federacion.agregar(jugador1);
        federacion.agregar(jugador2);
        federacion.agregar(jugador3);
        federacion.agregar(jugador4);
        federacion.agregar(jugador5);
        federacion.agregar(jugador6);
        federacion.agregar(jugador7);
        federacion.agregar(jugador8);
        federacion.agregar(jugador9);
        federacion.agregar(jugador10);
        federacion.agregar(jugador11);
        federacion.agregar(jugador12);
        federacion.agregar(jugador13);
        federacion.agregar(jugador14);
        federacion.agregar(jugador15);
        federacion.agregar(jugador16);
        federacion.agregar(jugador17);
        federacion.agregar(jugador18);
        federacion.agregar(jugador19);
        federacion.agregar(jugador20);
        federacion.agregar(jugador21);
        federacion.agregar(jugador22);
        federacion.agregar(jugador23);
        federacion.agregar(jugador24);

        federacion.agregar(entrenador2);
        federacion.agregar(entrenador);

        federacion.agregar(masajista1);
        federacion.agregar(masajista2);
        federacion.agregar(masajista3);

        federacion.agregar(ayudante1);
        federacion.agregar(ayudante2);
        federacion.agregar(ayudante3);

        File f = new File("federacion.json");
        federacion.cargarArchivo(f);
        federacion.bajarArchivo(f);
    }
}
public class Entrenador extends Persona implements Jugable{
    String sistemaJuego;
    String estilo;

    Entrenador(String nombre, String apellido, int edad, String sistemaJuego, String estilo){
        super(nombre, apellido, edad);
        this.sistemaJuego = sistemaJuego;
        this.estilo = estilo;
    }

    Entrenador(){
    }

    @Override
    public void jugar(){
        System.out.println("Jugando...");
    }
    public String getEstilo() {
        return estilo;
    }
    public String getSistemaJuego() {
        return sistemaJuego;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public void setSistemaJuego(String sistemaJuego) {
        this.sistemaJuego = sistemaJuego;
    }

}

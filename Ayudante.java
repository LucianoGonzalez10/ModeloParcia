public class Ayudante extends Persona implements Jugable, Preparable{
    String metodologia;

    Ayudante(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    Ayudante(){
        
    }

    @Override
    public void jugar(){
        System.out.println("Jugando...");
    }

    @Override
    public void darEntrenamiento(){
        System.out.println("Entrenando...");
    }
    public String getMetodologia() {
        return metodologia;
    }
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

}
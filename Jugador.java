public class Jugador extends Persona implements Jugable {
    String puesto;
    int camiseta;

    Jugador(String nombre, String apellido, int edad, int camiseta, String puesto){
        super(nombre, apellido, edad);
        this.camiseta = camiseta;
        this.puesto = puesto;
    }

    Jugador(){

    }
    
    @Override
    public void jugar(){
        System.out.println("Jugando...");
    }
    public int getCamiseta() {
        return camiseta;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
public class Masajista extends Persona implements Asistible{
    String titulo;
    int aniosExp;

    Masajista(String nombre, String apellido, int edad, String titulo, int aniosExp){
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }

    Masajista(){

    }
    
    @Override
    public void darAsistencia(){
        System.out.println(" Presente! ");
    }
    public int getAniosExp() {
        return aniosExp;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
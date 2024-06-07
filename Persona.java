public abstract class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    Persona(){
        
    }
    @Override
    public int compareTo(Persona otra) {
        int nombreComparison = this.nombre.compareTo(otra.nombre);
        if (nombreComparison != 0) {
            return nombreComparison;
        }
        return Integer.compare(this.edad, otra.edad);
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

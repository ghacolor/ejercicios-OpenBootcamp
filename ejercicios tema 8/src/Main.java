public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(33);
        System.out.println(persona.getEdad());

        persona.setTelefono(662345123);
        System.out.println(persona.getTelefono());

        persona.setNombre("Gabi");
        System.out.println(persona.getNombre());




    }
}

class Persona{
    private int edad;
    private int telefono;
    private String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
        }

    public void setTelefono(int telefono){
        this.telefono = telefono;
        }

    public int getTelefono(){
        return this.telefono;
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        }

    public String getNombre(){
        return this.nombre;
        }




}
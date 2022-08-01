public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Gabi");
        System.out.println(cliente.getNombre());

        cliente.setEdad(33);
        System.out.println(cliente.getEdad());

        cliente.setTelefono(662183969);
        System.out.println(cliente.getTelefono());

        cliente.setCredito(9000000);
        System.out.println(cliente.getCredito());


    }

}

abstract class Persona{
    private int telefono;
    private int edad;
    private String nombre;

    public Persona(){
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }

class Trabajador extends Cliente{
        int salario;
}
}
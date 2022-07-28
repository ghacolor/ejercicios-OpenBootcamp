public class Main {
    public static void main(String[] args) {

    Coche miCoche = new Coche();
    miCoche.anadirPuerta();

    System.out.println(miCoche.puerta);

    }


}
class Coche{

    public int puerta = 4;

    public void anadirPuerta(){
        this.puerta++;
    }
}
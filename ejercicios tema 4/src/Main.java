public class Main {
    public static void main(String[] args) {
        int numeroIf = -1;
        int numeroWhile = 1;
        int numeroWhile2 = 2;
        int numeroFor = 0;
        String estacion = "Camaleon";

        if (numeroIf > 0){
            System.out.println("El número es positivo");
        }
        else if(numeroIf < 0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es 0");
        }


        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println(numeroWhile2);
            numeroWhile2++;
        }while(numeroWhile2 < 3);

        for(; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);

        }

        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;

            case "Invierno":
                System.out.println("Es invierno");
                break;

            case "Otoño":
                System.out.println("Es otoño");
                break;

            case "Primavera":
                System.out.println("Es primavera");
                break;

            default:
                System.out.println("Eso probablemente es una estación de metro");
        }



    }
}
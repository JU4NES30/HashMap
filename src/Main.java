import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el dato del jugador (1 para numero y 2 para nombre)\n");
        int  t;
        t = teclado.nextInt();

        Map<String, Integer>mapa1 = new HashMap<>();

        mapa1.put("Juan_sebastian", 1);
        mapa1.put("Johan", 2);
        mapa1.put("camilo", 3);
        mapa1.put("Mario", 4);
        mapa1.put("Manuel", 5);
        mapa1.put("Esteban", 6);
        mapa1.put("Juan ", 7);
        mapa1.put("Stiven", 8);
        mapa1.put("Dario", 9);
        mapa1.put("Nestor", 10);
        mapa1.put("Daniel", 11);

        switch (t){
            case 1:
                System.out.println("ingrese numero del jugador");
                int y = 0;
                y = teclado.nextInt();
                boolean verificacionN = mapa1.containsValue(y);

                if (verificacionN==true){
                    System.out.println("si es un jugador");
                }else {
                    System.out.println("No es un jugador");

                }
                break;

            case 2:
                System.out.println("Ingrese nombre de jugador");
                String s = "";
                s = teclado.next();

                boolean verificacion = mapa1.containsKey(s);
                if (verificacion==true){
                    System.out.println("Si esta en el equipo");
                }else {
                    System.out.println("No esta en el equipo");
                }
                break;

            default:
                System.out.println("ingrese una opcion valida");
        }
    }
}
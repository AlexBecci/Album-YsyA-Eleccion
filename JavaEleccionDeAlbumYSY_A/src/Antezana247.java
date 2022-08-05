
import java.util.Scanner;

public class Antezana247 extends Ysy_A {

    @Override
    public void album() {
        boolean eleccion = true;

        System.out.println("'Album Antezana247'\nCanciones :");
        System.out.println("1 : Bienvenida\n2 : Hidro\n3 : Vuelta a la luna\n4 : Amanecer\n5 : Enamorada del diablo\n6 : Linaje\n7 : Tragos fuertes\n8 : Muevelo");
        while (eleccion == true) {

            System.out.println("Elija un teman ingresando el valor del mismo: ");
            Scanner numScanner = new Scanner(System.in);
            int numCancion = Integer.parseInt(numScanner.nextLine());
            switch (numCancion) {
                case 1:
                    System.out.println("Reproduciendo Bienvenida...");
                    eleccion = false;
                    break;
                case 2:
                    System.out.println("Reproduciendo Hidro...");
                    eleccion = false;
                    break;
                case 3:
                    System.out.println("Reproduciendo Vuelta a la luna...");
                    eleccion = false;
                    break;
                case 4:
                    System.out.println("Reproduciendo Amanecer...");
                    eleccion = false;
                    break;
                case 5:
                    System.out.println("Reproduciendo Enamorada del diablo...");
                    eleccion = false;
                    break;
                case 6:
                    System.out.println("Reproduciendo Linaje...");
                    eleccion = false;
                    break;
                case 7:
                    System.out.println("Reproduciendo Tragos fuertes...");
                    eleccion = false;
                    break;
                case 8:
                    System.out.println("Reproduciendo Muevelo...");
                    eleccion = false;
                    break;
                default:
                    eleccion = true;
                    System.out.println("Numero Erroneo.\nPor favor ingrese un numero de la lista...\n");
            }
        }

    }

}

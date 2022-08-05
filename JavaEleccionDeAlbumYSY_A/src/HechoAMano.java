
import java.util.Scanner;

public class HechoAMano extends Ysy_A {

    @Override
    public void album() {
        boolean eleccion = true;

        System.out.println("'Album : Hecho a mano'\nCanciones :");
        System.out.println("1 : Desfilar mis penas\n2 : Bardos y verdades\n3 : Como tiene que ser\n4 : Calor\n5 : Full ice\n6 : Negociando por tiempo\n7 : Buenos Aires es amor\n8 : Donde las luces\n9 : Tantas Tentaciones\n10 : Alma\n11 : Para sacarmelo");
        while (eleccion == true) {

            System.out.println("Elija un teman ingresando el valor del mismo: ");
            Scanner numScanner = new Scanner(System.in);
            int numCancion = Integer.parseInt(numScanner.nextLine());
            switch (numCancion) {
                case 1:
                    System.out.println("Reproduciendo Desfilar mis penas...");
                    eleccion = false;
                    break;
                case 2:
                    System.out.println("Reproduciendo Bardos y verdades...");
                    eleccion = false;
                    break;
                case 3:
                    System.out.println("Reproduciendo Como tiene que ser...");
                    eleccion = false;
                    break;
                case 4:
                    System.out.println("Reproduciendo Calor...");
                    eleccion = false;
                    break;
                case 5:
                    System.out.println("Reproduciendo Full ice...");
                    eleccion = false;
                    break;
                case 6:
                    System.out.println("Reproduciendo Negociando por tiempo...");
                    eleccion = false;
                    break;
                case 7:
                    System.out.println("Reproduciendo Buenos Aires es amor...");
                    eleccion = false;
                    break;
                case 8:
                    System.out.println("Reproduciendo Donde las luces...");
                    eleccion = false;
                    break;
                case 9:
                    System.out.println("Reproduciendo Tantas Tentaciones...");
                    eleccion = false;
                    break;
                case 10:
                    System.out.println("Reproduciendo Alma...");
                    eleccion = false;
                    break;
                case 11:
                    System.out.println("Reproduciendo Para sacarmelo...");
                    eleccion = false;
                    break;
                default:
                    eleccion = true;
                    System.out.println("Numero Erroneo.\nPor favor ingrese un numero de la lista...\n");
            }
        }
    }

}

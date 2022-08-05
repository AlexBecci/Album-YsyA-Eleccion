
import java.util.Scanner;

public class MordiendoElBozal extends Ysy_A {

    @Override
    public void album() {
        boolean eleccion = true;

        System.out.println("'Album : Mordiendo el bozal'\nCanciones :");
        System.out.println("1 : LA PRIMERA VEZ\n2 : SACARTE TO\n3 : TARDE\n4 : SOBRE EL AGUA\n5 : PERDAMONO\n6 : MORDIENDO EL BOZAL");
        while (eleccion == true) {

            System.out.println("Elija un teman ingresando el valor del mismo: ");
            Scanner numScanner = new Scanner(System.in);
            int numCancion = Integer.parseInt(numScanner.nextLine());
            switch (numCancion) {
                case 1:
                    System.out.println("Reproduciendo LA PRIMERA VEZ...");
                    eleccion = false;
                    break;
                case 2:
                    System.out.println("Reproduciendo SACARTE TO...");
                    eleccion = false;
                    break;
                case 3:
                    System.out.println("Reproduciendo TARDE...");
                    eleccion = false;
                    break;
                case 4:
                    System.out.println("Reproduciendo SOBRE EL AGUA...");
                    eleccion = false;
                    break;
                case 5:
                    System.out.println("Reproduciendo PERDAMONO...");
                    eleccion = false;
                    break;
                case 6:
                    System.out.println("Reproduciendo MORDIENDO EL BOZAL...");
                    eleccion = false;
                    break;

                default:
                    eleccion = true;
                    System.out.println("Numero Erroneo.\nPor favor ingrese un numero de la lista...\n");
            }
        }
    }

}

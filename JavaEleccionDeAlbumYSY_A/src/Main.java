import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean eleccion = true;
        Antezana247 antezana247 = new Antezana247();
        HechoAMano hechoAMano = new HechoAMano();
        MordiendoElBozal mordiendoElBozal = new MordiendoElBozal();
        ElejirAlbum album = new ElejirAlbum();

        System.out.println("Elije el album ingresando el valor del mismo:\n1 : Antezana247\n2 : Hecho a mano\n3 : Mordiendo el bozal");
        while (eleccion == true) {
            Scanner scanNum = new Scanner(System.in);
            int numAlbum = Integer.parseInt(scanNum.nextLine());
            switch (numAlbum) {
                case 1:
                    album.elejirAlbum(antezana247);
                    eleccion = false;
                    break;
                case 2:
                    album.elejirAlbum(hechoAMano);
                    eleccion = false;
                    break;
                case 3:
                    album.elejirAlbum(mordiendoElBozal);
                    eleccion = false;
                    break;
                default:
                    eleccion = true;
                    System.out.println("Numero Erroneo.\nPor favor ingrese un numero de la lista...\n");
            }
        }

    }

}

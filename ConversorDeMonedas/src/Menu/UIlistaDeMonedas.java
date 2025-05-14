package Menu;

import java.util.Scanner;

public class UIlistaDeMonedas {


    public static void listaDeMonedas() {
        int menuCtrl = 0;

        System.out.println("\nPuedes ingresar cualquier tipo de moneda " +
                "usando su abreviatura\n" +
                "**************************************************\n");
        System.out.println("MXN\n" +
                "USD\n" +
                "EUR\n" +
                "etc\n");

        do{
            System.out.println("\n...presione 3 para regresar al menu principal\n");
            Scanner keyboardInput = new Scanner(System.in);
            menuCtrl = keyboardInput.nextInt();
            if (menuCtrl == 3){
                menuCtrl = 0;
            }
        }while(menuCtrl != 0);
    }
}

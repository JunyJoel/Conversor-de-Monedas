package Menu;

import Utilities.Calculos;
import javax.swing.text.Utilities;
import java.util.Scanner;

public class UImain {


    public static void ppalMenu() {
        System.out.println("**************************************************\n" +
                "Bienvenido a tu app para calcular cambio de monedas\n" +
                "1. Ver tipos de moneda\n" +
                "2. Calcular tipo de cambio\n" +
                "3. Salir\n" +
                "**************************************************");

        int menuCtrl = 0;

        do {
            Scanner keyboardInput = new Scanner(System.in);
            menuCtrl = keyboardInput.nextInt();

            switch (menuCtrl) {
                case 1:
                    UIlistaDeMonedas.listaDeMonedas();
                    UImain.ppalMenu();
                    break;
                case 2:
                    Calculos.tipoDeCambio();
                    UImain.ppalMenu();
                    menuCtrl = 0;
                    break;
                case 3:
                    System.out.println("Finalizando app...");
                    menuCtrl = 0;
                    break;
                default:
                    break;
            }
        }while(menuCtrl != 0);
    }

}

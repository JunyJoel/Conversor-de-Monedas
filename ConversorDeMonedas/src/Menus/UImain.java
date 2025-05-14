package Menus;

import Utilities.Calculos;

import java.util.Scanner;

public class UImain {


    public static void ppalMenu() {
        System.out.println("**************************************************\n" +
                "Menu principal\n" +
                "1. Ver tipos de moneda\n" +
                "2. Calcular tipo de cambio\n" +
                "3. Salir\n" +
                "**************************************************");

        int menuCtrl = 0;

        while(menuCtrl == 0) {
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
                    break;
                case 3:
                    System.out.println("Finalizando app...");
                    System.out.println(menuCtrl);
                    break;
            }
        }
    }

}

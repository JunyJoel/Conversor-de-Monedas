import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //APIRequest request = new APIRequest();
        //request.Request();

        String yourCurrencyString;
        String newCurrencyString;
        Double yourCurrencyDouble = 0.0;
        Double newCurrencyDouble;

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Escriba su moneda actual");
        yourCurrencyString = keyboardInput.nextLine();
        System.out.println("Escriba la cantidad de " + yourCurrencyString + " que quiere cambiar");
        yourCurrencyDouble = Double.parseDouble(keyboardInput.nextLine());

        System.out.println("Tienes "+ yourCurrencyDouble + " " + yourCurrencyString);

        if (yourCurrencyDouble != 0 ){
            System.out.println("Escriba la moneda a la que desea cambiar");
            newCurrencyString = keyboardInput.nextLine();

            System.out.println("Tipo de cambio " + yourCurrencyString + " a " + newCurrencyString);
        }



    }
}
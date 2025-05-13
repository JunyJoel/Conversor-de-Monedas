import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        APIRequest request = new APIRequest();
        CurrencyExchange conversion = request.Request();

        //CONVERSION
        APIRequest.newCurrencyDouble = APIRequest.yourCurrencyDouble * Double.valueOf(conversion.conversion_rate());

        System.out.println("Conversion rate: 1 " +APIRequest.yourCurrencyString + " = " + conversion.conversion_rate() + APIRequest.newCurrencyString);

        System.out.println("Tipo de cambio " + APIRequest.yourCurrencyString + " a " + APIRequest.newCurrencyString);

        System.out.println("Tienes " + APIRequest.newCurrencyDouble + " " + APIRequest.newCurrencyString + ".");
        //CurrencyExchange usrCurrencyExchange = new CurrencyExchange();
    }
}
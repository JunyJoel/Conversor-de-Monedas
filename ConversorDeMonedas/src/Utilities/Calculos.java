package Utilities;

public class Calculos {

    public static void tipoDeCambio() {
        //Utilities.APIRequest request = new Utilities.APIRequest();
        CurrencyExchange conversionRate = APIRequest.Request();

        //CONVERSION
        APIRequest.newCurrencyDouble = APIRequest.yourCurrencyDouble * Double.valueOf(conversionRate.conversion_rate());

        System.out.println("Conversion rate: 1 " +APIRequest.yourCurrencyString + " = " + conversionRate.conversion_rate() + APIRequest.newCurrencyString);

        System.out.println("Tipo de cambio " + APIRequest.yourCurrencyString + " a " + APIRequest.newCurrencyString);

        System.out.println("Tienes " + APIRequest.newCurrencyDouble + " " + APIRequest.newCurrencyString + ".");
        //Utilities.CurrencyExchange usrCurrencyExchange = new Utilities.CurrencyExchange();
    }
}

package Utilities;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class APIRequest {
    //ATRIBUTOS

    public static String yourCurrencyString;
    public static String newCurrencyString;
    public static Double yourCurrencyDouble;
    public static Double newCurrencyDouble;
    public static Double usrCurrencyExchange;

    //METHODS

    public static CurrencyExchange Request() {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Escriba su moneda actual");
        yourCurrencyString = keyboardInput.nextLine();
        System.out.println("Escriba la cantidad de " + yourCurrencyString + " que quiere cambiar");
        yourCurrencyDouble = Double.parseDouble(keyboardInput.nextLine());
        System.out.println("Escriba la moneda a la que desea cambiar");
        newCurrencyString = keyboardInput.nextLine();
        System.out.println("Tienes "+ yourCurrencyDouble + " " + yourCurrencyString);





        //String yourCurrencyString = "";
        //String newCurrencyString = "";

        String clave = "ef8ab751c770f0ce86ff7424";
        String uri = "https://v6.exchangerate-api.com/v6/";
        String direccion = uri + clave + "/pair/" + yourCurrencyString + "/" + newCurrencyString;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        {
            try {
                HttpResponse<String> response;
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), CurrencyExchange.class);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}

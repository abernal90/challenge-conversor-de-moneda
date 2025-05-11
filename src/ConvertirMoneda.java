import com.google.gson.Gson;

import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Clase convertidor de moneda
public class ConvertirMoneda {

    // Metodo para convertir la moneda apartir de la opción seleccionada del usuario y la cantidad que quiere convertir
    public BigDecimal convertir(OpcionMoneda opcionMoneda, BigDecimal canitdad) {
        // Se genera la dirección del API a consumir
        String diereccionCompleta = String.format(Constantes.DIRECCION, Constantes.API_KEY,
                opcionMoneda.getOrigen(), opcionMoneda.getDestino(), canitdad);
       // Creación del objeto URL para hacer la solicitud al API
        URI direccion = URI.create(diereccionCompleta);
        // Creación de objeto cliente y la solcitud a realizar al API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            // Se realiza la solicitud y obtenemos la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // Convertimos la respuesta a un objeto
            Moneda moneda = new Gson().fromJson(response.body(),Moneda.class);
            // Validamos si la respuesta fue exitosa
            if(Constantes.RESULTADO_EXITOSO.equals(moneda.result())){
                // Si la respuesta del API fue exitosa devolvemos la conversión
                return moneda.conversion_result();
            }else{
                // Si la respuesta del API no fue exitosa devolvemos un mensaje
                throw new RuntimeException("Ocurrio un problema al realizar la conversión.");
            }

        } catch (Exception e) {
            throw new RuntimeException("Ocurrio un problema al realizar la conversión.");
        }
    }

}

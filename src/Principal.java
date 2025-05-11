import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Variable para guardar la opción actual
        int opcion = 0;
        // Lector de datos en consola
        Scanner lectura = new Scanner(System.in);
        // Clase para convertidor de monedas
        ConvertirMoneda converdidor = new ConvertirMoneda();
        // Obtiene las opciones de conversión disponibles
        Map<Integer, OpcionMoneda> conversiones = OpcionesEnum.getConversiones();

        while(true) {
            // Mostrar el menú de opciones
            System.out.println(Constantes.MENSAJE);
            try {
                //Optiene la opción del usuario
                opcion = Integer.valueOf(lectura.nextLine());
                // Si la opción es igual a 7 saldra del conversor de monedas
                if(opcion == 7){
                    break;
                }
                // Se valida si existe la opción
                if (conversiones.containsKey(opcion)) {
                    // Muestra el mensaje para ingresar la cantidad a convertir
                    System.out.println(Constantes.MENSAJE_CONVERTIR);
                    // Obtiene la cantidad ingresada por el usuario
                    BigDecimal cantidad = new BigDecimal(lectura.nextLine());
                    // Se obtiene la opción de conversión de moneda a realizar
                    OpcionMoneda opcionMoneda = conversiones.get(opcion);
                    // Se obtiene el resultado de la conversión
                    BigDecimal resultado = converdidor.convertir(opcionMoneda, cantidad);
                    // Se genera el mensaje resultado de la conversión
                    String mensajeResultado = String.format(Constantes.MENSAJE_RESULTADO,
                            cantidad, opcionMoneda.getOrigen(), resultado, opcionMoneda.getDestino());
                    // Se muestra el mensaje de resultado de la conversión al usuario
                    System.out.println(mensajeResultado);

                } else {
                    System.out.println("Opción no encontrada ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no encontrada :" + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }

    }

}
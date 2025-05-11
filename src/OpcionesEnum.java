import java.util.LinkedHashMap;
import java.util.Map;

// Enum para declarar las opciones de conversión
public enum OpcionesEnum {
    // Declarar las opciones de moneda a convertir
    OPCION_UNO(1, new OpcionMoneda(Constantes.MONEDA_USD, Constantes.MONEDA_ARS)),
    OPCION_DOS(2, new OpcionMoneda(Constantes.MONEDA_ARS, Constantes.MONEDA_USD)),
    OPCION_TRES(3, new OpcionMoneda(Constantes.MONEDA_USD, Constantes.MONEDA_BRL)),
    OPCION_CUATRO(4, new OpcionMoneda(Constantes.MONEDA_BRL, Constantes.MONEDA_USD)),
    OPCION_CINCO(5, new OpcionMoneda(Constantes.MONEDA_USD, Constantes.MONEDA_MXN)),
    OPCION_SEIS(6, new OpcionMoneda(Constantes.MONEDA_MXN, Constantes.MONEDA_USD)),
    ;

    // Variable para almacenar las opciones de converción
    private static final Map<Integer, OpcionMoneda> conversiones = new LinkedHashMap<>();

    // llenado de opciones de conversión de moneda
    static {
        for (OpcionesEnum valorActual : OpcionesEnum.values()) {
            conversiones.put(valorActual.getOpcion(), valorActual.getOpcionMoneda());
        }
    }

    // declaracion de variables
    private final int opcion;
    private final OpcionMoneda opcionMoneda;

    // constructor
    OpcionesEnum(int opcion, OpcionMoneda opcionMoneda) {
        this.opcion = opcion;
        this.opcionMoneda = opcionMoneda;
    }

    // Metodo para acceder a la opción de menú
    public int getOpcion() {
        return opcion;
    }

    // obtien la opción de conservisión de moneda
    public OpcionMoneda getOpcionMoneda() {
        return opcionMoneda;
    }

    // metodo para acceder a las opciones de converción
    public static Map<Integer, OpcionMoneda> getConversiones() {
        return conversiones;
    }

}

import java.math.BigDecimal;

// Clase que representa la solicitud al API conversión de moneda
public record Moneda(String result, BigDecimal conversion_result) {
}

package pe.edu.cibertec.apirestoperaciones.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MensajeResponse {
    private String resultado;
}

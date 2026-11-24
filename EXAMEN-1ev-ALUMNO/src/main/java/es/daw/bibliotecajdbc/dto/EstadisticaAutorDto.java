package es.daw.bibliotecajdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Fila del informe de estadísticas: resultado de una consulta, no una entidad. */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadisticaAutorDto {

    private String nombre;
    private int numLibros;
    private int totalEjemplares;
}
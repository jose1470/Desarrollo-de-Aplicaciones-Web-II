package DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.dto;

import java.util.Date;

public record FilmEditDto(Integer filmId,
                          String title,
                          String description,
                          Integer releaseYear,
                          Integer rentalDuration,
                          Double rentalRate,
                          Integer length,
                          Double replacementCost,
                          String rating,
                          String specialFeatures,
                          Date lastUpdate) {
}

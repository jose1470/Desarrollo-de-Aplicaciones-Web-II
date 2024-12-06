package DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.dto;

import java.util.Date;

public record FilmCreateDto(Integer filmId,
                            String title,
                            String description,
                            Integer releaseYear,
                            Integer languageId,
                            Integer originalLanguageId,
                            Integer rentalDuration,
                            Double rentalRate,
                            Integer length,
                            Double replacementCost,
                            String rating,
                            String specialFeatures,
                            Date lastUpdate) {
}

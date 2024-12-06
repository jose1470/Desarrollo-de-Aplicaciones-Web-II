package DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.dto;

public record FilmDeleteDto(Integer filmId,
                            String title,
                            String description,
                            Integer releaseYear,
                            Integer languageId,
                            Integer rentalDuration,
                            Double rentalRate,
                            Integer length,
                            Double replacementCost,
                            String rating,
                            String specialFeatures) {
}

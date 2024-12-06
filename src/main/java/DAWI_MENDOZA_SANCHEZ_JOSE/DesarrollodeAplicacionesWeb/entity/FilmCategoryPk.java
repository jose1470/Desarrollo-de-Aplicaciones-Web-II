package DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategoryPk {

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "film_id")
    private Integer filmId;

}

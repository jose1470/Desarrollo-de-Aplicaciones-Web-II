package DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "inventory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventoryId;

    private Integer storeId;

    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;



}

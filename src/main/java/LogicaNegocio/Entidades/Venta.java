package LogicaNegocio.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.sql.Date;
import java.util.List;
@Entity
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venta extends EntidadBase{
    private int idVenta;
    private Date fechaVenta;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;
    private double precioTotal;
}

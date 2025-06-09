package LogicaNegocio.Entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;
@Entity
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Precio extends EntidadBase{
    private Date fechaDesde;
    private Date fechaHasta;
    private double valor;
    private Moneda moneda;
}

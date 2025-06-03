package LogicaNegocio.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private int idStock;
    private Proveedor proveedor;
    private Producto producto;
    private int cantidad;
}

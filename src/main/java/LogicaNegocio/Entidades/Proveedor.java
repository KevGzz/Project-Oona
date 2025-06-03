package LogicaNegocio.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {
    private String razonSocial;
    private String telefono;
    private String email;
}

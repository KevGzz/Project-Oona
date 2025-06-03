package LogicaAplicacion.DTOs;

public class ProveedorDTO {
    public String RazonSocial;
    public String Telefono;
    public String Email;
    public ProveedorDTO(String razonSocial, String telefono, String email) {
        RazonSocial = razonSocial;
        Telefono = telefono;
        Email = email;
    }
}

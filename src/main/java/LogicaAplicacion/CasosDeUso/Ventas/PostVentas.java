package LogicaAplicacion.CasosDeUso.Ventas;

import LogicaAplicacion.DTOs.VentaDTO;
import LogicaAplicacion.InterfacesCU.Ventas.IPostVentas;
import LogicaAplicacion.Mappers.VentaDTOMapper;
import Repository.IVentaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostVentas implements IPostVentas {

    private final IVentaRepo ventaRepo;

    @Override
    public void addVenta(VentaDTO venta) {
        this.ventaRepo.save(VentaDTOMapper.FromDTO(venta));
    }

    @Override
    public void updateVenta(VentaDTO venta) {
        java.sql.Date sqlDate = new java.sql.Date(venta.getFecha().getTime());
        String id = this.ventaRepo.findIdByFechaVenta(sqlDate);
        venta.setId(id);
        this.ventaRepo.save(VentaDTOMapper.FromDTO(venta));
    }
}

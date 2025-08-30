package LogicaAplicacion.CasosDeUso.Ventas;

import LogicaAplicacion.DTOs.VentaDTO;
import LogicaAplicacion.InterfacesCU.Ventas.IGetVentas;
import LogicaAplicacion.Mappers.ProductoDTOMapper;
import LogicaAplicacion.Mappers.VentaDTOMapper;
import LogicaNegocio.Entidades.Producto;
import LogicaNegocio.Entidades.Venta;
import MercadoLibre.ClienteMercadoLibre;
import Repository.IVentaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GetVentas implements IGetVentas {

    private final IVentaRepo ventaRepo;

    @Override
    public List<VentaDTO> getVentas() {
        List<VentaDTO> ventasdto = new ArrayList<>();
        List<Venta> ventas = ventaRepo.findAll();
        for (Venta v: ventas){
            ventasdto.add(VentaDTOMapper.toDTO(v));
        }
        return ventasdto;
    }

    @Override
    public VentaDTO getVenta(String id) {
        return null;
    }

    @Override
    public boolean existeVenta(Date fecha) {
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        return this.ventaRepo.existsByFechaVenta(sqlDate);
    }


}

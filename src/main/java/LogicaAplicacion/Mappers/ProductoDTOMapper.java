package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.CaracteristicaDTO;
import LogicaAplicacion.DTOs.PrecioDTO;
import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaNegocio.Entidades.Caracteristica;
import LogicaNegocio.Entidades.Precio;
import LogicaNegocio.Entidades.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDTOMapper {
    public static Producto FromDTO(ProductoDTO dto){
        List<Caracteristica> caracteristicasFromDTO = new ArrayList<>();
        List<Precio> preciosFromDTO = new ArrayList<>();
        for(CaracteristicaDTO c : dto.getCaracteristicas()){
            caracteristicasFromDTO.add(CaracteristicaDTOMapper.FromDTO(c));
        }
        for(PrecioDTO p : dto.getPrecios()){
            preciosFromDTO.add(PrecioDTOMapper.FromDTO(p));
        }
        return new Producto(ProveedorDTOMapper.FromDTO(dto.getProveedor()), etiquetasFromDTO, caracteristicasFromDTO, preciosFromDTO,
                dto.getNombre(), dto.getDescripcion());
    }
    public static ProductoDTO ToDTO(Producto producto){
        List<CaracteristicaDTO> caracteristicasToDTO = new ArrayList<>();
        List<PrecioDTO> preciosToDTO = new ArrayList<>();
        for(Caracteristica c : producto.getCaracteristicas()){
            caracteristicasToDTO.add(CaracteristicaDTOMapper.ToDTO(c));
        }
        for(Precio p : producto.getPrecios()){
            preciosToDTO.add(PrecioDTOMapper.ToDTO(p));
        }
        return new ProductoDTO(ProveedorDTOMapper.ToDTO(producto.getProveedor()), etiquetasToDTO, caracteristicasToDTO, preciosToDTO,
                producto.getNombre(), producto.getDescripcion());
    }
}

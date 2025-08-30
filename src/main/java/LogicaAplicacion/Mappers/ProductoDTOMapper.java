package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.CaracteristicaDTO;
import LogicaAplicacion.DTOs.PrecioDTO;
import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaNegocio.Entidades.Caracteristica;
import LogicaNegocio.Entidades.Precio;
import LogicaNegocio.Entidades.Producto;
import LogicaNegocio.Entidades.Proveedor;

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
        Proveedor proveedor = null;
        if(dto.getProveedor() != null){
            proveedor = ProveedorDTOMapper.FromDTO(dto.getProveedor());
        }
//        return new Producto(dto.getIdMeli(), proveedor, dto.getUrlFoto(), caracteristicasFromDTO, preciosFromDTO,
//                dto.getNombre(), dto.getDescripcion());
        return Producto.builder().id(dto.getId()).idMeli(dto.getIdMeli()).proveedor(proveedor)
                .urlFoto(dto.getUrlFoto()).caracteristicas(caracteristicasFromDTO)
                .precios(preciosFromDTO).nombre(dto.getNombre()).descripcion(dto.getDescripcion())
                .build();
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
        ProveedorDTO proveedor = null;
        if(producto.getProveedor() != null){
            proveedor = ProveedorDTOMapper.ToDTO(producto.getProveedor());
        }
        return new ProductoDTO(producto.getIdMeli(), proveedor,
                producto.getUrlFoto(), caracteristicasToDTO, preciosToDTO,
                producto.getNombre(), producto.getDescripcion());
    }
}

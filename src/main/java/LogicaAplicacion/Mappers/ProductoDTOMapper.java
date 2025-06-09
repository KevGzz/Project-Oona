package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.CaracteristicaDTO;
import LogicaAplicacion.DTOs.EtiquetaDTO;
import LogicaAplicacion.DTOs.PrecioDTO;
import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaNegocio.Entidades.Caracteristica;
import LogicaNegocio.Entidades.Etiqueta;
import LogicaNegocio.Entidades.Precio;
import LogicaNegocio.Entidades.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDTOMapper {
    public static Producto FromDTO(ProductoDTO dto){
        List<Etiqueta> etiquetasFromDTO = new ArrayList<>();
        List<Caracteristica> caracteristicasFromDTO = new ArrayList<>();
        List<Precio> preciosFromDTO = new ArrayList<>();
        for(EtiquetaDTO e : dto.Etiquetas){
            etiquetasFromDTO.add(EtiquetaDTOMapper.FromDTO(e));
        }
        for(CaracteristicaDTO c : dto.Caracteristicas){
            caracteristicasFromDTO.add(CaracteristicaDTOMapper.FromDTO(c));
        }
        for(PrecioDTO p : dto.Precios){
            preciosFromDTO.add(PrecioDTOMapper.FromDTO(p));
        }
        return new Producto(ProveedorDTOMapper.FromDTO(dto.Proveedor), etiquetasFromDTO, caracteristicasFromDTO, preciosFromDTO,
                dto.Nombre, dto.Descripcion);
    }
    public static ProductoDTO ToDTO(Producto producto){
        List<EtiquetaDTO> etiquetasToDTO = new ArrayList<>();
        List<CaracteristicaDTO> caracteristicasToDTO = new ArrayList<>();
        List<PrecioDTO> preciosToDTO = new ArrayList<>();
        for(Etiqueta e : producto.getEtiquetas()){
            etiquetasToDTO.add(EtiquetaDTOMapper.ToDTO(e));
        }
        for(Caracteristica c : producto.getCaracteristicas()){
            caracteristicasToDTO.add(CaracteristicaDTOMapper.ToDTO(c));
        }
        for(Precio p : producto.getPrecios()){
            preciosToDTO.add(PrecioDTOMapper.ToDTO(p));
        }
        return new ProductoDTO(producto.getId(), ProveedorDTOMapper.ToDTO(producto.getProveedor()), etiquetasToDTO, caracteristicasToDTO, preciosToDTO,
                producto.getNombre(), producto.getDescripcion());
    }
}

package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.ItemDTO;
import LogicaAplicacion.DTOs.VentaDTO;
import LogicaNegocio.Entidades.Item;
import LogicaNegocio.Entidades.Venta;

import java.util.ArrayList;
import java.util.List;

public class VentaDTOMapper {
    public static Venta FromDTO(VentaDTO dto){
        List<Item> itemsFromDTO = new ArrayList<>();
        for(ItemDTO i : dto.getItems()){
            itemsFromDTO.add(ItemDTOMapper.FromDTO(i));
        }
        return new Venta(dto.getId(), dto.getFecha(), itemsFromDTO, dto.getPrecioTotal());
    }
    public static VentaDTO toDTO(Venta venta) {
        List<ItemDTO> itemsToDTO = new ArrayList<>();
        for(Item i : venta.getItems()){
            itemsToDTO.add(ItemDTOMapper.ToDTO(i));
        }
        return new VentaDTO(venta.getIdVenta(), venta.getFechaVenta(), itemsToDTO, venta.getPrecioTotal());
    }
}

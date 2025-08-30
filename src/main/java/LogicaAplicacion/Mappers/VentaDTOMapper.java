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
        java.sql.Date sqlDate = new java.sql.Date(dto.getFecha().getTime());
        return Venta.builder().id(dto.getId()).fechaVenta(sqlDate).items(itemsFromDTO).build();
    }
    public static VentaDTO toDTO(Venta venta) {
        List<ItemDTO> itemsToDTO = new ArrayList<>();
        for(Item i : venta.getItems()){
            itemsToDTO.add(ItemDTOMapper.ToDTO(i));
        }
        return new VentaDTO(venta.getFechaVenta(), itemsToDTO, venta.getPrecioTotal());
    }
}

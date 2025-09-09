package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.ItemDTO;
import LogicaNegocio.Entidades.Item;

public class ItemDTOMapper {
    public static Item FromDTO(ItemDTO dto){
        return Item.builder().id(dto.getId()).producto(ProductoDTOMapper.FromDTO(dto.getProducto())).cantidad(dto.getCantidad()).build();
    }
    public static ItemDTO ToDTO(Item item){
        return ItemDTO.builder().id(item.getId()).producto(ProductoDTOMapper.ToDTO(item.getProducto())).cantidad(item.getCantidad()).build();
    }
}

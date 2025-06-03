package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.ItemDTO;
import LogicaNegocio.Entidades.Item;

public class ItemDTOMapper {
    public static Item FromDTO(ItemDTO dto){
        return new Item(ProductoDTOMapper.FromDTO(dto.Producto), dto.Cantidad);
    }
    public static ItemDTO ToDTO(Item item){
        return new ItemDTO(ProductoDTOMapper.ToDTO(item.getProducto()), item.getCantidad());
    }
}

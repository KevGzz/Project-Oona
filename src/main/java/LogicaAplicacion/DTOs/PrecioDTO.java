package LogicaAplicacion.DTOs;

import LogicaNegocio.Entidades.Moneda;

import java.util.Date;

public class PrecioDTO {
    public Date FechaDesde;
    public Date FechaHasta;
    public double Valor;
    public Moneda Moneda;
    public PrecioDTO(Date fechaDesde, Date fechaHasta, double valor, Moneda moneda) {
        FechaDesde = fechaDesde;
        FechaHasta = fechaHasta;
        Valor = valor;
        Moneda = moneda;
    }
}

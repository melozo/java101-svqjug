public class Precio {

    /*
        Tabla de precios por minuto
     */

    private double precioMinutoTarifaNormal;
    private double PrecioMinutoTarifaAmigo;
    private double precioFinal;

    public void setPrecioMinutoTarifaAmigo(double precioMinutoTarifaAmigo) {
        PrecioMinutoTarifaAmigo = precioMinutoTarifaAmigo;
    }

    public void setPrecioMinutoTarifaNormal(double precioMinutoTarifaNormal) {
        this.precioMinutoTarifaNormal = precioMinutoTarifaNormal;
    }

    public double getPrecioFinal(double minutos, int tarifa){
        return this.precioFinal = minutos * tarifa;
    }
}


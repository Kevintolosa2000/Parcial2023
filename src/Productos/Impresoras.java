package Productos;

public class Impresoras extends Informatica implements Descuentos {

    private Integer impresionesPM;

    public Impresoras() {
    }

    public Impresoras(String nombreProducto, double precioProducto, String nombreDelFabricante, Integer impresionesPM) {
        super(nombreProducto, precioProducto, nombreDelFabricante);
        this.impresionesPM = impresionesPM;
    }

    public Integer getImpresionesPM() {
        return impresionesPM;
    }

    public void setImpresionesPM(Integer impresionesPM) {
        this.impresionesPM = impresionesPM;
    }

    @Override
    public String toString() {
        return "Impresora=" + super.toString() +
                ", impresionesPM=" + impresionesPM;
    }

    @Override
    public double calcularDescuento(double descuento) {

        double porcentajeDescuento = descuento / 100;

        double descuentoCalculado = (this.getPrecioProducto() * porcentajeDescuento);

        double precioConDescuento = this.getPrecioProducto() - descuentoCalculado;

        return precioConDescuento;

    }
}


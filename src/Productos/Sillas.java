package Productos;

public class Sillas extends ProductosGeneral implements Descuentos {

    private int ruedas;


    public Sillas() {
    }


    public Sillas(String nombreProducto, double precioProducto, int ruedas) {
        super(nombreProducto, precioProducto);

        if (ruedas <= 0) {
            this.ruedas = 0;
        } else {
            this.ruedas = ruedas;
        }
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Sillas=" + super.toString() +
                ", cantidad de ruedas=" + ruedas;
    }

    @Override
    public double calcularDescuento(double descuento) {

        double porcentajeDescuento = descuento / 100;

        double descuentoCalculado = (this.getPrecioProducto() * porcentajeDescuento);

        double precioConDescuento = this.getPrecioProducto() - descuentoCalculado;

        return precioConDescuento;

    }

}
